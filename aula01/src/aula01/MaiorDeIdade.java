package aula01;

public class MaiorDeIdade {
	public static boolean ehMaiorDeIdade(int idade) {
		if(idade>= 18) {
			System.out.println(idade +" anos eh maior de idade");
			return true;
		}
		System.out.println(idade + " anos eh menor de idade");
		return false;
	}
	
	public static void main(String[] args) {
		int idade = 17;
		ehMaiorDeIdade(idade);
		idade = 22;
		ehMaiorDeIdade(idade);
		idade = 33;
		ehMaiorDeIdade(idade);
		idade = 4;
		ehMaiorDeIdade(idade);
	}
}
