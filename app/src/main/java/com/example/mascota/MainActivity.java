package com.example.mascota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Go to menu
    public void goToMenu(View view) {
        Intent intent2 = new Intent(this, Menu.class);
        startActivity(intent2);
    }
}
