public class Data {
    //atributos
    private int dia;
    private int mes;
    private int ano;

    //construtor
    public Data(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
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
        if(!diaValido())
            this.dia = 1;
    }

    public void setMes(int mes) {
        this.mes = mes;
        if(!mesValido())
            this.mes = 1;
    }

    public void setAno(int ano) {
        this.ano = ano;
        if(!anoValido())
            this.ano = 1;
    }
    
    //override metodos
    @Override
    public String toString(){
        String stDia = String.format("%02d", this.dia);
        String stMes = String.format("%02d", this.mes);
        String stAno = String.format("%04d", this.ano);
        return stDia + '/' + stMes + '/' + stAno;
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
            if(this.mes == i)
                return this.dia > 0 && this.dia <= 31;
        }
        return this.dia > 0 && this.dia <= 30;
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
    
    public boolean eMaisAntiga(Data d){
        if(this.ano < d.ano)
            return true;
        if(this.ano > d.ano)
            return false;
        if(this.mes < d.mes)
            return true;
        if(this.mes > d.mes)
            return false;
        if(this.dia < d.dia)
            return true;
        if(this.dia > d.dia)
            return false;
        return false;
    }

    public String formatData(String formato){
        if(formato.equals("eua")){
            String stDia = String.format("%02d", this.dia);
            String stMes = String.format("%02d", this.mes);
            String stAno = String.format("%04d", this.ano);
            return stMes + '/' + stDia + '/' + stAno;
        }
        return toString();
    }
}
