
public class Princiapal {

	public static void main(String[] args) {
		int a=5,b=0;
		try {
			
			double resultado;
			resultado = a/b;
			System.out.println("O resultado de divisão é:" +resultado);
		}catch (ArithmeticException e) {
			System.out.println("Você não pode dividir por zero");
		}finally {
			System.out.println("a = "+ a);
			System.out.println("b = "+ b);
			System.out.println("Fim do programa");
		}
	}

}
