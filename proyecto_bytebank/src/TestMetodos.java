
public class TestMetodos {
	public static void main(String[] args) {

		Cuenta miCuenta = new Cuenta(35);
		miCuenta.deposita(300); 

		System.out.println(miCuenta.getSaldo());

		miCuenta.deposita(500);
		System.out.println(miCuenta.getSaldo());

		miCuenta.retiro(200);
		System.out.println(miCuenta.getSaldo());

		Cuenta cuentaXimena = new Cuenta(34);
		//Este es el ejmplo normal

		miCuenta.transferir(200, cuentaXimena);
		System.out.println(cuentaXimena.getSaldo());
		//Este con codigo simplificado
		boolean puedeTransferir = miCuenta.transferir(100, cuentaXimena); //Nos permite compilar ya que
		                                                    //el resultado nos da retorna un booleano
		if (puedeTransferir) {
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No se pudo realizar la transferencia");
		}
		
		System.out.println(cuentaXimena.getSaldo());
	}
}
