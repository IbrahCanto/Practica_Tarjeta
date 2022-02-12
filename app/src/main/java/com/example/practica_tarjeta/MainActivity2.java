package com.example.practica_tarjeta;


import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView mensaje;
    String NombreUser;
    String NombreUser2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mensaje=(TextView) findViewById(R.id.TextView2);

        Bundle extras = getIntent().getExtras();
        NombreUser = extras.getString("NombreUser");
        NombreUser2 = extras.getString("NombreUser2");
        mensaje.setText(
                NombreUser2 + ", pienso en ti cada mañana cuando despierto\n" +
                NombreUser2 + ", pienso en ti cada tarde cuando camino\n" +
                NombreUser2 + ", pienso en ti cada noche cuando ceno\n" +
                "y pienso en ti cada madrugada cuando sueño\n" +
                        "Te lo dedida con mucho amor " + NombreUser
        );
    }

    public void Anterior (View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);

    }


}