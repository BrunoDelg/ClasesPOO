
public class TestBucles {
	
	public static void main(String[] args) {
		
		for (int multiplicador = 1;multiplicador <= 10; multiplicador++) { //Es posible anidar los bucles.
			for (int contador = 0; contador <= 10; contador++) {
				System.out.print(contador * multiplicador);
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
	}

}