package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9, numero0, igual, sumar, dividir, restar, multiplicar, reset, delete;
    TextView resultado;

    String currentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        numero3 = findViewById(R.id.numero3);
        numero4 = findViewById(R.id.numero4);
        numero5 = findViewById(R.id.numero5);
        numero6 = findViewById(R.id.numero6);
        numero7 = findViewById(R.id.numero7);
        numero8 = findViewById(R.id.numero8);
        numero9 = findViewById(R.id.numero9);
        numero0 = findViewById(R.id.numero0);

        sumar = findViewById(R.id.sumar);
        multiplicar = findViewById(R.id.multiplicar);
        dividir = findViewById(R.id.dividir);
        restar = findViewById(R.id.restar);

        resultado = findViewById(R.id.resultado);
        igual = findViewById(R.id.igual);
        reset = findViewById(R.id.reset);
        delete = findViewById(R.id.delete);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("+");
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("X");
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("/");
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("-");
            }
        });

        numero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("1");
            }
        });

        numero2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("2");
            }
        });

        numero3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("3");
            }
        });

        numero4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("4");
            }
        });

        numero5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("5");
            }
        });

        numero6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("6");
            }
        });

        numero7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("7");
            }
        });

        numero8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("8");
            }
        });

        numero9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("9");
            }
        });

        numero0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("0");
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarOperacion();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("");
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentText = currentText.substring(0, currentText.length() - 1);
                resultado.setText(currentText);
            }
        });
    }

    private void appendNumber(String number) {
        currentText = resultado.getText().toString();
        currentText += number;
        resultado.setText(currentText);
    }

    private void realizarSuma() {
        currentText = resultado.getText().toString();
        String[] numeros = currentText.split("\\+");
        if (numeros.length == 2) {
            int num1 = Integer.parseInt(numeros[0]);
            int num2 = Integer.parseInt(numeros[1]);
            String resultadoSuma = String.valueOf(num1 + num2);
            resultado.setText(resultadoSuma);
        }
    }

    private void realizarMultiplicacion() {
        currentText = resultado.getText().toString();
        String[] numeros = currentText.split("X");
        if (numeros.length == 2) {
            int num1 = Integer.parseInt(numeros[0]);
            int num2 = Integer.parseInt(numeros[1]);
            String resultadoMultiplicacion = String.valueOf(num1 * num2);
            resultado.setText(resultadoMultiplicacion);
        }
    }

    private void realizarResta() {
        currentText = resultado.getText().toString();
        String[] numeros = currentText.split("-");
        if (numeros.length == 2) {
            int num1 = Integer.parseInt(numeros[0]);
            int num2 = Integer.parseInt(numeros[1]);
            String resultadoResta = String.valueOf(num1 - num2);
            resultado.setText(resultadoResta);
        }
    }

    private void realizarDivision() {
        currentText = resultado.getText().toString();
        String[] numeros = currentText.split("/");
        if (numeros.length == 2) {
            int num1 = Integer.parseInt(numeros[0]);
            int num2 = Integer.parseInt(numeros[1]);
            String resultadoDivision = String.valueOf(num1 / num2);
            resultado.setText(resultadoDivision);
        }
    }

    private void realizarOperacion() {
        currentText = resultado.getText().toString();

        if (currentText.contains("+"))
            realizarSuma();
        else if(currentText.contains("X"))
            realizarMultiplicacion();
        else if(currentText.contains("-"))
            realizarResta();
        else if(currentText.contains("/"))
            realizarDivision();
    }
}