
public class TestConstructor {
	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta(222);
		Cuenta cuenta2 = new Cuenta(-22);
		
		System.out.println(Cuenta.getTotal());
	}
}
