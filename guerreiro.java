package ArenaDosHerois;

public class guerreiro  extends Personagens{

		public guerreiro(String nome) {
		super(nome,150, 30);
	}
	@Override
	public void atacar(Personagens oponente) {
		int distancia = calcularDistancia(oponente);
		if (distancia <= 1) {
			oponente.receberDano(this.getDanoBase());
			System.out.println(getNome() + "atacou" + oponente.getNome() + "com sua espada");
		}else {
			System.out.println(getNome()+ " está muito longe para atacar!");
		}
	}
}
