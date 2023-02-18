
public class DesafioFactoriales {
	
	public static void main(String[] args) {
		
		int factorial = 1;
		
		for (int n = 1; n <= 10; n++) {
			System.out.println(n * factorial);
			factorial *= n;// Es la notación corta de factorial = factorial*n
		}
	}

}
