package com.example.calculadorapropinas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtMonto;
    private EditText txtPorcentaje;
    private TextView txtTotal;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Crear la Activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    // Inicializar componentes gráficos
    private void initComponents() {
        txtMonto = (EditText) findViewById(R.id.txtMonto);
        txtPorcentaje = (EditText) findViewById(R.id.txtPorcentaje);
        txtTotal = (TextView) findViewById(R.id.txtTotal);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        // Agregar escuchador de eventos al botón
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double monto = Double.parseDouble(txtMonto.getText().toString());
                double porcentaje = Double.parseDouble(txtPorcentaje.getText().toString()) / 100;
                double propina = monto * porcentaje;
                double total = monto + propina;

                // Mostrar porcentaje:
                txtTotal.setText(String.valueOf(total));
            }
        });
    }
}
