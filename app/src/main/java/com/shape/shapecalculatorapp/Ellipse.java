package com.shape.shapecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ellipse extends AppCompatActivity {

    //Reference to buttons and other layouts
    Button cal_area, cal_perimeter;
    EditText min_axis, maj_axis;
    TextView value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ellipse);

        cal_area = (Button) findViewById(R.id.submit_area);
        cal_perimeter = (Button) findViewById(R.id.submit_perimeter);
        min_axis = (EditText) findViewById(R.id.minor_axis);
        maj_axis = (EditText) findViewById(R.id.major_axis);
        value = (TextView) findViewById(R.id.value);

        // Listening to area button to calculate the area
        cal_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double e_min_axis, e_maj_axis;
                Double s_area;
                try{
                    e_min_axis = Double.parseDouble(min_axis.getText().toString());
                    e_maj_axis = Double.parseDouble(maj_axis.getText().toString());
                    s_area = Math.PI*e_min_axis * e_maj_axis*0.25;
                    value.setText("Area = "+s_area);
                }catch (Exception e){
                    Toast.makeText(Ellipse.this, "Error: "+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Listening to perimeter button to calculate the perimeter
        cal_perimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double e_min_axis, e_maj_axis;
                Double s_perimeter;
                try{
                    e_min_axis = Double.parseDouble(min_axis.getText().toString());
                    e_maj_axis = Double.parseDouble(maj_axis.getText().toString());
                    s_perimeter = Math.PI * (e_min_axis*0.5 + e_maj_axis*.5);
                    value.setText("Perimeter = "+s_perimeter);
                }catch (Exception e){
                    Toast.makeText(Ellipse.this, "Error: "+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}