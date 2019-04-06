package mx.edu.tesoem.misael.itics.examcorremis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class potencia extends AppCompatActivity {

    EditText txtnum1,txtnum2;
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);

        txtnum1 = (EditText) findViewById(R.id.txtnum1);
        txtnum2 = (EditText) findViewById(R.id.txtnum2);
        lblresultado = (TextView) findViewById(R.id.lblresultado);
    }

    public void pcalcular(View v){
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());

        lblresultado.setText(String.valueOf(num1*num2));
    }
}
