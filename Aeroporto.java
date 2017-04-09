import java.util.ArrayList;

public class Aeroporto {
    //atributos
    private int codigo;
    private String nome;
    private boolean internacional;
    private ArrayList<Aviao> avioes;

    //construtor
    public Aeroporto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.avioes = new ArrayList<>();
    }
    
    //getters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public ArrayList<Aviao> getAvioes() {
        return avioes;
    }

    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    public void setAvioes(ArrayList<Aviao> avioes) {
        this.avioes = avioes;
    }
    
    //metodos
    public void mudarStatusInternacional(){
        this.internacional = !this.internacional;
    }
    
    public boolean equals(Aeroporto a){
        return this.codigo == a.getCodigo();
    }
    
    public void pousarAviao(Aviao a){
        this.avioes.add(a);
    }
        
    public boolean aviaoEstaNoPatio(int pref){
        return this.avioes.stream().anyMatch((Aviao a) -> (a.getPrefixo() == pref));
    }
    
    public Aviao buscarAviao(int pref){
        for(Aviao a : avioes){
            if(a.getPrefixo() == pref)
                return a;
        }
        return null;
    }
}
