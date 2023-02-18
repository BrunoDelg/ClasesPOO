
public class CreaCuenta {
	//Esta cuenta hace referencia a una instancia u objeto cada objeto tiene el esqueleto 
	//de una clase pero cada objeto es independiente entre si
	//El objeto es un ente abstracto que representa atributos y caracteristicas qeu hacen palpable
	//a la clase
	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta(25);  //new es la manera de decir que cree un nuevo espacio
		                                      //en memoria e inicializa las variables que tenemos
		                                      //en el objeto y la Variable seria la referencia
		                                      // a ese espacio en memoria
		primeraCuenta.deposita(200);
		//primeraCuenta.saldo = 200; //Asi agregamos valores 
		System.out.println(primeraCuenta.getSaldo());
		
		primeraCuenta.deposita(100);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = primeraCuenta; //Aqui se esta referenciado al mismo espacio en memoria
		segundaCuenta.deposita(50);
		
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(segundaCuenta);
		System.out.println(primeraCuenta);// Como vemos aqui estan los mismo IDs
		
		
		
		Cuenta terceraCuenta = new Cuenta(24); //Este ya sera una nueva cuenta y va entre parentesis
		                                     //por que se referencia a la Cuenta (la clase)
		terceraCuenta.deposita(200);
		
		System.out.println(terceraCuenta.getSaldo()); //Como vemos cada saldo es independiente
		System.out.println(primeraCuenta.getSaldo());
	}
}
