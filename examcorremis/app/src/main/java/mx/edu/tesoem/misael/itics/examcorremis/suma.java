package mx.edu.tesoem.misael.itics.examcorremis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class suma extends AppCompatActivity {

    EditText num1, num2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        num1 = (EditText) findViewById(R.id.txtnum);
        num2 = (EditText) findViewById(R.id.txtnum2);
        resultado = (TextView) findViewById(R.id.textView4);

    }

    public void calculaSuma(View v){
        int a,b,r;
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        r = a+b;
        resultado.setText(String.valueOf(r));
    }
}
