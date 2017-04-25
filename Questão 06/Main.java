public class Main{
	public static void main(String[] args){
		Data hj = new Data(9, 4, 2017);
		Data born = new Data(18, 12, 1996);
		System.out.println(hj);
		hj.avancarDia();
		System.out.println(hj);
		System.out.println("Formato americano: " + hj.formatData("eua"));
		if(born.eMaisAntiga(hj))
			System.out.println(born + " é mais antiga");
		else
			System.out.println(hj + " é mais antiga");
	}
}