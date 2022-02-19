package com.shape.shapecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Circle extends AppCompatActivity {

    //Reference to buttons and other layouts
    Button cal_area, cal_perimeter;
    EditText radius;
    TextView value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        cal_area = (Button) findViewById(R.id.submit_area);
        cal_perimeter = (Button) findViewById(R.id.submit_perimeter);
        radius = (EditText) findViewById(R.id.circle_radius);
        value = (TextView) findViewById(R.id.value);

        // Listening to area button to calculate the area
        cal_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double c_radius;
                Double s_area;
                try{
                    c_radius = Double.parseDouble(radius.getText().toString());
                    s_area = Math.PI*c_radius * c_radius;
                    value.setText("Area = "+s_area);
                }catch (Exception e){
                    Toast.makeText(Circle.this, "Error: "+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Listening to perimeter button to calculate the perimeter
        cal_perimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double c_radius;
                Double s_perimeter;
                try{
                    c_radius = Double.parseDouble(radius.getText().toString());
                    s_perimeter = 2 * Math.PI * c_radius;
                    value.setText("Perimeter = "+s_perimeter);
                }catch (Exception e){
                    Toast.makeText(Circle.this, "Error: "+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}