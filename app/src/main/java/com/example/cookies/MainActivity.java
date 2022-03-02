package com.example.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_cook;
    Button btn_reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_cook = findViewById(R.id.btn_cook);
        btn_cook.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_cook) {
            ImageView img = findViewById(R.id.img_hungry);
            img.setImageResource(R.drawable.after_cookie);
            TextView txt_eat = findViewById(R.id.status_text_view);
            txt_eat.setText("I'm So full");
        }
    }

}