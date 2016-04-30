package com.example.iniciaractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    public static String MESSAGE_VARIABLE = "com.example.iniciaractivity.MainActivity.MiMensaje";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Enviar mensaje
    public void sendMessage(View v) {
        EditText txtMessage = (EditText) findViewById(R.id.txtMessage);
        String message = txtMessage.getText().toString();

        Intent intent = new Intent(this, ShowTextActivity.class);

        // Agregar mensaje al Intent
        intent.putExtra(MESSAGE_VARIABLE, message);
        startActivity(intent);
    }
}
