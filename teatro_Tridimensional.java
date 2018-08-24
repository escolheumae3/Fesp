package Trabalho_Estrutura_26_08;

import java.util.Scanner;

public class teatro_Tridimensional {
	Scanner ler = new Scanner(System.in);
	int[][][] vetPlateia;
	int select2d, fila, cadeira;
	String aux;
	String str;
	int op = 0;

	public teatro_Tridimensional() {
		vetPlateia = new int[3][10][12];
	}

	public static void main(String[] args) throws InterruptedException {
		new teatro_Tridimensional().processar();
	}

	private void consultar() {
		System.out.println(" ");
		for (select2d = 0; select2d < vetPlateia.length; select2d++) {
			if (select2d == 0) {
				System.out.println("Plateia : ");
				System.out.println(" ");
				for (fila = 0; fila < vetPlateia[select2d].length; fila++) {
					for (cadeira = 0; cadeira < vetPlateia[select2d][fila].length; cadeira++) {
						if (vetPlateia[select2d][fila][cadeira] == 0) {
							System.out.print("  Vazia \t");
						} else {
							System.out.print("Reservada \t");
						}
					}
					System.out.println(" ");
				}
				System.out.println(" ");
			}
			if (select2d == 1) {
				System.out.println("Balcao 1 : ");
				System.out.println(" ");
				for (fila = 0; fila < 5; fila++) {
					for (cadeira = 0; cadeira < 7; cadeira++) {
						if (vetPlateia[select2d][fila][cadeira] == 0) {
							System.out.print("  Vazia \t");
						} else {
							System.out.print("Reservada \t");
						}
					}
					System.out.println(" ");
				}
				System.out.println(" ");
			}
			if (select2d == 2) {
				System.out.println("Balcao 2 : ");
				System.out.println(" ");
				for (fila = 0; fila < 3; fila++) {
					for (cadeira = 0; cadeira < 4; cadeira++) {
						if (vetPlateia[select2d][fila][cadeira] == 0) {
							System.out.print("  Vazia \t");
						} else {
							System.out.print("Reservada \t");
						}
					}
					System.out.println(" ");
				}
				System.out.println(" ");
			}

		}
		System.out.println(" ");
	}

