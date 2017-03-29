package parte2calc;

public class Calculadora {
    private int resultado;
    
    //construtor
    public Calculadora(){
        this.resultado = 0;
    }
    
    //getter
    public int getResultado() {
        return resultado;
    }
    
    //setter
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    //métodos
    public int somar(int a){
        this.resultado += a;
        return this.resultado;
    }
    
    public int subtrair(int a){
        this.resultado -= a;
        return this.resultado;
    }
    
    public int multiplicar(int a){
        this.resultado *= a;
        return this.resultado;
    }
    
    public int dividir(int a){
        if(a != 0){
            this.resultado /= a;
            System.out.println("Impossível dividir por 0. Dividindo por 1...");
        }
        return this.resultado;
    }
    
    public int logaritmo(int base){
        this.resultado = (int) (Math.log(this.resultado)/Math.log(base));
        return this.resultado;
    }
}
