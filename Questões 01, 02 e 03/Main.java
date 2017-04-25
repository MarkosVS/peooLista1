import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		ArrayList<Partida> Final = new ArrayList<Partida>();
		Time Flamengo = new Time("Flamengo", 1985);
		Time Fluminense = new Time("Fluminense", 1902);
		Partida ida = new Partida(Flamengo,Fluminense);
		Partida volta = new Partida(Fluminense,Flamengo);
		Final.add(ida); Final.add(volta);
		ida.setGolslocal(3);
		volta.setGolslocal(1);
		volta.setGolsvisitante(2);
		
		if((ida.getGolslocal() + volta.getGolsvisitante()) > (volta.getGolslocal() + ida.getGolsvisitante()))
			System.out.println("O " + ida.getLocal().getNome() + " é o campeão!");
		if((ida.getGolslocal() + volta.getGolsvisitante()) < (volta.getGolslocal() + ida.getGolsvisitante()))
			System.out.println("O " +volta.getLocal().getNome() + " é o campeão!");
	}
}