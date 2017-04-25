public class Main{
	public static void main(String[] args){
		Joystick n3ds = new Joystick("New 3DS");
		Botao a = new Botao("A");
		Botao b = new Botao("B");
		n3ds.relacionarBotaoAcao(a, "Interagir com NPC");
		n3ds.relacionarBotaoAcao(a, "Selecionar opção do menu");
		n3ds.relacionarBotaoAcao(b, "Correr");
		System.out.println(n3ds.apertarBotao(b, "Correr"));
		System.out.println(n3ds.apertarBotao(a));
		System.out.println(n3ds.apertarBotao(a, 1));
	}
}