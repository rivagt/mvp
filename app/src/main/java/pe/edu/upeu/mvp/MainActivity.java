package pe.edu.upeu.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Main.Vista {
    private Main.Presentador presentador;
    private Button button, btns, btnr, btnm, btnd;
    private EditText edt1, edt2, edt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentador=new FactorialPresentador(this);
        edt1 = (EditText) findViewById(R.id.txtn);
        edt2 = (EditText) findViewById(R.id.txts1);
        edt3 = (EditText) findViewById(R.id.txts2);
        button = (Button) findViewById(R.id.btnc);
        btns = (Button) findViewById(R.id.btns);
        btnr = (Button) findViewById(R.id.btnr);
        btnm = (Button) findViewById(R.id.btnm);
        btnd = (Button) findViewById(R.id.btnd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.calcularFactorial(edt1.getText().toString());
            }
        });
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.calcularSuma(edt2.getText().toString(),edt3.getText().toString());
            }
        });
        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.Resta(edt2.getText().toString(),edt3.getText().toString());
            }
        });
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.Mult(edt2.getText().toString(),edt3.getText().toString());
            }
        });
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.Div(edt2.getText().toString(),edt3.getText().toString());
            }
        });
    }

    @Override
    public void mostrarResultado(String r) {
        Toast.makeText(getApplicationContext(), "Factorial:"+r, Toast.LENGTH_LONG).show();
    }

    @Override
    public void mostrarSuma(String x) {
        Toast.makeText(getApplicationContext(), "Suma:"+x, Toast.LENGTH_LONG).show();
    }

    @Override
    public void ResuResta(String d) {
        Toast.makeText(getApplicationContext(), "Resta:"+d, Toast.LENGTH_LONG).show();
    }

    @Override
    public void ResuMult(String m) {
        Toast.makeText(getApplicationContext(), "Producto:"+m, Toast.LENGTH_LONG).show();
    }

    @Override
    public void ResuDiv(String c) {
        Toast.makeText(getApplicationContext(), "Cociente:"+c, Toast.LENGTH_LONG).show();
    }
}
