package com.example.frecuenciacardiaca;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class Integrantes extends AppCompatActivity {
VideoView video;
    private ImageView atras;
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integrantes);
        atras = findViewById(androidx.appcompat.R.id.icon);
        texto= findViewById(R.id.Texto);
        texto.setText("Integrantes");
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        video = findViewById(R.id.vidio);
        video.setVideoURI((Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video)));
        video.start();
    }
}