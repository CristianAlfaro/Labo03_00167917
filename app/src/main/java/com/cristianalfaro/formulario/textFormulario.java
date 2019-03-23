package com.cristianalfaro.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class textFormulario extends AppCompatActivity {

    private TextView tName, tLastname, tCarnet, tEmail;
    private Button tShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_formulario);
        tName = findViewById(R.id.tv_name);
        tLastname = findViewById(R.id.tv_lastname);
        tCarnet = findViewById(R.id.tv_carnet);
        tEmail = findViewById(R.id.tv_email);
        Intent mIntent = getIntent();
        if( mIntent != null){
            tName.setText("Name: " + mIntent.getStringExtra("name"));
            tLastname.setText("Lastname: " +mIntent.getStringExtra("lastname"));
            tCarnet.setText("Carnet: " +mIntent.getStringExtra("carnet"));
            tEmail.setText("E-mail: " +mIntent.getStringExtra("email"));
        }

        tShare = findViewById(R.id.btn_share);
        tShare.setOnClickListener(v ->{
            String name= tName.getText().toString();
            String lastname = tLastname.getText().toString();
            String carnet = tCarnet.getText().toString();
            String email = tEmail.getText().toString();
            Intent tIntent = new Intent();
            tIntent.setType("text/plain");
            tIntent.setAction(Intent.ACTION_SEND);
            tIntent.putExtra("name", name);
            tIntent.putExtra("lastname", lastname);
            tIntent.putExtra("carnet", carnet);
            tIntent.putExtra("email", email);
            startActivity(tIntent);
        });
    }
}
