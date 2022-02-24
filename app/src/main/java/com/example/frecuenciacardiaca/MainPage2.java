package com.example.frecuenciacardiaca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainPage2 extends AppCompatActivity {
    private ImageView imagenn;
    private ImageButton Calcular;
    private EditText ed;
    private TextView res;
    int edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page2);
        imagenn = findViewById(R.id.ImgImage2);
        Glide.with(getApplicationContext()).load(R.drawable.latido_2).into(imagenn);
        ed = findViewById(R.id.EdtEdad);
        res = findViewById(R.id.TxtResultado);
        Calcular = findViewById(R.id.ImgCalcular);
        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            res.setText("");
                if (ed.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),"NO HAS INGRESADO TU EDAD",Toast.LENGTH_LONG).show();
                }
                else{
                    calculo();

                }
            }
        });
    }

    public void calculo(){
        edad = Integer.parseInt(ed.getText().toString());

         Double resultado = 207 - (0.7019864*edad);
          res.setText( "" + Math.round((resultado)) +" LPM");
          ed.getText().clear();



    }
}