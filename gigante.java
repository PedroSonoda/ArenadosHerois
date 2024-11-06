package ArenaDosHerois;

public class gigante  extends Personagens {

	public gigante(String nome) {
		super(nome, 200,40);
	}
	@Override
	public void atacar(Personagens oponente) {
		int distancia = calcularDistancia(oponente);
		if (distancia <= 1) {
			oponente.receberDano(this.getDanoBase());
			System.out.println(getNome() + "atacou" + oponente.getNome() + "com força bruta.");
		}else {
			System.out.println(getNome()+ " está muito longe para atacar!");
		}
	}
}
