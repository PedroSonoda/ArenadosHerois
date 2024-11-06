package ArenaDosHerois;

public class arqueiro extends Personagens {

	public arqueiro(String nome) {
		super(nome,80, 20);
	}
	@Override
	public void atacar(Personagens oponente) {
		oponente.receberDano(this.getDanoBase());
		System.out.println(getNome() + "disparou uma flecha em " + oponente.getNome() + "á distância");
}
}