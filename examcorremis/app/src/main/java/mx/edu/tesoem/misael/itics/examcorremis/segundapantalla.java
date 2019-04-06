package mx.edu.tesoem.misael.itics.examcorremis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class segundapantalla extends AppCompatActivity {
    TextView vnombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundapantalla);

        vnombre = (TextView) findViewById(R.id.txtsaludanombre);

    }

    public void Mandarsaludo(View v){
        Intent vsaludo = new Intent(this, saludo.class);
        vsaludo.putExtra("nombre", vnombre.getText().toString());
        startActivity(vsaludo);
    }

    public void MensajeEmerge(View v){
        Toast.makeText(this,"Bienvenido " + vnombre.getText().toString(),Toast.LENGTH_LONG).show();
    }

    public void Loperaciones(View v){
        Intent cargar = new Intent(this, operaciones.class);
        startActivity(cargar);
    }
}
