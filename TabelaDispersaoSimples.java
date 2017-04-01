import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TabelaDispersaoSimples {
    //atributos
    private int[] tabela;
    
    //construtor
    public TabelaDispersaoSimples(int n){
        tabela = new int[n];
        Arrays.fill(tabela, -1);
    }
    
    //getter
    public int[] getTabela() {
        return tabela;
    }
    
    //setter
    public void setTabela(int[] n){
        tabela = n;
    }
    //metodos
    public void adicionar(int n) throws IOException{
        char resp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(n > 0){
            if(n/2 < this.tabela.length){
                if(this.tabela[n/2] != -1){
                    System.out.println("Deseja sobrescrever? ('s' para sim, 'n' para não)");
                    resp = br.readLine().charAt(0);
                    if(resp == 's')
                        this.tabela[n/2] = n;
                    else
                        System.out.println("Índice não sobrescrito");
                }else
                   this.tabela[n/2] = n; 
            }else{
                if(this.tabela[n%this.tabela.length] != -1){
                    System.out.println("Deseja sobrescrever? ('s' para sim, 'n' para não)");
                    resp = br.readLine().charAt(0);
                    if(resp == 's')
                        this.tabela[n%this.tabela.length] = n;
                    else
                        System.out.println("Índice não sobrescrito");
                }else
                   this.tabela[n%this.tabela.length] = n;
            }
        }
    }
    
    public int buscarIndice(int n){
        for(int i = 0; i < this.tabela.length; i++){
            if(this.tabela[i] == n)
                return i;
        }
        return -1;
    }
    
    public void remover(int n){
        int index = buscarIndice(n);
        if(index >= 0)
            this.tabela[index] = -1;
    }   
}
