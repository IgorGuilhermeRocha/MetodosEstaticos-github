package metodos_estaticos;

import java.util.Scanner;

public class Ex8 {

	public static double power(int num1, int num2) {
		double poten = num1;
		if (num2 != 0) {
			for (int c = 1; c < num2; c++) {
				poten *= poten;
			}
			return poten;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int num1 = in.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = in.nextInt();

		System.out.println("Resultado: "+Ex8.power(num1, num2));

	}

}
