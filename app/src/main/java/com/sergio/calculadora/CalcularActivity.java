package com.sergio.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalcularActivity extends AppCompatActivity {
    private TextView textA;
    private TextView textB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calcular);

        textA = findViewById(R.id.textA);
        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);


        Button buttonDivide = findViewById(R.id.buttondivide);
        Button buttonMultiply = findViewById(R.id.buttonmultiplica);
        Button buttonMinus = findViewById(R.id.buttonresta);
        Button buttonPlus = findViewById(R.id.buttonsuma);
        Button buttonEquals = findViewById(R.id.buttonigual);
        Button buttonClear = findViewById(R.id.buttonlimpia);

        button0.setOnClickListener(view -> appendText("0"));
        button1.setOnClickListener(view -> appendText("1"));
        button2.setOnClickListener(view -> appendText("2"));
        button3.setOnClickListener(view -> appendText("3"));
        button4.setOnClickListener(view -> appendText("4"));
        button5.setOnClickListener(view -> appendText("5"));
        button6.setOnClickListener(view -> appendText("6"));
        button7.setOnClickListener(view -> appendText("7"));
        button8.setOnClickListener(view -> appendText("8"));
        button9.setOnClickListener(view -> appendText("9"));

        buttonDivide.setOnClickListener(view -> appendText("/"));
        buttonMultiply.setOnClickListener(view -> appendText("*"));
        buttonMinus.setOnClickListener(view -> appendText("-"));
        buttonPlus.setOnClickListener(view -> appendText("+"));
        buttonEquals.setOnClickListener(view -> appendText("="));
        buttonClear.setOnClickListener(view -> clearText());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void goBack(View view) {
        finish();
    }

    public void historial(View view){
        Intent intent = new Intent(this, HistorialActivity.class);
        startActivity(intent);
    }
    public void resta(){

    }
    public void suma(){

    }
    public void multiplica(){

    }
    public void divide(){

    }
    public void limpia(){

    }
    public void igual(){

    }
    private void appendText(String text) {
        Log.d("msg",textA.getText().toString());
        if(textA.getText().toString().equalsIgnoreCase("0")){
            textA.setText("");
        }
        textA.append(text);
    }

    private void clearText() {
        textB.setText("0");
    }
}