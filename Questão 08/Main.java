public class Main{
	public static void main(String[] args){
		Aeroporto pm = new Aeroporto(1337, "Pinto Martins");
		Aeroporto mp = new Aeroporto(7331, "Minto Partins");
		Aviao a380 = new Aviao("Airbus A380", 175);
		Aviao b707 = new Aviao("Boeing 707", 163);
		Aviao a320 = new Aviao("Airbus A320", 176);
		pm.pousarAviao(a380);
		pm.pousarAviao(b707);
		mp.pousarAviao(a320);
		pm.mudarStatusInternacional();
		if(pm.aviaoEstaNoPatio(175))
			System.out.println(pm.buscarAviao(175) + " está no pátio.");
		if(pm.aviaoEstaNoPatio(176))
			System.out.println(pm.buscarAviao(176) + " está no pátio.");
		if(mp.aviaoEstaNoPatio(175))
			System.out.println(pm.buscarAviao(175) + " está no pátio.");
		if(mp.equals(pm))
			System.out.println("São iguais.");
		else
			System.out.println("São diferentes.");
	}
}