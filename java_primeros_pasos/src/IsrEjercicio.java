
public class IsrEjercicio {
	public static void main(String[] args) {
		
		//De 1900.0 a 2800.0, el IR es de 7.5% y puede deducir de la declaración el monto de 142.
		//De 2800.01 a 3751.0, el IR es del 15% y puede deducir 350.
		//De 3751.01 a 4664.00, el IR es 22.5% y puede deducir 636.
		
		double salario = 3300.0;
		
		if(salario >= 1990.0 && salario <= 2800.0) {
			System.out.println("Su tasa De ISR es de 7.5%");
			System.out.println("Puede deducir: 142");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("Su tasa De ISR es de 15%");
			System.out.println("Puede deducir: 350");
		} else if (salario >= 3751.01 && salario <= 4664.0) {
			System.out.println("Su tasa De ISR es de 22.5%");
			System.out.println("Puede deducir: 636");
		}
		
		
	}
}
