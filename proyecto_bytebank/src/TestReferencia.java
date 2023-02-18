
public class TestReferencia {
	public static void main(String[] args) {
		
		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setNumeroIdentidad("333546");
		diego.setProfesion("Doctor");
		
		Cuenta cuentaDeDiego = new Cuenta (1);
		cuentaDeDiego.deposita(300);
		cuentaDeDiego.setTitular(diego); //De esta manera los relacionamos al cliente y cuenta
		System.out.println(cuentaDeDiego.getTitular().getNumeroIdentidad()); //Ya podemos acceder a cliente desde
		                                                           //Cuenta
		System.out.println(cuentaDeDiego.getTitular()); //Nos da la direccion de memoria
		System.out.println(diego); //Como vemos aqui tambien hace referencia al mismo espacio en memoria
	}
}
