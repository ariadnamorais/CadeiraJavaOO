/*Conta - instancia a conta*/

public class principal {
	
	public static void main(String[] args) {
		
		operacao o = new operacao();
		
		o.setTitular("Ariadna Morais");		
		o.setNumeroConta(598);
		o.setSaldo(100);
		
		o.mostrar();
		o.transacao();
			
	}
		
}
