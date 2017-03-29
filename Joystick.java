package parte2joy;

import java.util.ArrayList;

public class Joystick {
    //atributos
    private String modelo;
    private ArrayList<String> acoes;
    private ArrayList<Integer> botoes;
    
    //construtores
    public Joystick(String modelo){
        setModelo(modelo);
        acoes = new ArrayList<>();
        botoes = new ArrayList<>();
    }
    
    public Joystick(){
        acoes = new ArrayList<>();
        botoes = new ArrayList<>();
    }
    
    //getters
    public String getModelo() {
        return modelo;
    }

    public ArrayList<String> getAcoes() {
        return acoes;
    }

    public ArrayList<Integer> getBotoes() {
        return botoes;
    }
    
    //setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAcoes(ArrayList<String> acoes) {
        this.acoes = acoes;
    }

    public void setBotoes(ArrayList<Integer> botoes) {
        this.botoes = botoes;
    }
    
    //métodos
    public void cadastrarAcao(String acao){
        if(this.acoes.size() <= 10 && !this.acoes.contains(acao))
            this.acoes.add(acao);
    }
    
    public void adicionarBotao(int n){
        if(this.botoes.size() <= 10 && !this.botoes.contains(n))
            this.botoes.add(n);
    }
    
    public String realizarAcao(String acao){
        if(this.acoes.contains(acao))
            return acao;
        return null;
    }
    
    public String apertarBotao(int n){
        if(this.botoes.contains(n)){
            int index = this.botoes.indexOf(n);
            return this.acoes.get(index);
        }
        return null;
    }
    
    
    
}
