package aula01;
import java.util.Scanner;

public class While {
	public static boolean ehMaiorDeIdade(int idade) {
		if(idade >= 18) {
			System.out.println(idade + " anos eh maior de idade \n");
			return true;
		}
		System.out.println(idade + " anos eh menor de idade \n");
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade = 0;
		System.out.println("Digite sua idade:");
		idade = scanner.nextInt();
		while (!ehMaiorDeIdade(idade)) {
			System.out.println(" Digite novamente \n");
			idade = scanner.nextInt();
		}
		System.out.println("Voce eh maior de idade. Pode prosseguir");
	}
}
