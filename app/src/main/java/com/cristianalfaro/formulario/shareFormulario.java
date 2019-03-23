package com.cristianalfaro.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class shareFormulario extends AppCompatActivity {

    private TextView sName, sLastname, sCarnet, sEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_formulario);
        sName = findViewById(R.id.tv_nameShare);
        sLastname = findViewById(R.id.tv_lastnameShare);
        sCarnet = findViewById(R.id.tv_carnetShare);
        sEmail = findViewById(R.id.tv_emailShare);
        Intent sIntent = getIntent();
        if(sIntent != null){
            sName.setText(sIntent.getStringExtra("name"));
            sLastname.setText(sIntent.getStringExtra("lastname"));
            sCarnet.setText(sIntent.getStringExtra("carnet"));
            sEmail.setText(sIntent.getStringExtra("email"));
        }

    }
}
