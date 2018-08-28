package pe.edu.upeu.mvp;

import android.view.View;

public class FactorialPresentador implements Main.Presentador {
    private Main.Modelo model;
    private Main.Vista vista;
    public FactorialPresentador(Main.Vista vista){
        this.vista = vista;
        model = new FactorialModel(this);
    }
    @Override
    public void mostrarResultado(String r) {
        if (vista!=null){
            vista.mostrarResultado(r);
        }
    }

    @Override
    public void calcularFactorial(String n) {
        if(vista != null){
            model.calcularFactorial(n);
        }
    }

    @Override
    public void calcularSuma(String m, String f) {
        if (vista != null){
            model.calcularSuma(m,f);
        }
    }

    @Override
    public void mostrarSuma(String x) {
        if (vista != null){
            vista.mostrarSuma(x);
        }
    }

    @Override
    public void Resta(String a, String b) {
        if (vista !=null){
            model.Resta(a,b);
        }
    }

    @Override
    public void ResuResta(String d) {
        if (vista !=null){
            vista.ResuResta(d);
        }
    }

    @Override
    public void Mult(String q, String w) {
        if (vista !=null){
            model.Mult(q,w);
        }
    }

    @Override
    public void ResuMult(String m) {
        if (vista !=null){
            vista.ResuMult(m);
        }
    }

    @Override
    public void Div(String o, String p) {
        if (vista !=null){
            model.Div(o,p);
        }
    }

    @Override
    public void ResuDiv(String c) {
        if (vista != null){
            vista.ResuDiv(c);
        }
    }

}