	private void reservar() {
		while (true) {
			int indiceVerificador;
			indiceVerificador = verificaLotacao();
			if (indiceVerificador < 167) {
				boolean invalido = true;
				do {
					System.out.println(" ");
					System.out.println("Os blocos para reserva de cadeira sao: ");
					System.out.println("1 - Plateia");
					System.out.println("2 - Balcao 1");
					System.out.println("3 - Balcao 2");
					System.out.println("Informe o numero do bloco que quer reservar a cadeira :");
					op = converteString();
					select2d = op;
					if (op >= 1 && op <= 3) {
						invalido = false;
					} else {
						System.out.println(" ");
						System.out.println("Numero invalido. Digite novamente.");
						System.out.println(" ");
					}
				} while (invalido);
				if (op == 1) {
					invalido = true;
					do {
						System.out.println(" ");
						System.out.println("Digite o numero da Fila (1-10) em que deseja reservar a cadeira.");
						fila = converteString();
						if (fila >= 1 && fila <= 10) {
							invalido = false;
						} else {
							System.out.println(" ");
							System.out.println("Número invalido. Digite novamente.");
							System.out.println(" ");
						}
					} while (invalido);
					invalido = true;
					do {
						System.out.println(" ");
						System.out.println("Agora insira o numero da cadeira (1-12) que deseja reservar.");
						cadeira = converteString();
						if (cadeira >= 1 && cadeira <= 12) {
							invalido = false;
						} else {
							System.out.println(" ");
							System.out.println("Número invalido. Digite novamente.");
							System.out.println(" ");
						}
					} while (invalido);
					select2d = select2d - 1;
					fila = fila - 1;
					cadeira = cadeira - 1;
					if (vetPlateia[select2d][fila][cadeira] == 1) {
						System.out.println(" ");
						System.out
								.println("Sinto muito, mas esta cadeira ja esta reservada. Insira novamente os dados.");
						System.out.println(" ");
					} else {
						vetPlateia[select2d][fila][cadeira] = 1;
						System.out.println(" ");
						System.out.println("A cadeira foi reservada com sucesso.");
						System.out.println(" ");
						break;
					}
				}
				if (op == 2) {
					invalido = true;
					do {
						System.out.println(" ");
						System.out.println("Digite o numero da Fila (1-5) em que deseja reservar a cadeira.");
						System.out.println(" ");
						fila = converteString();
						if (fila >= 1 && fila <= 5) {
							invalido = false;
						} else {
							System.out.println(" ");
							System.out.println("Numero invalido. Digite novamente.");
							System.out.println(" ");
						}
					} while (invalido);
					invalido = true;
					do {
						System.out.println(" ");
						System.out.println("Digite o numero da cadeira (1-7) que deseja reservar");
						System.out.println(" ");
						cadeira = converteString();
						if (cadeira >= 1 && cadeira <= 7) {
							invalido = false;
						} else {
							System.out.println(" ");
							System.out.println("Numero invalido. Digite novamente.");
							System.out.println(" ");
						}
					} while (invalido);
					select2d = select2d - 1;
					fila = fila - 1;
					cadeira = cadeira - 1;
					if (vetPlateia[select2d][fila][cadeira] == 1) {
						System.out.println(" ");
						System.out
								.println("Sinto muito, mas essa cadeira ja esta reservada. Insira novamente os dados.");
						System.out.println(" ");
					} else {
						vetPlateia[select2d][fila][cadeira] = 1;
						System.out.println(" ");
						System.out.println("A cadeira foi reservada com sucesso.");
						System.out.println(" ");
						break;
					}
				}
				if (op == 3) {
					invalido = true;
					do {
						System.out.println(" ");
						System.out.println("Digite o numero da Fila (1-3) em que deseja reservar a cadeira.");
						System.out.println(" ");
						fila = converteString();
						if (fila >= 1 && fila <= 3) {
							invalido = false;
						} else {
							System.out.println(" ");
							System.out.println("Numero invalido. Digite novamente.");
							System.out.println(" ");
						}
					} while (invalido);
					invalido = true;
					do {
						System.out.println(" ");
						System.out.println("Digite o numero da cadeira (1-4) que deseja reservar.");
						System.out.println(" ");
						cadeira = converteString();
						if (cadeira >= 1 && cadeira <= 4) {
							invalido = false;
						} else {
							System.out.println(" ");
							System.out.println("Numero invalido. Digite novamente.");
							System.out.println(" ");
						}
					} while (invalido);
					select2d = select2d - 1;
					fila = fila - 1;
					cadeira = cadeira - 1;
					if (vetPlateia[select2d][fila][cadeira] == 1) {
						System.out.println(" ");
						System.out
								.println("Sinto muito, mas essa cadeira ja esta reservada. Insira novamente os dados.");
						System.out.println(" ");
					} else {
						vetPlateia[select2d][fila][cadeira] = 1;
						System.out.println(" ");
						System.out.println("A cadeira foi reservada com sucesso.");
						System.out.println(" ");
						break;
					}
				}
			} else {
				System.out.println(" ");
				System.out.println("Infelizmente nao e possivel reservar cadeiras, pois o Teatro ja esta lotado.");
				System.out.println(" ");
				break;
			}
		}
	}

	private int verificaLotacao() {
		int indiceVerificador = 0;
		for (select2d = 0; select2d < vetPlateia.length; select2d++) {
			if (select2d == 0) {
				for (fila = 0; fila < vetPlateia[select2d].length; fila++) {
					for (cadeira = 0; cadeira < vetPlateia[select2d][fila].length; cadeira++) {
						if (vetPlateia[select2d][fila][cadeira] == 1) {
							indiceVerificador = indiceVerificador + 1;
						}
					}
				}
			}
			if (select2d == 1) {
				for (fila = 0; fila < 5; fila++) {
					for (cadeira = 0; cadeira < 7; cadeira++) {
						if (vetPlateia[select2d][fila][cadeira] == 1) {
							indiceVerificador = indiceVerificador + 1;
						}
					}
				}
			}
			if (select2d == 2) {
				for (fila = 0; fila < 3; fila++) {
					for (cadeira = 0; cadeira < 4; cadeira++) {
						if (vetPlateia[select2d][fila][cadeira] == 1) {
							indiceVerificador = indiceVerificador + 1;
						}
					}
				}
			}
		}
		return indiceVerificador;
	}

