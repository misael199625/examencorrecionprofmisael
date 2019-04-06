package mx.edu.tesoem.misael.itics.examcorremis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class operaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
    }
    public void llasu(View v) {
        Intent cargar = new Intent(this, suma.class);
        startActivity(cargar);

    }

    public void llare(View v) {
        Intent cargar = new Intent(this, resta.class);
        startActivity(cargar);

    }

    public void llapo(View v) {
        Intent cargar = new Intent(this, potencia.class);
        startActivity(cargar);

    }

    public void fina(View v) {
        Intent cargar = new Intent(this, salir.class);
        startActivity(cargar);

    }



}
