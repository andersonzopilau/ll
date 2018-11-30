package com.media.tecinfo.afinal;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Media_Activity extends AppCompatActivity {
    private double valor1 = 0;
    private double valor2 = 0;
    private double valor3 = 0;
    private double valor4 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_);

        final TextView result = (TextView) findViewById(R.id.result);
        final EditText n1 = (EditText) findViewById(R.id.n1);
        final EditText n2 = (EditText) findViewById(R.id.n2);
        final EditText n3 = (EditText) findViewById(R.id.n3);
        final EditText n4 = (EditText) findViewById(R.id.n4);

        final Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Double.parseDouble(n1.getText().toString());
                valor2 = Double.parseDouble(n2.getText().toString());
                valor3 = Double.parseDouble(n3.getText().toString());
                valor4 = Double.parseDouble(n4.getText().toString());
                result.setText(""+(valor1+valor2+valor3+valor4)/4);

            }
        });

    }
}
