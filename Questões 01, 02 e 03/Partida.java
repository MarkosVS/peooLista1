public class Partida {
	private Time local;
	private Time visitante;
	private int golslocal;
	private int golsvisitante;

	public Partida(Time a, Time b){
		setLocal(a);
		setVisitante(b);
	}
	
	public Time getLocal() {
		return local;
	}
	
	public void setLocal(Time local) {
		this.local = local;
	}
	
	public Time getVisitante() {
		return visitante;
	}
	
	public void setVisitante(Time visitante) {
		this.visitante = visitante;
	}
	
	public int getGolslocal() {
		return golslocal;
	}
	
	public void setGolslocal(int golslocal) {
		this.golslocal = golslocal;
	}
	
	public int getGolsvisitante() {
		return golsvisitante;
	}
	
	public void setGolsvisitante(int golsvisitante) {
		this.golsvisitante = golsvisitante;
	}
}