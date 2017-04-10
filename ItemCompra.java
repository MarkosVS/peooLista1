public class ItemCompra {
    //atributos
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    //construtor
    public ItemCompra(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //getters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    //metodos
    public double calcularTotal(){
        return this.preco * this.quantidade;
    }

    public void incrementarQtd(int q){
        this.quantidade += q;
    }   
}
