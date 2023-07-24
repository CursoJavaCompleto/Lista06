package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria cb = new ContaBancaria();

		System.out.println("Informe o número da conta: ");
		int numeroDaConta = sc.nextInt();

		System.out.println("Informe o titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();

		System.out.println("Depósito inicial (y/n)?");
		String depositoInicial = sc.nextLine();

		if (depositoInicial.equalsIgnoreCase("y")) {
			System.out.println("Informe o valor do depósito:");
			double valorDepositoInicial = sc.nextDouble();
			cb = new ContaBancaria(numeroDaConta, titular, valorDepositoInicial);
		} else {
			cb = new ContaBancaria(numeroDaConta, titular);
		}

		System.out.println(cb);
		
		System.out.println("Informe um valor para depositar: ");
		double deposito = sc.nextDouble();
		cb.deposito(deposito);
		System.out.println("Informações da conta atualizada:");
		System.out.println(cb);

		System.out.println("Informe o valor do saque:");
		double saque = sc.nextDouble();
		cb.saque(saque);
		System.out.println("Informações da conta atualizada:");
		System.out.println(cb);
		
		sc.close();

	}

}
