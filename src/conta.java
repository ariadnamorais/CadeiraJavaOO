/*Atributos: numeroConta, titular, saldo;

Construtor;
Métodos
Saque, deposito, saldo;*/
public class conta {
	int numeroConta, digitado;
	String titular;
	double saque, deposito, saldo, valor;

	public conta(String titular, int numeroConta, double saldo, double deposito, double saque, double valor) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.deposito = deposito;
		this.saque = saque;
		this.valor = valor;
		
	}
	
	public conta() {
		
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaque() {
		return saque;
	}
	public void setSaque(double saque) {
		this.saque = saque;
	}
	public double getDeposuto() {
		return deposito;
	}
	public void setDeposuto(double deposuto) {
		this.deposito = deposuto;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getDigitado() {
		return digitado;
	}
	public void setDigitado(int digitado) {
		this.digitado = digitado;
	}

	

	
}