	private void encheMatriz() {
		for (select2d = 0; select2d < vetPlateia.length; select2d++) {
			if (select2d == 0) {
				for (fila = 0; fila < vetPlateia[select2d].length; fila++) {
					for (cadeira = 0; cadeira < vetPlateia[select2d][fila].length; cadeira++) {
						vetPlateia[select2d][fila][cadeira] = 1;
					}
				}
			}
			if (select2d == 1) {
				for (fila = 0; fila < 5; fila++) {
					for (cadeira = 0; cadeira < 7; cadeira++) {
						vetPlateia[select2d][fila][cadeira] = 1;
					}
				}
			}
			if (select2d == 2) {
				for (fila = 0; fila < 3; fila++) {
					for (cadeira = 0; cadeira < 4; cadeira++) {
						vetPlateia[select2d][fila][cadeira] = 1;
					}
				}
			}
		}
		System.out.println(" ");
		System.out.println("Matriz carregada (Todas as cadeiras reservadas)!");
		System.out.println(" ");
	}

	private void esvaziaMatriz() {
		for (select2d = 0; select2d < vetPlateia.length; select2d++) {
			if (select2d == 0) {
				for (fila = 0; fila < vetPlateia[select2d].length; fila++) {
					for (cadeira = 0; cadeira < vetPlateia[select2d][fila].length; cadeira++) {
						vetPlateia[select2d][fila][cadeira] = 0;
					}
				}
			}
			if (select2d == 1) {
				for (fila = 0; fila < 5; fila++) {
					for (cadeira = 0; cadeira < 7; cadeira++) {
						vetPlateia[select2d][fila][cadeira] = 0;
					}
				}
			}
			if (select2d == 2) {
				for (fila = 0; fila < 3; fila++) {
					for (cadeira = 0; cadeira < 4; cadeira++) {
						vetPlateia[select2d][fila][cadeira] = 0;
					}
				}
			}
		}
		System.out.println(" ");
		System.out.println("Matriz esvaziada (Todas as cadeiras vazias)!");
		System.out.println(" ");
	}

	private int converteString() {
		int ret = 0;
		boolean invalido = true;
		do {
			str = ler.nextLine();
			try {
				ret = Integer.parseInt(str);
				invalido = false;
			} catch (NumberFormatException e) {
				System.out.println("Numero invalido. Verifique se digitou realmente um numero.");
			}
		} while (invalido);
		return ret;
	}

	private void processar() throws InterruptedException {
		Thread.sleep(100);
		System.out.println("Boas vindas ao Teatro v1.8.1 !!!");
		while (true) {
			Thread.sleep(500);
			System.out.println("+++++++++++++++++ MENU PRINCIPAL ++++++++++++++++++");
			System.out.println("Digite sua opção :");
			System.out.println("1 - Consultar cadeiras");
			System.out.println("2 - Reservar cadeira");
			System.out.println("3 - Lotar Teatro (Direcionado a Testes do desenvolvedor)");
			System.out.println("4 - Esvaziar Teatro (Direcionado a Testes do desenvolvedor)");
			System.out.println("9 - Sair do sistema");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
			op = converteString();
			switch (op) {
			case 1:
				consultar();
				break;
			case 2:
				reservar();
				break;
			case 3:
				encheMatriz();
				break;
			case 4:
				esvaziaMatriz();
				break;
			case 9:
				Thread.sleep(1000);
				System.out.println("Terminando execução...");
				Thread.sleep(1000);
				System.out.println("Coded by Tarick Luan | Nº 258907 | BSI 2ºA 4P ");
				Thread.sleep(500);
				System.out.println("Estrutura de Dados - Marco Aurelio Bonato - Copyright @ 2018");
				Thread.sleep(300);
				Thread.sleep(300);
				for (int i = 0; i < 70; i++) {
					Thread.sleep(25);
					System.out.println("Finalizando..........." + i + "%");
				}
				for (int i = 71; i < 99; i++) {
					System.out.println("Finalizando..........." + i + "%");
				}
				System.out.println("Finalizando...........99%");
				Thread.sleep(1000);
				System.out.println("Finalizado.");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida. Digite novamente.");
			}
		}
	}
}