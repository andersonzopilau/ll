package com.media.tecinfo.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cadastro_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_);

        final EditText nom = findViewById(R.id.n);
        final EditText n = findViewById(R.id.nac);
        final EditText p = findViewById(R.id.p);
        final EditText k = findViewById(R.id.k);
        final EditText l = findViewById(R.id.l);

        TextView nome = findViewById(R.id.apnome);
        Button salvar = (Button) findViewById(R.id.btn_salvar);

        Intent intent = getIntent();
        String linguica = intent.getStringExtra("nome");
        nome.setText(linguica);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cadastro_Activity.this,Dados_Activity.class);
                intent.putExtra("nome",nom.getText().toString());
                intent.putExtra("nac",n.getText().toString());
                intent.putExtra("p",p.getText().toString());
                intent.putExtra("k",k.getText().toString());
                intent.putExtra("l",l.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}
