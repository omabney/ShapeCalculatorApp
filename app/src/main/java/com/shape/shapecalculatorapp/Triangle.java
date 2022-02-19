package com.shape.shapecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Triangle extends AppCompatActivity {

    //Reference to buttons and other layouts
    Button cal_area, cal_perimeter;
    EditText length_A, length_B, base, height;
    TextView value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        cal_area = (Button) findViewById(R.id.submit_area);
        cal_perimeter = (Button)  findViewById(R.id.submit_perimeter);
        length_A = (EditText) findViewById(R.id.triangle_sideA);
        length_B = (EditText) findViewById(R.id.triangle_sideB);
        base = (EditText) findViewById(R.id.triangle_sideC);
        height = (EditText)  findViewById(R.id.triangle_height);
        value = (TextView) findViewById(R.id.value);

        // Listening to area button to calculate the area
        cal_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double t_height, t_base;
                Double area;
                try {
                    t_height = Double.parseDouble(height.getText().toString());
                    t_base = Double.parseDouble((base.getText().toString()));
                    area = 0.5 * t_base * t_height;
                    value.setText("Area = " + area);
                }catch (Exception e) {
                    Toast.makeText(Triangle.this, "Error:" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Listening to perimeter button to calculate the perimeter
        cal_perimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double t_sideA, t_sideB , t_base;
                Double perimeter;
                try{
                    t_sideA = Double.parseDouble(length_A.getText().toString());
                    t_sideB = Double.parseDouble(length_B.getText().toString());
                    t_base = Double.parseDouble((base.getText().toString()));
                    perimeter = t_sideA + t_sideB + t_base;
                    value.setText("Perimeter = "+perimeter);
                }catch (Exception e){
                    Toast.makeText(Triangle.this,"Error:"+e.getMessage(),Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}