package com.sergio.calculadora;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void inidicaciones(View view){
        Intent intent = new Intent(this, IndicacionActivity.class);
        startActivity(intent);
    }
    public void calcular(View view){
        Intent intent = new Intent(this, CalcularActivity.class);
        startActivity(intent);
    }
    public void cambiarColor(View view){
        TextView textView = (TextView) view;
        int currentColor = textView.getCurrentTextColor();
        int newColor;
        if (currentColor == Color.BLUE) {
            newColor = Color.GREEN;
        } else if (currentColor == Color.GREEN) {
            newColor = Color.RED;
        } else {
            newColor = Color.BLUE;
        }
        textView.setTextColor(newColor);
    }
}