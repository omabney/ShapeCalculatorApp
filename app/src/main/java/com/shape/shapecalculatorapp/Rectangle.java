package com.shape.shapecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Rectangle extends AppCompatActivity {

    //Reference to buttons and other layouts
    Button cal_area, cal_perimeter;
    EditText length, breadth;
    TextView value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        cal_area = (Button) findViewById(R.id.submit_area);
        cal_perimeter = (Button) findViewById(R.id.submit_perimeter);
        length = (EditText) findViewById(R.id.rectangle_length);
        breadth = (EditText) findViewById(R.id.rectangle_breadth);
        value = (TextView) findViewById(R.id.value);

        // Listening to area button to calculate the area
        cal_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double r_length, r_breadth;
                Double area;
                try{
                    r_length = Double.parseDouble(length.getText().toString());
                    r_breadth = Double.parseDouble(breadth.getText().toString());
                    area = r_length * r_breadth;
                    value.setText("Area = "+area);
                }catch (Exception e){
                    Toast.makeText(Rectangle.this, "Error:"+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Listening to perimeter button to calculate the perimeter
        cal_perimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double r_length, r_breadth;
                Double perimeter;
                try{
                    r_length = Double.parseDouble(length.getText().toString());
                    r_breadth = Double.parseDouble(breadth.getText().toString());
                    perimeter = 2*(r_length + r_breadth);
                    value.setText("Perimeter = "+perimeter);
                }catch (Exception e){
                    // Printing the error message as a Toast
                    Toast.makeText(Rectangle.this, "Error:"+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}