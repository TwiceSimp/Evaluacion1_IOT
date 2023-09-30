package com.inacap.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class vista_desayuno extends AppCompatActivity {

    ImageButton BtnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_desayuno);

        VincularElementos();

        ActivarListener();
    }

    private void ActivarListener() {
        BtnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentoResultado = new Intent(vista_desayuno.this, Pantalla_principal.class);
                startActivity(intentoResultado);
            }
        });
    }

    private void VincularElementos() {
        BtnVolver = (ImageButton) findViewById(R.id.btnVolver);
    }
}