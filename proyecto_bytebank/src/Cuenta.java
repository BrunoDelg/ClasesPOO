
class Cuenta {
	
	//Este seria nuestro esqueleto mejor conocido como clase
	//Una clase es un conjunto de comportamientos y cracteristicas que definen el conjunto
	//de objetos pertenecientes a la clase

	private double saldo; //El encapsulamiento se realiza con private o public
	private int agencia;
	private int numero;              //Estos son nuestros atributos a lo cuales vamos a asignar valores
	private Cliente titular; //Podemos inicializar la varibale desde aqui con 
	                         //Cliente titular = new Cliente();
	
	private static int total = 0; //El static hace que la variable se contemple dentro de la clase
	                              //Y no dentro de las instancias
	
	public Cuenta(int agencia) { //Esto es llamado un constructor, que nos ayuda a inicializa las variables
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		
		total++;
	}
	
	public void deposita (double valor) { //Este es nuestro metodo agregamos el void cuando no 
		                                  //no queremos que nos retorne ningun valor
		this.saldo += valor; //Con this especificamos que es this object
	}
	
	public boolean retiro (double valor) { //Este metodo es de tipo boolean por si ocupamos
		if (this.saldo >= valor) {         //Un retorno
			this.saldo -= valor;
			return true;
		} 
		return false; //Asi se usa normalmente sin usar el else y es lo mas comun.
	}
	
	public boolean transferir (double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.deposita(valor);
			return true;
		} else {
			return false;
		}	
	}
	
	public double getSaldo() { //Por convencion se escriben con get y set llamados getter y setter
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia >= 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No se permiten numeros negativos");
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
}
