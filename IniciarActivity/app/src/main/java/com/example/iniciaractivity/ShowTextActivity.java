package com.example.iniciaractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ShowTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text);

        // Obtener el intent y los valores que contiene
        Intent intent = getIntent();
        String message = intent.getStringExtra("MiMensaje");

        // Mostrar texto en la interfaz
        TextView txtReceivedMessage = (TextView) findViewById(R.id.txtReceivedMessage);
        txtReceivedMessage.setText(message);
    }
}
