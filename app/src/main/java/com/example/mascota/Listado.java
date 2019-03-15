package com.example.mascota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class Listado extends AppCompatActivity {

    private TextView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        lv = findViewById(R.id.list);

        OkHttpClient client = new OkHttpClient();

        String url = "https://vqmzn2zar0.execute-api.us-west-2.amazonaws.com/dev/animales";

        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    final String myResponse = response.body().string();

                    Listado.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            lv.setText(myResponse);
                        }
                    });
                }
            }
        });


    }
}
