package com.media.tecinfo.afinal;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Chamada_Activity extends AppCompatActivity {
    String memoria = "";
    TextView txtdisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chamada_);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button home = (Button) findViewById(R.id.btn_home);
        txtdisplay = findViewById(R.id.txtD);
        final Button del = (Button) findViewById(R.id.btn_C);

        final Button btn0 = (Button) findViewById(R.id.btn_0);
        final Button btnaster = (Button) findViewById(R.id.btn_aster);
        final Button btn1 = (Button) findViewById(R.id.btn_1);
        final Button btn2 = (Button) findViewById(R.id.btn_2);
        final Button btn3 = (Button) findViewById(R.id.btn_3);
        final Button btn4 = (Button) findViewById(R.id.btn_4);
        final Button btn5 = (Button) findViewById(R.id.btn_5);
        final Button btn6 = (Button) findViewById(R.id.btn_6);
        final Button btn7 = (Button) findViewById(R.id.btn_7);
        final Button btn8 = (Button) findViewById(R.id.btn_8);
        final Button btn9 = (Button) findViewById(R.id.btn_9);
        final Button btnhash = (Button) findViewById(R.id.btn_hash);
        final Button ligar = (Button) findViewById(R.id.btn_ligar);



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chamada_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        btn0.setOnClickListener(myListener);
        btn1.setOnClickListener(myListener);
        btn2.setOnClickListener(myListener);
        btn3.setOnClickListener(myListener);
        btn4.setOnClickListener(myListener);
        btn5.setOnClickListener(myListener);
        btn6.setOnClickListener(myListener);
        btn7.setOnClickListener(myListener);
        btn8.setOnClickListener(myListener);
        btn9.setOnClickListener(myListener);
        btnhash.setOnClickListener(myListener);
        btnaster.setOnClickListener(myListener);
        del.setOnClickListener(myListener);
        ligar.setOnClickListener(myListener);





    }
    private View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn_0:
                    setdisplayText("0");
                    break;
                case R.id.btn_1:
                    setdisplayText("1");
                    break;
                case R.id.btn_2:
                    setdisplayText("2");
                    break;
                case R.id.btn_3:
                    setdisplayText("3");
                    break;
                case R.id.btn_4:
                    setdisplayText("4");
                    break;
                case R.id.btn_5:
                    setdisplayText("5");
                    break;
                case R.id.btn_6:
                    setdisplayText("6");
                    break;
                case R.id.btn_7:
                    setdisplayText("7");
                    break;
                case R.id.btn_8:
                    setdisplayText("8");
                    break;
                case R.id.btn_9:
                    setdisplayText("9");
                    break;
                case R.id.btn_aster:
                    setdisplayText("*");
                    break;
                case R.id.btn_hash:
                    setdisplayText("#");
                    break;

                case R.id.btn_C:
                    if (memoria.length() > 0){
                        memoria = memoria.substring(0, memoria.length() - 1);
                        txtdisplay.setText(memoria);
                    }
                    break;
                case R.id.btn_ligar:
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + memoria));

                    if (ActivityCompat.checkSelfPermission(Chamada_Activity.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                        ActivityCompat.requestPermissions(Chamada_Activity.this, new String[]
                                {Manifest.permission.CALL_PHONE}, 0);

                    }
                    startActivity(intent);
                    break;



            }

        }
    };

    private void setdisplayText(String valor) {
        memoria = memoria + valor;
        txtdisplay.setText(memoria);
    }
}
