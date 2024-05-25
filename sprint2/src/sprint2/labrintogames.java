package sprint2;

import java.util.Scanner;

public class labrintogames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String direcao;
		int passos, bateria;

		// regras
		System.out.println("Para complentar esse desafio seu robô deve chegar no fim do laribirinto (15,7)");
		System.out.println("Você poderá mover em apenas uma direção por comando, sendo os comandos e suas direçoes:");
		System.out.println("");
		System.out.println("ESQUERDA, para se mover para a esquerda;");
		System.out.println("Direita, para se mover para a direita;");
		System.out.println("FRENTE, para ir para baixo;");
		System.out.println("TRAS, para ir para cima.");
		System.out.println("");
		System.out.println("Alem disso será nescessario uma bateria de 38V, cada passo custara 1V");

		System.out.println("Quantos V tem sua bateria:");
		bateria = in.nextInt();

		System.out.println("Agora podemos começar.");
		System.out.println("Voce esta no bloco (1,9).");

		System.out.println("Qual a direção do robô irá andar:");
		direcao = in.next();
		System.out.println("Quanto passos ele andará:");
		passos = in.nextInt();

		if (direcao.equalsIgnoreCase("direita") && passos == 4) {
			System.out.println("Comando correto!");
			bateria = bateria - passos;
			System.out.println("Bateria Atual: " + bateria);
			if (bateria <= 0) {
				System.out.println("Bateria insufuciente!!");
				System.out.println("VOCÊ PERDEU!!!");
			} else {
				System.out.println("Qual será a proxima direção");
				direcao = in.next();
				System.out.println("Quanto passos ele andará:");
				passos = in.nextInt();
				// Segundo comando
				if (direcao.equalsIgnoreCase("tras") && passos == 4) {
					System.out.println("Comando correto!");
					bateria = bateria - passos;
					System.out.println("Bateria Atual: " + bateria);
					if (bateria <= 0) {
						System.out.println("Bateria insufuciente!!");
						System.out.println("VOCÊ PERDEU!!!");
					} else {
						System.out.println("Qual será a proxima direção");
						direcao = in.next();
						System.out.println("Quanto passos ele andará:");
						passos = in.nextInt();
						// Terceiro comando(Não esse que se ta pensando)
						if (direcao.equalsIgnoreCase("esquerda") && passos == 2) {
							System.out.println("Comando correto!");
							bateria = bateria - passos;
							System.out.println("Bateria Atual: " + bateria);
							if (bateria <= 0) {
								System.out.println("Bateria insufuciente!!");
								System.out.println("VOCÊ PERDEU!!!");
							} else {
								System.out.println("Qual será a proxima direção");
								direcao = in.next();
								System.out.println("Quanto passos ele andará:");
								passos = in.nextInt();

								// Quarto comando
								if (direcao.equalsIgnoreCase("tras") && passos == 2) {
									System.out.println("Comando correto!");
									bateria = bateria - passos;
									System.out.println("Bateria Atual: " + bateria);
									if (bateria <= 0) {
										System.out.println("Bateria insufuciente!!");
										System.out.println("VOCÊ PERDEU!!!");
									} else {
										System.out.println("Qual será a proxima direção");
										direcao = in.next();
										System.out.println("Quanto passos ele andará:");
										passos = in.nextInt();

										// Quinto comando
										if (direcao.equalsIgnoreCase("direita") && passos == 8) {
											System.out.println("Comando correto!");
											bateria = bateria - passos;
											System.out.println("Bateria Atual: " + bateria);
											if (bateria <= 0) {
												System.out.println("Bateria insufuciente!!");
												System.out.println("VOCÊ PERDEU!!!");
											} else {
												System.out.println("Qual será a proxima direção");
												direcao = in.next();
												System.out.println("Quanto passos ele andará:");
												passos = in.nextInt();

												// sexto comando
												if (direcao.equalsIgnoreCase("frente") && passos == 4) {
													System.out.println("Comando correto!");
													bateria = bateria - passos;
													System.out.println("Bateria Atual: " + bateria);
													if (bateria <= 0) {
														System.out.println("Bateria insufuciente!!");
														System.out.println("VOCÊ PERDEU!!!");
													} else {
														System.out.println("Qual será a proxima direção");
														direcao = in.next();
														System.out.println("Quanto passos ele andará:");
														passos = in.nextInt();

														// Setimo comando
														if (direcao.equalsIgnoreCase("direita") && passos == 4) {
															System.out.println("Comando correto!");
															bateria = bateria - passos;
															System.out.println("Bateria Atual: " + bateria);
															if (bateria <= 0) {
																System.out.println("Bateria insufuciente!!");
																System.out.println("VOCÊ PERDEU!!!");
															} else {// FINALMENTE ACOBOU
																	// CODIGO MAIS FEIO HORRIVEL FEDORENTO
																System.out.println("PARABÉNS!!!");
																System.out.println("Não fez mais que a sua obrigação.");
															}

														} else {
															System.out.println("VOCÊ PERDEU!!!");
															System.out.println("MELHORE!");
														}
													}

												} else {
													System.out.println("VOCÊ PERDEU!!!");
													System.out.println("MELHORE!");
												}
											}

										} else {
											System.out.println("VOCÊ PERDEU!!!");
											System.out.println("MELHORE!");
										}
									}

								} else {
									System.out.println("VOCÊ PERDEU!!!");
									System.out.println("MELHORE!");
								}
							}

						} else {
							System.out.println("VOCÊ PERDEU!!!");
							System.out.println("MELHORE!");
						}
					}

				} else {
					System.out.println("VOCÊ PERDEU!!!");
					System.out.println("MELHORE!");
				}
			}

		} else {
			System.out.println("VOCÊ PERDEU!!!");
			System.out.println("MELHORE!");
		}

		in.close();
	}

}
