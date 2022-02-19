package com.shape.shapecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Parallelogram extends AppCompatActivity {

    //Reference to buttons and other layouts
    Button cal_area, cal_perimeter;
    EditText height, len_base, len_side;
    TextView value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelogram);

        cal_area = (Button) findViewById(R.id.submit_area);
        cal_perimeter = (Button) findViewById(R.id.submit_perimeter);
        height = (EditText) findViewById(R.id.parallelogram_height);
        len_base = (EditText) findViewById(R.id.parallelogram_base);
        len_side = (EditText) findViewById(R.id.parallelogram_side);
        value = (TextView) findViewById(R.id.value);

        // Listening to area button to calculate the area
        cal_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double p_height, p_base;
                Double area;
                try{
                    p_height = Double.parseDouble(height.getText().toString());
                    p_base = Double.parseDouble(len_base.getText().toString());
                    area = p_base * p_height;
                    value.setText("Area = "+area);
                }catch(Exception e){
                    Toast.makeText(Parallelogram.this, "Error: "+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Listening to perimeter button to calculate the perimeter
        cal_perimeter.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double p_base, p_side;
                Double perimeter;
                try{
                    p_base = Double.parseDouble(len_base.getText().toString());
                    p_side = Double.parseDouble(len_side.getText().toString());
                    perimeter = 2* (p_base + p_side);
                    value.setText("Perimeter = "+perimeter);
                }catch (Exception e){
                    Toast.makeText(Parallelogram.this, "Error: "+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        }));
    }
}