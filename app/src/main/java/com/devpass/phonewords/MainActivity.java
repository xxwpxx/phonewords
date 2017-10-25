package com.devpass.phonewords;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/*
 * RA: 81714923
 */

public class MainActivity extends Activity {
    public static final String NUMERO = "com.devpass.phonewords.numero";
    private EditText etNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumero = (EditText) findViewById(R.id.etNumero);

    }

    public void ligar(View view){
        String num = etNumero.getText().toString().replace("a", "2")
                .toString().replace("b", "2")
                .toString().replace('c', '2')
                .toString().replace('d', '3')
                .toString().replace('e', '3')
                .toString().replace('f', '3')
                .toString().replace("g", "4")
                .toString().replace('h', '4')
                .toString().replace('i', '4')
                .toString().replace('j', '5')
                .toString().replace('k', '5')
                .toString().replace('l', '5')
                .toString().replace('m', '6')
                .toString().replace('n', '6')
                .toString().replace('o', '6')
                .toString().replace('p', '7')
                .toString().replace('q', '7')
                .toString().replace('r', '7')
                .toString().replace('s', '7')
                .toString().replace('t', '8')
                .toString().replace('u', '8')
                .toString().replace('v', '8')
                .toString().replace('w', '9')
                .toString().replace('x', '9')
                .toString().replace('y', '9')
                .toString().replace('z', '9');

        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra(NUMERO, num);
        startActivity(intent);
    }
}
