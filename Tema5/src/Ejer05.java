import java.util.Scanner;

public class Ejer05 {
	int P;
	int Q;	
	public int gp() {
		return P;
	}
	public  void sp(int P) {
		this.P = P;
	}
	public int gq() {
		return Q;
	}
	public void sq(int Q) {
		this.Q = Q;
	}
		/**
		 * @param P numero positivo
		 * @param Q numero positivo
		 * @return el maximo comun divisor entre P y Q 
		 */
	 int mcd() {
		
		int i,c1 = 0;
		if(P>=0 && Q>=0) {
			for(i=1;i<=P;++i) {
				if(P % i == 0 && Q % i == 0)c1=i;		
			}
		}return c1;
	}

	public static void main(String[] args) {
		Ejer05 mcd = new Ejer05();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce dos numeros para hallar su m.c.d.");
		int P=teclado.nextInt(),Q=teclado.nextInt();
		mcd.sp(P);
		mcd.sq(Q);
		System.out.println("El m.c.d. de "+P+" y "+Q+" es: "+mcd.mcd());

	}

}