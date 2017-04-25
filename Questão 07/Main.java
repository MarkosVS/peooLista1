import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
		TabelaDispersaoSimples tds = new TabelaDispersaoSimples(10);
		tds.adicionar(10);
		System.out.println(tds.get(5));
		tds.adicionar(22);
		System.out.println(tds.get(2));
		tds.adicionar(4);
		System.out.println(tds.get(2));
	}
}