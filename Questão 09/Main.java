import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		ArrayList<Pais> listaPaises = new ArrayList<>();
		Pais br = new Pais("Brasil", "America", 8515767.049, 11387);
		Pais arg = new Pais("Argentina", "America", 2780400, 22101);
		Pais ven = new Pais("Venezuela", "America", 916445, 15602);
		Pais ing = new Pais("Inglaterra", "Europa", 130395, 38000);
		Pais esp = new Pais("Espanha", "Europa", 504030, 34819);
		Pais mvs = new Pais("Marcos Vinicius Sombra", "Europa", 18069.2, 33650);
		listaPaises.add(br);
		listaPaises.add(arg);
		listaPaises.add(ven);
		listaPaises.add(ing);
		listaPaises.add(esp);
		listaPaises.add(mvs);
		System.out.println("América:");
		ven.listarPaisesContinente(listaPaises);
		System.out.println("Europa:");
		esp.listarPaisesContinente(listaPaises);
	}
}