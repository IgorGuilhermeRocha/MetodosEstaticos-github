package metodos_estaticos;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite sua idade em anos: ");
		int id = in.nextInt();
		
		System.out.println("Dias vividos: "+Ex10.diasVividos(id));
	}
	
	public static int diasVividos(int id) {
		int dias = id * 365;
		return dias;
	}

}
