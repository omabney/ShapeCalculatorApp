package com.shape.shapecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Square extends AppCompatActivity {

    //Reference to buttons and other layouts
    Button cal_area, cal_perimeter;
    EditText length;
    TextView  value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        cal_area = (Button) findViewById(R.id.submit_area);
        cal_perimeter = (Button) findViewById(R.id.submit_perimeter);
        length = (EditText) findViewById(R.id.square_length);
        value = (TextView) findViewById(R.id.value);

        // Listening to area button to calculate the area
        cal_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double s_side;
                Double s_area;
                try{
                    s_side = Double.parseDouble(length.getText().toString());
                    s_area = s_side * s_side;
                    value.setText("Area = "+s_area);
                }catch (Exception e){
                    Toast.makeText(Square.this, "Error: "+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Listening to perimeter button to calculate the perimeter
        cal_perimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double s_side;
                Double s_perimeter;
                try{
                    s_side = Double.parseDouble(length.getText().toString());
                    s_perimeter = 4 * s_side;
                    value.setText("Perimeter = "+s_perimeter);
                }catch (Exception e){
                    Toast.makeText(Square.this, "Error: "+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}