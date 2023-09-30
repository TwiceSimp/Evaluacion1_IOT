package com.inacap.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pantalla_principal extends AppCompatActivity {

    ImageButton BtnVolver;
    Button BtnDesayuno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);


        VincularElementos();

        ActivarListener();
    }

    private void ActivarListener() {
        BtnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentoResultado = new Intent(Pantalla_principal.this, MainActivity.class);
                startActivity(intentoResultado);
            }
        });
        BtnDesayuno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentoResultado = new Intent(Pantalla_principal.this, vista_desayuno.class);
                startActivity(intentoResultado);
            }
        });
    }

    private void VincularElementos() {

        BtnVolver = (ImageButton) findViewById(R.id.btnVolver);
        BtnDesayuno = (Button) findViewById(R.id.btnDesayuno);
    }

}