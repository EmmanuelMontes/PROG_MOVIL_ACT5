package unam.fca.dmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Actividad 5 Recibir datos de otras aplicaciones
        //https://developer.android.com/training/sharing/receive
        //Las aplicaciones en android pueden recibir informacion de otras apps

        // El archivo del layout de la actividad se encuentra en la carpeta
        // res/layout/activity_main.xml
        setContentView(R.layout.activity_main);


        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();

        final EditText et = findViewById(R.id.et);


        //Cuando nuestra aplicacion sea iniciada por otra  aplicacion, type no sera nulo
        if (Intent.ACTION_SEND.equals(action) && type != null) {

            String extraText = intent.getStringExtra(Intent.EXTRA_TEXT);
            if (extraText != null) {
                et.setText(extraText);
            }

        }


        //Actividades
        //a) Descomenta las lineas del archivo AndroidManifest.xml
        //b) Revisa la url de referencia, que tipo de informacion puede recibir la app?
        //c) Ejecuta la aplicacion en modo de depuracion, la primera vez que se ejecuta la app, que valor tiene Intent.ACTION_SEND?
        //d) Prueba compartiendo un video de YouTube o una ubicacion de GoogleMaps a la aplicacion
        //e) Cuando la aplicacion es iniciada por otra app, que valor tiene Intent.ACTION_SEND?
        //f) Anota tus respuestas en un documento en Word
        //g) Sube tu codigo al repositorio.
        //h) Sube el documento Word con tus respuestas y las capturas de pantalla  a la plataforma Moodle. Incluye la liga a tu repositorio


    }
}
