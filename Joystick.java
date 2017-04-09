import java.util.ArrayList;

public class Joystick {
    //atributos
    private String modelo;
    private ArrayList<String> acoes;
    private ArrayList<Botao> botoes;
    
    //construtores
    public Joystick(String modelo){
        this.modelo = modelo;
        this.acoes = new ArrayList<>();
        this.botoes = new ArrayList<>();
    }
    
    public Joystick(){
        this.acoes = new ArrayList<>();
        this.botoes = new ArrayList<>();
    }
    
    //getters
    public String getModelo() {
        return this.modelo;
    }

    public ArrayList<String> getAcoes() {
        return this.acoes;
    }

    public ArrayList<Botao> getBotoes() {
        return this.botoes;
    }
    
    //setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAcoes(ArrayList<String> acoes) {
        this.acoes = acoes;
    }

    public void setBotoes(ArrayList<Botao> botoes) {
        this.botoes = botoes;
    }
    
    //métodos
    public void cadastrarAcao(String acao){
        if(this.acoes.size() <= 100 && !this.acoes.contains(acao))
            this.acoes.add(acao);
    }
    
    public void adicionarBotao(Botao b){
        if(this.botoes.size() <= 50 && !this.botoes.contains(b))
            this.botoes.add(b);
    }
    
    public String realizarAcao(String acao){
        if(this.acoes.contains(acao))
            return acao;
        return "";
    }

    public void imprimeAcao(String acao){
        if(this.acoes.contains(acao))
            System.out.println(acao);
        else
            System.out.println("Ação não cadastrada");
    }
    
    public void relacionarBotaoAcao(Botao b, String acao){
        if(!this.botoes.contains(b) || !this.acoes.contains(acao)){
            this.cadastrarAcao(acao);
            this.adicionarBotao(b);
        }
        if(this.botoes.contains(b) && this.acoes.contains(acao))
            b.getAcoes().add(acao);
                
    }
    
    public String apertarBotao(Botao b){
        if(this.botoes.contains(b))
            return b.getAcoes().get(0);
        return "";
    }
    
    public String apertarBotao(Botao b, String acao){
        if(this.botoes.contains(b) && this.acoes.contains(acao)){
            if(b.getAcoes().contains(acao))
                return acao;
        }
        return "";
    }
    
    public String apertarBotao(Botao b, int idAcao){
        if(idAcao <= b.getAcoes().size() && this.botoes.contains(b))
            return b.getAcoes().get(idAcao);
        return "";
    }
}
