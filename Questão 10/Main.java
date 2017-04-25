public class Main{
	public static void main(String[] args){
		Compra c = new Compra();
		ItemCompra feijao = new ItemCompra(13, "Feijão", 10, 1);
		ItemCompra arroz = new ItemCompra(14, "Arroz", 7.15, 2);
		ItemCompra biscoito = new ItemCompra(37, "Biscoito", 1.90, 4);
		ItemCompra bisc = new ItemCompra(37, "Biscoito", 1.90, 2);
		c.inserirItem(feijao);
		c.inserirItem(arroz);
		c.inserirItem(biscoito);
		c.inserirItem(bisc);
		c.imprimirNota("crédito", 1);
	}
}