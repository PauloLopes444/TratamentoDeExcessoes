import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2;
		double media;
		try {
			System.out.println("Digite o primeiro valor");
			n1 = leia.nextInt();
			System.out.println("Digite o segundo valor");
			n2 = leia.nextInt();
			media = n1/n2;
			System.out.println("A media foi:"+media);
		}catch (InputMismatchException e) {
			System.out.println("Você colocou um valor errado."+ "Por exemplo, no lugar de um número, você colocou um caractere");
		}catch (ArithmeticException e) {
			System.out.println("Você tentou fazer uma divisão impossísvel");
		}

	}

}
