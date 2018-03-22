package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	private static int DIAS_UTEIS = 22;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salário mensal do funcionário:");
		String salario = sc.nextLine();
		double salarioAsDouble = Double.parseDouble(salario);

		System.out.println("Digite o os dias trabalhados do no mês:");
		String dias = sc.nextLine();
		double diasAsDouble = Double.parseDouble(dias);

		if (validaSalario(salario) && validaDias(dias)) {
			System.out.println("Erro no input de dados! Fechando");
		}

		double proporcional = (salarioAsDouble / DIAS_UTEIS) * diasAsDouble;
		System.out.println(String.format("O salario proporcional é : %1$,.2f", proporcional));

	}

	private static boolean validaDias(String dias) {

		if (!"".equals(dias)) {
			return false;
		}

		int diasAsInt = Integer.parseInt(dias);

		return diasAsInt <= DIAS_UTEIS;
	}

	private static boolean validaSalario(String salario) {
		return false;
	}

}
