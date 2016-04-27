package com.example.iniciaractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Enviar mensaje
    public void sendMessage(View v) {
        Intent intent = new Intent(this, ShowTextActivity.class);
        EditText txtMessage = (EditText) findViewById(R.id.txtMessage);
        String message = txtMessage.getText().toString();

        // Agregar mensaje al Intent
        intent.putExtra("MiMensaje", message);
        startActivity(intent);
    }
}
