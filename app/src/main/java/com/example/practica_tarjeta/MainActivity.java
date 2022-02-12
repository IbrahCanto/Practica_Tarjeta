package com.example.practica_tarjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, user2;
    Button iniciar, salir;
    String nombre="", nombre2="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Inicializar nuestros elementos
        setContentView(R.layout.activity_main);
        user=(EditText) findViewById(R.id.eiduser);
        user2=(EditText) findViewById(R.id.eiduser2);
        iniciar=(Button) findViewById(R.id.btninicio);
        salir=(Button) findViewById(R.id.btncancelar);



        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Bloque que se ejecuta
                Toast.makeText(getApplicationContext(), "By Ibrahin Canto Almeida", Toast.LENGTH_LONG).show();
                Log.i("ERROR1", "Diste click en salir");
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });





        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Este bloque se ejecuta al dar click en el boton iniciar
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
                Log.i("ERROR4", "Hiciste click en el boton iniciar");
                nombre=user.getText().toString();
                nombre2=user2.getText().toString();
                intent.putExtra("NombreUser", nombre);
                intent.putExtra("NombreUser2", nombre2);
                //Toast.makeText(getApplicationContext(), "Bienvenid@" +nombre, Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
    }

}