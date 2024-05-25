package sprint2;

import java.util.Scanner;

public class Labirinto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String direcao;
		int passos = 0, bateria, hori = 1, vert = 9;

		System.out.println("Para complentar esse desafio seu robô deve chegar no fim do laribirinto (15,7)");
		System.out.println("Você poderá mover em apenas uma direção por comando, sendo os comandos e suas direçoes:");
		System.out.println("");
		System.out.println("ESQUERDA, para se mover para a esquerda;");
		System.out.println("Direita, para se mover para a direita;");
		System.out.println("FRENTE, para ir para baixo;");
		System.out.println("TRAS, para ir para cima.");
		System.out.println("");
		System.out.println("Alem disso será nescessario uma bateria de 28V, cada passo custara 1V");
		System.out.println("Quantos V tem sua bateria:");
		bateria = in.nextInt();

		System.out.println("Agora podemos começar.");
		System.out.println("Voce esta no bloco (1,9).");

		while (bateria > 0) {

			
			while(hori <5 && vert == 9) {

				// pega a direção do robo
				do {
					System.out.println("Qual a direção o robô irá andar:");
					direcao = in.next();
				} while (!direcao.equalsIgnoreCase("direita"));

				// pega a quantidade de passos
				do {
					System.out.println("Quanto passos ele andará:");
					passos = in.nextInt();
				} while (passos < 0);

				// verifica a direção
					hori += passos;

				// passos a mais
				if (hori > 5) {
					System.out.println("Voce se deparou com uma parede, os passos excedentes não foram contados");
					while (hori >= 6) {
						hori--;
						passos--;
					}
					
				}
				 
				System.out.println("Atual Posição: (" + hori + ", " + vert + ")");
				bateria -= passos;
				System.err.println("Bateria atual: " + bateria);
				if(hori==5)
					System.out.println("Você completou a primeira parte do labirinto!");
			} // fim do while

			
			

			//segundo while
			while(hori ==5  && 5< vert && vert <= 9) {

				// pega a direção do robo
				do {
					System.out.println("Qual a direção o robô irá andar:");
					direcao = in.next();
				} while (!direcao.equalsIgnoreCase("tras"));

				// pega a quantidade de passos
				do {
					System.out.println("Quanto passos ele andará:");
					passos = in.nextInt();
				} while (passos < 0);

				// verifica a direção
				
				vert -= passos;

				// passos a mais
				if (vert < 5) {
					System.out.println("Voce se deparou com uma parede, os passos excedentes não foram contados");
					while (vert <= 4) {
						vert++;
						passos--;
					}
					
				if(vert==5)
					System.out.println("Voce completou a Segunda parte do desafio!");
				}
				 
				System.out.println("Atual Posição: (" + hori + ", " + vert + ")");
				bateria -= passos;
				System.err.println("Bateria atual: " + bateria);
			} // fim do if
			
			
			//terceiro while
			while(vert ==5  && 3< hori && hori <= 5) {

				// pega a direção do robo
				do {
					System.out.println("Qual a direção o robô irá andar:");
					direcao = in.next();
				} while (!direcao.equalsIgnoreCase("esquerda"));

				// pega a quantidade de passos
				do {
					System.out.println("Quanto passos ele andará:");
					passos = in.nextInt();
				} while (passos < 0);

				// verifica a direção
				
					hori -= passos;

				// passos a mais
				if (hori < 3) {
					System.out.println("Voce se deparou com uma parede, os passos excedentes não foram contados");
					while (hori <= 2) {
						hori++;
						passos--;
					}
					
				}
				if(hori==3)
					System.out.println("Voce completou a terceira parte do desafio!");
				 
				System.out.println("Atual Posição: (" + hori + ", " + vert + ")");
				bateria -= passos;
				System.err.println("Bateria atual: " + bateria);
			} // fim do if
			
			
			//querto while
			while(hori ==3  && 3< vert && vert <= 5) {

				// pega a direção do robo
				do {
					System.out.println("Qual a direção o robô irá andar:");
					direcao = in.next();
				} while (!direcao.equalsIgnoreCase("tras"));

				// pega a quantidade de passos
				do {
					System.out.println("Quanto passos ele andará:");
					passos = in.nextInt();
				} while (passos < 0);

				// verifica a direção
				
					vert -= passos;

				// passos a mais
				if (vert < 3) {
					System.out.println("Voce se deparou com uma parede, os passos excedentes não foram contados");
					while (vert <= 2) {
						vert++;
						passos--;
					}
				}
				if(vert==3)
					System.out.println("Voce completou a Quarta parte do desafio! Ja foi mais da metade");
				
				 
				System.out.println("Atual Posição: (" + hori + ", " + vert + ")");
				bateria -= passos;
				System.err.println("Bateria atual: " + bateria);
			} // fim do if
			
			//quinto while
			while(hori <11 && hori >=3 && vert == 3) {

				// pega a direção do robo
				do {
					System.out.println("Qual a direção o robô irá andar:");
					direcao = in.next();
				} while (!direcao.equalsIgnoreCase("direita"));

				// pega a quantidade de passos
				do {
					System.out.println("Quanto passos ele andará:");
					passos = in.nextInt();
				} while (passos < 0);

				// verifica a direção
					hori += passos;

				// passos a mais
				if (hori > 11) {
					System.out.println("Voce se deparou com uma parede, os passos excedentes não foram contados");
					while (hori >= 12) {
						hori--;
						passos--;
					}
					
				}
				if(hori==11)
					System.out.println("Você completou a quinta parte do labirinto!"); 
				
				System.out.println("Atual Posição: (" + hori + ", " + vert + ")");
				bateria -= passos;
				System.err.println("Bateria atual: " + bateria);
				
				
			} // fim do while
			
			
			//sex(hihi)to while
			while(hori ==11  && 3<= vert && vert < 7) {

				// pega a direção do robo
				do {
					System.out.println("Qual a direção o robô irá andar:");
					direcao = in.next();
				} while (!direcao.equalsIgnoreCase("frente"));

				// pega a quantidade de passos
				do {
					System.out.println("Quanto passos ele andará:");
					passos = in.nextInt();
				} while (passos < 0);

				// verifica a direção
				
					vert += passos;

				// passos a mais
				if (vert > 7) {
					System.out.println("Voce se deparou com uma parede, os passos excedentes não foram contados");
					while (vert >= 8) {
						vert--;
						passos--;
					}
				}
				if(vert==7)
					System.out.println("Voce completou a Sexta parte do desafio! Ta quase");
				
				 
				System.out.println("Atual Posição: (" + hori + ", " + vert + ")");
				bateria -= passos;
				System.err.println("Bateria atual: " + bateria);
			} // fim do if
			
			
			//setimo e ultimo while
			//FINALMENTE
			while(hori <15&& hori >=11 && vert == 7) {

				// pega a direção do robo
				do {
					System.out.println("Qual a direção o robô irá andar:");
					direcao = in.next();
				} while (!direcao.equalsIgnoreCase("direita"));

				// pega a quantidade de passos
				do {
					System.out.println("Quanto passos ele andará:");
					passos = in.nextInt();
				} while (passos < 0);

				// verifica a direção
					hori += passos;

				// passos a mais
				if (hori > 15) {
					System.out.println("Voce chegou ao fim do labirinto, os passos excedentes não foram contados");
					while (hori >= 16) {
						hori--;
						passos--;
					}
				}
				}
				 
				System.out.println("Atual Posição: (" + hori + ", " + vert + ")");
				bateria -= passos;
				System.err.println("Bateria atual: " + bateria);
				if(hori==15)
					System.out.println("VOCÊ COMPLETOU DO LABIRINTO!! EU NUNCA ACREDITEI QUE CHEGARIA TÃO LONGE");
				break;
				
		} // fim do whilezao

		
		
		
		
		
		if (bateria <= 0 && hori!=15 && vert!=7) {
			System.out.println("Fim de jogo! Sem bateria");
		}

		in.close();
	}
}

/*
 * if (direcao.equalsIgnoreCase("esquerda")) hori = hori - passos; if
 * (direcao.equalsIgnoreCase("frente")) vert = vert + passos; if
 * (direcao.equalsIgnoreCase("tras")) vert = vert - passos;
 */