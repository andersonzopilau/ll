package com.media.tecinfo.afinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dados_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_);

        TextView nome = findViewById(R.id.n);
        TextView n = (TextView) findViewById(R.id.nac);
        TextView p = findViewById(R.id.p);
        TextView k = findViewById(R.id.k);
        TextView l = findViewById(R.id.l);

        Intent intent = getIntent();
        String nac = intent.getStringExtra("nome");
        String nv = intent.getStringExtra("nac");
        String pv = intent.getStringExtra("p");
        String kv = intent.getStringExtra("k");
        String lv = intent.getStringExtra("l");
        n.setText(nac);
        nome.setText(nv);
        p.setText(pv);
        k.setText(kv);
        l.setText(lv);


        Button opcoes = (Button) findViewById(R.id.btn_calcular);
        opcoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dados_Activity.this,MainActivity.class);
                startActivity(intent);

            }
        });

        Button home = (Button) findViewById(R.id.btn_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dados_Activity.this,MainActivity.class);
                startActivity(intent);

                finish();
            }
        });
    }
}
