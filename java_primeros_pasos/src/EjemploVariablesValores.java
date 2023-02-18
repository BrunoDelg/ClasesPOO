
public class EjemploVariablesValores {
	
	public static void main(String[] args) {
		
		int numero1 = 5;
		int numero2 = 9;
		
		System.out.println(numero2);
		
		numero2 = numero1;
		System.out.println(numero2);
		
		numero1 = 88;
		System.out.println(numero2); //Veremos que se imprimira el 5, ya que java almacena memoria (valores) no punteros ni rutas, en este caso se queda
		//con el valor ya asignado no con referencias.
	}

}
