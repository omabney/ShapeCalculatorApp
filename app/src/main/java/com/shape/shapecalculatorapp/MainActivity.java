package com.shape.shapecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Reference to card views
    private CardView square, circle, triangle, rectangle, parellelogram, ellipse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        square = (CardView) findViewById(R.id.square);
        rectangle = (CardView) findViewById(R.id.rectangle);
        triangle = (CardView) findViewById(R.id.triangle);
        circle = (CardView) findViewById(R.id.circle);
        parellelogram = (CardView) findViewById(R.id.parallelogram);
        ellipse = (CardView) findViewById(R.id.ellipse);

        square.setOnClickListener(this);
        rectangle.setOnClickListener(this);
        triangle.setOnClickListener(this);
        circle.setOnClickListener(this);
        parellelogram.setOnClickListener(this);
        ellipse.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()){
            case R.id.square:
                intent = new Intent(this, Square.class);
                startActivity(intent);
                break;
            case R.id.rectangle:
                intent = new Intent(this, Rectangle.class);
                startActivity(intent);
                break;
            case R.id.circle:
                intent = new Intent(this, Circle.class);
                startActivity(intent);
                break;
            case R.id.ellipse:
                intent = new Intent(this, Ellipse.class);
                startActivity(intent);
                break;
            case R.id.parallelogram:
                intent = new Intent(this, Parallelogram.class);
                startActivity(intent);
                break;
            case R.id.triangle:
                intent = new Intent(this, Triangle.class);
                startActivity(intent);
                break;
        }
    }
}