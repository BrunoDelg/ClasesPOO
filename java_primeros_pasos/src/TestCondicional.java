
public class TestCondicional {
	
	public static void main(String[] args) {
		System.out.println("Creando condicionales");
		
		int edad = 17;
		int cantidad = 2;
		
		if (edad >= 18) {
			System.out.println("Puedes entrar");
			System.out.println("Bienvenido");
		} else {
			if (cantidad >= 2) {
				System.out.println("Eres menor de edad " //Podemos dar espacio en medio de la frase y se formateara sola, Ctrl F nos ayuda a formatear tambien
						+ "pero puedes ingresar "
						+ "por que estas acompañado");
			} else 
				System.out.println("Lamentablemente "
						+ "no puedes ingresar"); //Pódemos omitir los parentesis, y se tomara en cuenta la primer linea de codigo, la segunda ya no
		}
		
	}

}
