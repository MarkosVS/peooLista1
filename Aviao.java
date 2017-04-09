public class Aviao {
    //atributos
    private int prefixo;
    private int qtdAcentos;
    private int qtdAcentosOcupados;
    private String fabricante;
    private String modelo;
    
    //construtores
    public Aviao() {}

    public Aviao(String modelo, int prefixo) {
        this.modelo = modelo;
        this.prefixo = prefixo;
    }
       
    //getters
    public int getPrefixo() {
        return prefixo;
    }

    public int getQtdAcentos() {
        return qtdAcentos;
    }

    public int getQtdAcentosOcupados() {
        return qtdAcentosOcupados;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }
    
    //setters
    public void setPrefixo(int prefixo) {
        this.prefixo = prefixo;
    }

    public void setQtdAcentos(int qtdAcentos) {
        this.qtdAcentos = qtdAcentos;
    }

    public void setQtdAcentosOcupados(int qtdAcentosOcupados) {
        this.qtdAcentosOcupados = qtdAcentosOcupados;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    //override metodos
    @Override
    public String toString(){
        return this.modelo;
    }
}
