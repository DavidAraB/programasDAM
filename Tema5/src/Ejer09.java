import java.util.Scanner;

public class Ejer09 {

	
	public static void raiz(int a,int b, int c) {
		double resultado1=0,resultado2=0;
		if(b*b-4*a*c>0) {
		resultado1 = ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
		resultado2 = ((-b-Math.sqrt(b*b-4*a*c))/(2*a));
		System.out.println(resultado1+" y " + resultado2);
		}
		else System.out.println("Esta ecuacion no tiene soluciones reales");
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a=teclado.nextInt(),b=teclado.nextInt(),c=teclado.nextInt();
		raiz(a,b,c);
		
	}

}