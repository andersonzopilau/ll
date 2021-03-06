package com.media.tecinfo.afinal;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SaveLogin_Activity extends AppCompatActivity {
    SharedPreferences meusdados;
    public static final String mypreference = "call";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_login_);
        Button login = (Button) findViewById(R.id.btn_login);
        Button registrar = (Button) findViewById(R.id.btn_regist);
        final EditText email = findViewById(R.id.edt_email);
        final EditText senha = findViewById(R.id.edt_senha);
        meusdados = getSharedPreferences(mypreference, Context.MODE_PRIVATE);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String meuEmail = email.getText().toString();
                String minhaSenha = senha.getText().toString();
                if(meusdados.contains("email") && meusdados.contains("senha")){
                    if (meuEmail.equals(meusdados.getString("email", ""))
                            && minhaSenha.equals(meusdados.getString("senha", ""))){
                        Intent intent = new Intent(SaveLogin_Activity.this,MainActivity.class);
                        startActivity(intent);

                    }else{
                        Toast.makeText(getApplicationContext(),"email e senha invalidos", Toast.LENGTH_LONG).show();
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"não existe", Toast.LENGTH_LONG).show();
                }

            }
        });

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SaveLogin_Activity.this,Registro_Activity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}

