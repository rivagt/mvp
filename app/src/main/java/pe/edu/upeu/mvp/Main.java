package pe.edu.upeu.mvp;

public interface Main {
    public interface Vista{
        public void mostrarResultado(String r);
        public void mostrarSuma(String x);
        public void ResuResta(String d);
        public void ResuMult(String m);
        public void ResuDiv(String c);
    }
    public interface Presentador{
        public void mostrarResultado(String r);
        public void calcularFactorial(String n);
        public void calcularSuma(String m, String f);
        public void mostrarSuma(String x);
        public void Resta(String a, String b);
        public void ResuResta(String d);
        public void Mult(String q, String w);
        public void ResuMult(String m);
        public void Div(String o, String p);
        public void ResuDiv(String c);
    }
    public interface Modelo{
        public void calcularFactorial(String n);
        public void calcularSuma(String m, String f);
        public void Resta(String a, String b);
        public void Mult(String q, String w);
        public void Div(String o, String p);
    }
}
