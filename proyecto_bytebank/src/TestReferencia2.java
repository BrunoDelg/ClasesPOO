
public class TestReferencia2 {
	public static void main(String[] args) {

		Cuenta cuentaDeDiego = new Cuenta(28);
		// Ejemplo:         null. value
		// cuentaDeDiego.titular.nombre = "Diego"; Este no compilara ya que no se ah
		// iniciado la variable y dra NullPointerException
		

		//Cliente diego2 = new Cliente();
		//cuentaDeDiego.titular = diego2; Esta lpodemos omitir debiodo al texto de abajo
		cuentaDeDiego.setTitular(new Cliente()); //Esta es otra froma de incializar la variable, ya que 
		                                  //titular esta haciendo referencia igual a la class Cliente

		System.out.println(cuentaDeDiego.getTitular().getNombre()); //Aqui ya nos imprime valor null
		
		cuentaDeDiego.getTitular().setNombre("Diego");
		System.out.println(cuentaDeDiego.getTitular().getNombre()); //Aqui ya nos imprime 



	}
}
