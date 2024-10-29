package proyecto_git;

import java.util.Scanner;

public class sumadosnumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1=Integer.parseInt(scan.nextLine());
		int num2=Integer.parseInt(scan.nextLine());
		int resultado = (num1+num2);
		System.out.println(resultado);
		
		if (resultado%2 == 0) {
			System.out.println("El número es par.");
		}
		else {
			System.out.println("El número es impar.");
		}
	}

}
