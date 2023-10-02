package aula01;

public class Incremento {
	public static boolean ehMaiorDeIdade (int idade) {
		if(idade >= 18) {
			System.out.println(idade + " anos eh maior de idade \n");
			return true;
		}
		System.out.println(idade + " anos eh menor de idade \n");
		return false;
	}
	
	public static void main(String[] args) {
		for (int idade = 0; !ehMaiorDeIdade(idade); idade++) {
			
		}
		System.out.println("Voce eh maior de idade. Pode prosseguir.");
	}
}
