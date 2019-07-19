package com.example.unitsconverter;

import android.R;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import static android.widget.Toast.LENGTH_LONG;
//amps to watts .....50 watts = 0.4167 amps
//horsepower to kilo watts.....1 mechnical horsepower = 745.7 watts
//amps to kilowatts
//watts to kilowatts .........1 watts = 0.001 kilowatts
//
public class wattsToHorsepower extends AppCompatActivity {
    EditText watts;
    TextView horsepower;
    Button btnvolt, back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watts_to_horsepower);
        horsepower = findViewById(R.id.horsepower);
        watts = findViewById(R.id.watts);
        btnvolt = findViewById(R.id.btn);
        back = findViewById(R.id.back_btn);
        btnvolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String wattstring = watts.getText().toString();
                int Swatts = Integer.parseInt(wattstring);
                float convertionValue = 745.7f;
                float result = (Swatts) / (convertionValue);

                if (TextUtils.isEmpty(wattstring))
                    //if (Swatts == Integer.parseInt(null))
                {
                    Toast.makeText(wattsToHorsepower.this, "enter an amount", LENGTH_LONG)
                            .show(); }
                            else {horsepower.setText(Float.toString(result) + "  Horsepower");}
            }});

    }
}





                /*



                int Samps = Integer.parseInt(amps.getText().toString());
                int convertionvalue = 200;
                int result2 = (Samps)/(Svolts);
                volts.setText(Integer.toString(result2)+"volts");
                // Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();
                // Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_LONG).show();


                // amps.setText(result);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(wattsToHorsepower.this,MainActivity.class);
                startActivity(i);
            }
        });*/



