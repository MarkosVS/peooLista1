public class Time {
	private String nome;
	private int anoNascimento;
	private int cartoes;

	public Time(String nome, int ano){
	setNome(nome);
		setAnoNascimento(ano);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int getCartoes(){
		return this.cartoes;
	}

	public void setCartoes(int cartoes){
		this.cartoes = cartoes;
	}

	public void mostrarCartao(){
		this.cartoes++;
	}
}