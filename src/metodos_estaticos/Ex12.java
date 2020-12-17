package metodos_estaticos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
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
		
		double maior = Ex12.maior(list);
		
		System.out.println("Maior númeo: "+maior);

	}

	public static double maior(List<Double> l) {
		double maior = l.get(0);
		for (int c = 0; c < l.size(); c++) {
			if (maior < l.get(c)) {
				maior = l.get(c);
			}
		}
		return maior;

	}

}
