package parte2compra;

import java.util.ArrayList;

public class Compra {
    //atributos
    private ArrayList<ItemCompra> compras;
    private double desconto;
    private double totalCompra;

    //construtor
    public Compra() {
        this.compras = new ArrayList<>();
        this.desconto = 0;
        this.totalCompra = 0;
    }
    
    //getters
    public ArrayList<ItemCompra> getCompras() {
        return compras;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    //setter
    public void setCompras(ArrayList<ItemCompra> compras) {
        this.compras = compras;
    }    
    
    //override metodos
    @Override
    public String toString(){
        String retorno = "";
        double vTotal;
        for(ItemCompra i : this.compras){
            vTotal = i.calcularTotal();
            retorno += ("Código: " + i.getCodigo());
            retorno += ("\nProduto: " + i.getNome());
            retorno += ("\nQuantidade: " + i.getQuantidade());
            retorno += ("\nValor: R$ " + String.format("%.2f", vTotal) + "\n\n");
        }
        return retorno.substring(0, retorno.length()-2);
    }
    
    //metodos
    public void inserirItem(ItemCompra i){
        if(this.compras.size() <= 5){
            this.compras.add(i);
            this.totalCompra += i.calcularTotal();
        }
    }
    
    public double calcularTotalCompra(){
        double total = 0;
        for(ItemCompra i : this.compras){
            total += i.calcularTotal();
        }
        this.totalCompra = total;
        return total;
    }
    
    public double calcularDesconto(int desc){
        return calcularDesconto(desc/100.0);
    }
    
    public double calcularDesconto(double desc){
        this.desconto = this.totalCompra * desc; 
        return this.desconto;
    }
    
    public double calcularTotalFinal(){
        return this.totalCompra - this.desconto;
    }
    
    public String notaFiscal(String pagamento, int parcelas){
        if(pagamento.equals("crédito"))
            this.calcularDesconto(0.05);
        else if(pagamento.equals("à vista"))
            this.calcularDesconto(0.1);
        if(parcelas > 3)
            parcelas = 3;
        else if(parcelas < 1)
            parcelas = 1;
        String nota = this.toString();
        nota += ("\n\nSubtotal: R$ " + String.format("%.2f", this.totalCompra));
        nota += ("\nDesconto: R$ " + String.format("%.2f", this.desconto));
        nota += ("\nTotal: R$ " + String.format("%.2f", this.calcularTotalFinal()));
        nota += ("\nNº parcelas: " + parcelas);
        return nota;
    }
    
    public void imprimirNota(String pagamento, int parcelas){
        System.out.println(notaFiscal(pagamento, parcelas));
    }
    
}
