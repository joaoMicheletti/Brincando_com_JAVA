package main;

import java.util.Scanner;

public class Calculadora {
	//metodo de soma
	public void Somar(double n1, double n2){
		double resultado = n1 + n2;
		System.out.println("Resultado da soma é : "+ resultado);
	}
	//metodo para multiplicar;
	public void Moltiplicar(double n1, double n2){
		double resultado = n1 * n2;
		System.out.println("Resoltado  da Multiplicação é >>> "+ resultado);
	}
	//metodo divisão
	public void Divisao(double n1, double n2){
		double resultado = n1 / n2;
		System.out.println("O resultado da divisão é >>>> "+ resultado);
	}
	// methode de subtrção.
	public void Subtracao(double n1 , double n2){
		double resultado = n1 - n2;
		System.out.println("Resultado da Subtração é >>> "+ resultado);
	}

	public static void main(String[] args) {
		//instânciando a class Calculadora;
		Calculadora calculadora = new Calculadora();
		System.out.println("Calculadora Construida com Java");
		System.out.println("""
				=============MENU===========|
				[1] = Somar.				|
				[2] = Subtrair				|
				[3] = Multiplicar.			|
				[4] = Divisão				|
				============================|""");
		//instânciando o scanner;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual a operação desejada :_ ");
		int menuOption = scanner.nextInt();
		if(menuOption == 1){
			System.out.println("Selecionando soma");
			System.out.println("Digite o numerador :_ ");
			double n1 = scanner.nextDouble();
			System.out.println("Digite o denomidador :_ ");
			double n2 = scanner.nextDouble();
			calculadora.Somar(n1, n2);
		} else if (menuOption == 2) {
			System.out.println("Selecionando Subtração");
			System.out.println("Digite o numerador :_ ");
			double n1 = scanner.nextDouble();
			System.out.println("Digite o denominador :_ ");
			double n2 = scanner.nextDouble();
			calculadora.Subtracao(n1, n2);
			System.out.println();
		} else if (menuOption == 3) {
			System.out.println("Selecionando a Multiplicação");
			System.out.println("Digite o numerador :_ ");
			double n1 = scanner.nextDouble();
			System.out.println("Digite o denominador :_ ");
			double n2 = scanner.nextDouble();
			calculadora.Moltiplicar(n1, n2);
		} else if (menuOption == 4) {
			System.out.println("Selecionar a Divisão");
			System.out.println("Digite o numerador :_ ");
			double n1 = scanner.nextDouble();
			System.out.println("Digite o denominador :_ ");
			double n2 = scanner.nextDouble();
			calculadora.Divisao(n1, n2);
		} else  {
			System.out.println("Operação invalida");
		}
	}
}
