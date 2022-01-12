package das;

public class asdgsd {
	private static boolean esPrimo (int n){
	int i,c = 0;
	i = n - 1 ;
	while(i  > 1 ) {
		if(n % i == 0) {
			
			++c;
			}
		--i;
		
}
	if(c != 0 ) return false;
	else return true;
	
	
	}
	public static void imPrimo(int n) {
		int cont=0;
		for(int m=n;cont<m;++cont) {
			if(esPrimo(cont))System.out.println(cont);
		}
	}
}
