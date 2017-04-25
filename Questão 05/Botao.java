import java.util.ArrayList;

public class Botao {
    //atributos
    private ArrayList<String> acoes;
    private String id;
    
    //construtor
    public Botao(String id) {
        this.id = id;
        acoes = new ArrayList<>();
    }
        
    //getters
    public ArrayList<String> getAcoes() {
        return acoes;
    }

    public String getId() {
        return id;
    }
    
    //setters
    public void setAcao(ArrayList<String> acoes) {
        this.acoes = acoes;
    }

    public void setId(String id) {
        this.id = id;
    }
 
}