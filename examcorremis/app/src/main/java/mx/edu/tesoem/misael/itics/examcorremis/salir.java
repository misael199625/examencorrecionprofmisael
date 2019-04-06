package mx.edu.tesoem.misael.itics.examcorremis;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class salir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salir);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },6000);
    }
}