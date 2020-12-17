package metodos_estaticos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> list = new ArrayList();

		Scanner in = new Scanner(System.in);
		Scanner is = new Scanner(System.in);

		String r;

		do {
			System.out.print("Digite um número: ");
			double num = in.nextDouble();
			System.out.println("----------------------------------");

			list.add(num);

			System.out.print("Quer continuar (s/n)? ");
			r = is.nextLine();
			System.out.println("----------------------------------");

		} while (r.equalsIgnoreCase("S"));

		double menor = Ex13.menor(list);

		System.out.println("Maior número: " + menor);

	}

	public static double menor(List<Double> l) {
		double menor = l.get(0);
		for (int c = 0; c < l.size(); c++) {
			if (menor > l.get(c)) {
				menor = l.get(c);
			}
		}
		return menor;

	}

}
