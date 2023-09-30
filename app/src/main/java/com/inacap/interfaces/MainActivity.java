package com.inacap.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button BtnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VincularElementos();

        ActivarListener();
    }

    private void ActivarListener() {
        BtnSiguiente.setOnClickListener(this);

    }


    private void VincularElementos() {
        BtnSiguiente = (Button) findViewById(R.id.BotonConfirmar);
    }

    public void onClick(View view){
        Intent intentoResultado = new Intent(MainActivity.this, Pantalla_principal.class);
        startActivity(intentoResultado);
    }
}