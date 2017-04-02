package parte2pais;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
    //construtor
    private String nome;
    private String continente;
    private double area;
    private double rendaPerCapita;
    
    //construtor
    public Pais(String n, String c, double a, double renda) {
        this.nome = n;
        this.continente = c;
        this.area = a;
        this.rendaPerCapita = renda;
    }
    
    //getters
    public String getNome() {
        return nome;
    }

    public String getContinente() {
        return continente;
    }

    public double getArea() {
        return area;
    }

    public double getRendaPerCapita() {
        return rendaPerCapita;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setRendaPerCapita(double rendaPerCapita) {
        this.rendaPerCapita = rendaPerCapita;
    }
    
    //override metodos
    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nÁrea: " + this.area + " km²\nRenda per capita: " +
                this.rendaPerCapita + " rubis";
    }
    //metodos
    public void listarPaisesContinente(ArrayList<Pais> paises){
        ArrayList<Pais> msmContinente = new ArrayList<>();
        paises.stream().filter((p) -> (p.getContinente().equals(this.continente))).forEach((p) -> {
            msmContinente.add(p);
        });
        int len = msmContinente.size();
        for(int i = 0; i < len - 1; i++){
            for(int j = i + 1; j < len; j++){
                if(msmContinente.get(i).rendaPerCapita > msmContinente.get(j).rendaPerCapita)
                    Collections.swap(msmContinente, i, j);
            }
        }
        msmContinente.stream().forEach((Pais p) -> {
            System.out.println(p);
        });
    }
}
