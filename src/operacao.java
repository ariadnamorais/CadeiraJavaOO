import java.util.Scanner;

/*Ir� ter um menu com as op��es de saque, 
 * deposito e saldo, acessando o objeto conta;
 * Usar if e else*/
public class operacao extends conta {
		
	public void mostrar(){
		System.out.println("++++++++Conta++++++++");
		System.out.println("Nome titular: " +titular);
		System.out.println("Numero conta: " +numeroConta);
		System.out.println("\n ++Digite a op��o desejada++");
		System.out.print("\n [1] Saque ");
		System.out.print("\n [2] Dep�sito ");
		System.out.print("\n [3] Saldo " );
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("\n Op��o: ");
			digitado = ler.nextInt();
			
			System.out.println("\n Valor: ");
			valor = ler.nextDouble();
		}
				
	}
	
	public void transacao() {
		if (digitado == 1) {
			saldo = saldo - valor;
			System.out.println("Saldo atual: " +saldo);
		} else if (digitado == 2 ) {
			saldo = saldo + valor;
			System.out.println("Saldo atual: " +saldo);
		}else {
			System.out.println("Saldo atual: " +saldo);
		}
	}

}
