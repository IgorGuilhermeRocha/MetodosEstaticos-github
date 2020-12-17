package metodos_estaticos;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = in.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = in.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int num3 = in.nextInt();
		
		System.out.println("Menor número = "+Ex9.menor(num1, num2, num3));

	}
	
	public static int menor(int num1,int num2,int num3) {
		if (num1 < num2 && num1 < num3) {
			return num1;
		} else if (num2 < num3) {
			return num2;
		} else {
			return num3;
		}
	}

}
