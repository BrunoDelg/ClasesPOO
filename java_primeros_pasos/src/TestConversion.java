
public class TestConversion { //Las clases por convencion se incian con mayuscula
	public static void main(String[] args) {
		//Funciones y variales se comienzan con minuscula
		double salario = 1270.50;
		int valor = (int) salario;  //A esto se le llama Cast, lo estamos forzando a que nos de otro valor diferente.
		
		//El cast se realiza cuando abra perdida de la información por ejemplo converitir de mas a menos, como es el caso
		//de int y double.
		
		System.out.println(valor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		System.out.println(valor1 + valor2);
		
		//El float nos ayuda como el double solo que este es de 32 bits, por lo que almacena menos digitos, se coloca una F al final
		float puntoFlotante = 3.14F;
		//Long es para un numero entero muy largo, y se especifica el tipo de dato con la L el final
		long numeroLong = 1222222222222222222L;
		//Short tipo de dato que soporta 16 bits
		short numeroCorto = 12222;
		//Byte solos soporta 8 bits de tamaño
		byte numeroAunMasCorto = 122;
		
		//Los tamaños son los siguientes
		//boolean = 1 byte
		//byte = 1 byte
		//short = 2 bytes
		//char = 2 bytes
		//int = 4 bytes
		//float = 4 bytes
		//long = 8 bytes
		//double = 8 bytes
		
	}
}
