import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		int y = 32; // INTEIRO VOU CHAMAR DE y RECEBE 32
		double x = 10.35784;
		System.out.println("Ol� Mundo!!"); // IMPRIMA PARA O QUE EST� DENTRO DE ("")
		System.out.println("Bom dia!!"); // IMPRIMA PARA O QUE EST� DENTRO DE ("")
		System.out.println(y); // IMPRIMA PARA MIM O VALOR DE y
		System.out.printf("%.2f%n", x); // DUAS CASAS DECIMAIS USANDO ,VIRGULA
		System.out.printf("%.4f%n", x); // QUATRO CASAS DECIMAIS USANDO ,VIRGULA
		Locale.setDefault(Locale.US); // PADR�O DOS EUA USANDO .PONTO NO LUGAR DA VIRGULA
		System.out.printf("%.4f%n", x); // DUAS CASAS DECIMAIS
		System.out.println("RESULTADO = " + x + " METROS"); // CONCATENAR
		System.out.printf("RESULTADO = %.2f metros%n", x); // CONCATENAR V�RIOS ELEMENTOS
		// Marcadores: %f = pontoFlutuante, %d = inteiro, %s = texto, %n = quebra de
		// linha
		System.out.printf("%s tem %d anos e ganha R$ %.3f reais%n", nome, idade, renda); // CONCATENAR V�RIOS ELEMENTOS
	}
}
