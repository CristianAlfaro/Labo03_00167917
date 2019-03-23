package com.cristianalfaro.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mName, mLastname, mCarnet, mEmail;
    private Button mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = findViewById(R.id.et_name);
        mLastname = findViewById(R.id.et_lastname);
        mCarnet = findViewById(R.id.et_carnet);
        mEmail = findViewById(R.id.et_email);
        mNext = findViewById(R.id.btn_next);
        mNext.setOnClickListener(v -> {
            String name = mName.getText().toString();
            String lastname = mLastname.getText().toString();
            String carnet = mCarnet.getText().toString();
            String email = mEmail.getText().toString();
            Intent mIntent = new Intent(MainActivity.this, textFormulario.class);
            mIntent.putExtra("name",name);
            mIntent.putExtra("lastname",lastname);
            mIntent.putExtra("carnet",carnet);
            mIntent.putExtra("email",email);
            startActivity(mIntent);

        });
    }
}
