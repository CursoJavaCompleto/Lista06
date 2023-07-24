package entities;

public class ContaBancaria {

	private int numero;
	private String titular;
	private double saldo;

	public ContaBancaria() {
	}

	public ContaBancaria(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public ContaBancaria(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String nome) {
		this.titular = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public String toString() {
		return "Dados da conta: [Conta " + numero + ", Titular: " + titular + ", Saldo: R$ " + saldo + "]";
	}

	public void deposito(double deposito) {
		saldo += deposito;
	}

	public void saque(double saque) {
		saldo -= saque + 5;
	}

}
