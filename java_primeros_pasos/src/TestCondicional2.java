
public class TestCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("Creando condicionales");
		
		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean acompañado = cantidadPersonas >= 2; //boolean solo recibe valores true o false
		
		//Podemos condicionar el valor
		
		if (edad >= 18 && acompañado) { //Usamos || como or y && como and
			System.out.println("Bienvenido");
		} else
				System.out.println("Lamentablemente "
						+ "no puedes ingresar");
		}
		
	}
//Se puede hacer algo diferente en la condicion con boolean hacemos esto
		//boolean: puedeEntrar = edad >=18 && acompañado;
		//if (puedeEntrar);
		//Y de esta manera nos ahorramos codigo y se realiza la misma accion
