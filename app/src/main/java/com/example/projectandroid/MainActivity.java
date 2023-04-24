package com.example.projectandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText txtname, password;
    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtname = findViewById(R.id.txtname);
        password = findViewById(R.id.txtpassword);



        btnlogin = findViewById(R.id.btningresar);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtname.length() < 3) {
                    Toast.makeText(MainActivity.this, "El nombre debe tener 3 caracteres o más.", Toast.LENGTH_LONG).show();
                }
                else{
                    if (password.length() < 8) {
                        Toast.makeText(MainActivity.this, "La contraseña debe tener 8 caracteres o más.", Toast.LENGTH_LONG).show();
                    }
                    else {
                        String name = txtname.getText().toString();
                        Intent intent = new Intent(MainActivity.this,MenuPrincipal.class);
                        intent.putExtra("name",name);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "Ingreso exitoso", Toast.LENGTH_SHORT).show();

                    }
                }

            }


        });

    }
}