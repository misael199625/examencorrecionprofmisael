package mx.edu.tesoem.misael.itics.examcorremis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class saludo extends AppCompatActivity {
    TextView saludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        saludo = (TextView) findViewById(R.id.txtsaludanombre);

        Bundle parametro = this.getIntent().getExtras();

        saludo.setText("Bienvenido " + parametro.getString("nombre").toString());
    }
}
