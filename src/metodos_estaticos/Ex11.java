package metodos_estaticos;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o preço da roupa: ");
		double x = in.nextDouble();
		
		System.out.print("Digite o percentual de aumento para o pagamento a vista: ");
		double y = in.nextDouble();
		
		double preco_Final = Ex11.aumento(x, y);
		System.out.println("Preço após reajuste = "+preco_Final);
	}
	
	public static double aumento(double x,double y) {
		double z = x + (x * y )/100;
		return z ;
	}

}
