package br.fai.ex03;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		Scanner scanner = new Scanner(System.in);
		int idade;
		
		System.out.println("Entre com a idade: ");
		idade = scanner.nextInt();
		
		if (idade > 20) {
			System.out.println("Idade maior que 20.");
		} else if (idade > 12 && idade < 17) {
			System.out.println("Idade maior que 12 e menor que 17.");	
		} else if (idade == 7 || idade < 5) {
			System.out.println("Idade igual a 7 ou menor que 5.");
		} else {
			System.out.println("Outras combina��es.");
		}
	}
}