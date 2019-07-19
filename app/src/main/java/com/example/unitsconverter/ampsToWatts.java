package com.example.unitsconverter;

import android.R;
import android.app.ProgressDialog;
import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ampsToWatts extends AppCompatActivity {
    Button back, convert;
    EditText amps;
    TextView watts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amps_to_watts);
        back = findViewById(R.id.back);
        convert = findViewById(R.id.ampsToWatts);
        amps = findViewById(R.id.amps);
        watts = findViewById(R.id.watts);



        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float Samps  = Float.parseFloat(amps.getText().toString());
                int convertionvalue = 240;
                final float answer = Samps*convertionvalue;

                watts.setText(Float.toString(answer) + "  watts");}

        });




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ampsToWatts.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}
