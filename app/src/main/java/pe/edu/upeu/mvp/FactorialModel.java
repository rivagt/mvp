package pe.edu.upeu.mvp;

public class FactorialModel implements Main.Modelo{
    private Main.Presentador presentador;

    public FactorialModel(Main.Presentador presentador){
        this.presentador=presentador;
    }
    @Override
    public void calcularFactorial(String n) {
        int fac = 1;
        if (!n.equals("")){
            //calculo de factorial
            int x = Integer.parseInt(n);
            for (int i=1;i<=x;i++){
                fac = fac*i;
            }
            presentador.mostrarResultado(String.valueOf(fac));
        }else {
            //mostrar mensaje
        }
    }

    @Override
    public void calcularSuma(String m, String f) {
        int sum;
        if (!m.equals("") && !f.equals("")){
            int x = Integer.parseInt(m);
            int y = Integer.parseInt(f);
            sum=x+y;
            presentador.mostrarSuma(String.valueOf(sum));
        }
    }

    @Override
    public void Resta(String a, String b) {
        int res;
        if (!a.equals("") && !b.equals("")){
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            res=x-y;
            presentador.ResuResta(String.valueOf(res));
        }
    }

    @Override
    public void Mult(String q, String w) {
        int mult;
        if (!q.equals("") && !w.equals("")){
            int x = Integer.parseInt(q);
            int y = Integer.parseInt(w);
            mult=x*y;
            presentador.ResuMult(String.valueOf(mult));
        }
    }

    @Override
    public void Div(String o, String p) {
        int div;
        if (!o.equals("") && !p.equals("")){
            int x = Integer.parseInt(o);
            int y = Integer.parseInt(p);
            div=x/y;
            presentador.ResuDiv(String.valueOf(div));
        }
    }
}
