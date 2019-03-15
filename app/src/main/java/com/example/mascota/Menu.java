package com.example.mascota;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    // Go to reportar
    public void goToReportar(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Reportar.class);
        startActivity(intent);
    }

    // Go to Listado
    public void goToListado(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Listado.class);
        startActivity(intent);
    }

    //Go to MapsActivity
    public void goToMapsActivity(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

}
