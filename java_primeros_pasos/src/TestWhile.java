
public class TestWhile {
	
	public static void main(String[] args) {
		
		int contador = 0; //Es importante tener en cuenta que si declaramos la variable dentro del while, su scope sera hasta ahi.
		
		while (contador <= 10) {
			System.out.println(contador);
			
			contador++; //Podemos usar += 1, 2 3 etc.
		}
	}
	
}
