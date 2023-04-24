package com.example.projectandroid;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MenuPrincipal extends Activity {

        private TextView tvusu;
        private Button btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        tvusu = (TextView) findViewById(R.id.tvuser);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");

        tvusu.setText(name);


        btnexit = findViewById(R.id.btnexit);

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuPrincipal.this,"Se ha cerrado la App.",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }



}
