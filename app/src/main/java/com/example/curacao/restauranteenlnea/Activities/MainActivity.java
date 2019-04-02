//Aplicación que implementa Google Firebase
//Una empresa ha creado una aplicacion  para su servicio de comida a domicilio
//La aplicacion permite hacer el pedido y al implementar Google FireBase Notifications
//le da la empresa el manejo de enviar notificaciones a todos los usuarios de la aplicacion
package com.example.curacao.restauranteenlnea.Activities;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.curacao.restauranteenlnea.R;

public class MainActivity extends AppCompatActivity {
    //Declaración de variables
    private ImageView combo1;
    private ImageView combo2;
    private ImageView combo3;
    private ImageView combo4;
    private ImageView combo5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //conexion con los ImageView de Activity_main
        combo1 = findViewById(R.id.combo1);
        combo2 = findViewById(R.id.combo2);
        combo3 = findViewById(R.id.combo3);
        combo4 = findViewById(R.id.combo4);
        combo5 = findViewById(R.id.combo5);

        //Se implementa el escuchador para cada ImageView
        //Al momento de hacer clic en alguna de ellas se muestra al usuario
        //el cuadro de dialogo que permire al usuario
        //hacer el pedido correspondiente
        combo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialog();
            }
        });

        combo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialog();
            }
        });

        combo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialog();
            }
        });

        combo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialog();
            }
        });

        combo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialog();
            }
        });
    }

    //Método que crea el cuadro de diálogo, que muestra al usuario
    //el formulario para el pedido
    public void mostrarDialog() {
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View formulario = layoutInflater.inflate(R.layout.formulario, null);

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(formulario);
        builder.setMessage("Rellene toda la información solicitada")
                .setTitle("Orden de compra")
                .setCancelable(false)
                //Al hacer clic en enviar muestra un mensaje al usuario de confirmacion
                .setPositiveButton("Enviar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Tu pedido está en camino", Toast.LENGTH_LONG).show();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialogo = builder.create();

        dialogo.show();
    }

}
