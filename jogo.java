package ArenaDosHerois;

import java.util.Scanner;

public class jogo {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		Personagens mago = new Mago("Mago");
		Personagens gigante = new gigante("Gigante");
		Personagens guerreiro = new guerreiro("Guerreiro");
		Personagens arqueiro= new arqueiro("Arqueiro");
		
		Personagens[] personagens = {mago,gigante,guerreiro,arqueiro};
		tabuleiro tabuleiro = new tabuleiro(personagens, 10);
		
		tabuleiro.iniciarJogo();
		
		while(! tabuleiro.checarVencedor()) {
			for (Personagens p : personagens) {
				if (p.getVida() >0) {
					System.out.println(p.getNome() + "(1) Atacar ou (2) Mover?");
					int escolha = Scanner.nextInt();
					
					if (escolha == 1) {
						System.out.println("Escolha um oponente para atacar");
						
					for(int i= 0; i < personagens.length; i++) {
						if(personagens[i] !=p && personagens[i].getVida() >0);
						System.out.println(i + ":" + personagens[i].getNome());
					}
					
				}
				int oponenteEscolhido;
				while(true) {
					oponenteEscolhido = Scanner.nextInt();
					if (oponenteEscolhido >= 0 && oponenteEscolhido < personagens.length
							&& personagens[oponenteEscolhido]!=p
							&& personagens [oponenteEscolhido].getVida() > 0) {
						break;
					}else {
						System.out.println("Escolha inválida, tente novamente.");
					}	
				}
				
				p.atacar(personagens[oponenteEscolhido]);
			}
			else {
				System.out.println("Escolha uma nova posição (0 a 9):");
				int novaPosicao = Scanner.nextInt();
				tabuleiro.movimentarPersonagens(p, novaPosicao);
			}
		}
	} Scanner.close();
}}
