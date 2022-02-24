package com.example.frecuenciacardiaca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
   private ImageView imagen;
   private ImageButton comenzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen = findViewById(R.id.imagen);
        Glide.with(getApplicationContext()).load(R.drawable.latido).into(imagen);
        comenzar = findViewById(R.id.ImgEmpezemos);
        comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dale = new Intent(getApplicationContext(),MainPage2.class);
                startActivity(dale);
            }
        });
    }
}