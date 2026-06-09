package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;


public class Menu {

	public static final Scanner leia = new Scanner(System.in) ;
	public static void main(String[] args) {
		
		//Teste da Classe Conta Corrente 
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//Teste da Classe Poupança
		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		int opcao;
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+  "************************************************************");
			System.out.println("************************************************************");
			System.out.println("                                                            ");
			System.out.println("                  BANCO DO BRAZIL COM Z                     ");
			System.out.println("                                                            ");
			System.out.println("************************************************************");
			System.out.println("                                                            ");
			System.out.println("                 1 - Criar Conta                            ");
			System.out.println("                 2 - Listar todas as Contas                 ");
			System.out.println("                 3 - Buscar Conta por Numero                ");
			System.out.println("                 4 - Atualizar Dados da Conta               ");
			System.out.println("                 5 - Apagar Conta                           ");
			System.out.println("                 6 - Sacar                                  ");
			System.out.println("                 7 - Depositar                              ");
			System.out.println("                 8 - Transferir Valores entre Contas        ");
			System.out.println("                 0 - sair                                   ");
			System.out.println("                                                            ");
			System.out.println("************************************************************");
			System.out.println("Entre com a opção desejada:                                 ");
			System.out.println("                                                            ");
			System.out.println("                                                            " + Cores.TEXT_RESET);
			
			try {
			opcao = leia.nextInt();
			leia.nextLine();
			}catch(InputMismatchException e) {
				opcao = -1;
				System.out.println("\nDigite um número inteiro!");
				leia.nextLine();
			}
			if (opcao == 0) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu futuro começa aqui!");
				sobre();
					leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE +"Criar Conta\n\n");
					
					keyPress();
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE +"Listar todas as Contas\n\n");
					keyPress();
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE +"Consultar Dados da Conta - por número\n\n");
					keyPress();
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE +"Atualizar Dados da Conta\n\n");
					keyPress();
					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE +"Apagar a Conta\n\n");
					keyPress();
					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE +"Saque\n\n");
					keyPress();
					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE +"Depósito\n\n");
					keyPress();
					break;
				case 8:
					System.out.println(Cores.TEXT_RED_BOLD + "Transferência entre Contas\n\n" + Cores.TEXT_RESET);
					keyPress();
					break;
				default:
					System.out.println("Opção Inválida!\n\n");
					keyPress();
					break;
				
			}			 
		}
	}
	
	public static void sobre () {
			System.out.println("\n*******************************************************");
			System.out.println("Projeto Desenvolvido por:");
			System.out.println("Danielle Caricati - daniellecaricati1@gmail.com");
			System.out.println("github.com/daniellecaricati");
			System.out.println("\n*******************************************************");		
	}
	
	public static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
		leia.nextLine();
	}
}
