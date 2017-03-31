package parte3data;

public class Data {
    //atributos
    private int dia;
    private int mes;
    private int ano;

    //construtor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if(!dataValida()){
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }
    
    //getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    //setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //override metodos
    @Override
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    //metodos
    private boolean anoValido(){
        return this.ano > 0;
    }
    
    private boolean mesValido(){
        return this.mes < 13 && this.mes > 0;
    }
    
    private boolean diaValido(){
        if(this.mes == 2 && this.ano % 4 == 0)
            return this.dia > 0 && this.dia <= 29;
        if(this.mes == 2 && this.ano % 4 != 0)
            return this.dia > 0 && this.dia <= 28;
        int[] meses31 = {1, 3, 5, 7, 8, 10, 12};
        for(int i : meses31){
            if(this.mes == i){
                return this.dia > 0 && this.dia <= 31;
            }
        }
        return this.dia > 0 && this.dia <= 30;
    }
    
    private boolean dataValida(){
        return anoValido() && mesValido() && diaValido();
    }
    
    public void avancarDia(){
        this.dia++;
        if(!diaValido()){
            this.dia = 1;
            this.mes++;
            if(!mesValido()){
                this.mes = 1;
                this.ano++;
            }
        }
    }
}
