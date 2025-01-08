import java.util.Scanner;

public class IsiBank {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Conta conta1 = new Conta(12345,8,"Anderson","123.885.784.29");
		double valor;
		int opcao;
		
		do {
			System.out.println("*** IsiBank ***");
			System.out.println("1 - Extrato / 2 - Depósito / 3 - Saque / -1 - Encerrar");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println(conta1.infoConta());
				break;
			case 2:
				System.out.println("Insira o valor que deseja depositar: ");
				valor = teclado.nextDouble();
				conta1.depositar(valor);
				System.out.println("Depósito realizado!");
				break;
			case 3:
				System.out.println("Insira o valor que deseja sacar: ");
				valor = teclado.nextDouble();
				if (!conta1.sacar(valor)) {
					System.out.println("Valor indisponível para saque. Consulte seu saldo.");
				} else {
					System.out.println("Saque realizado com sucesso.");
					}
				break;
				
			case -1:
				System.out.println("Obrigado por utilizar nossso servicos");
				break;
			default:
				System.out.println("Opçao invalida.");
			}
			
		} while (opcao != -1);
		
		
		teclado.close();
	}
}
