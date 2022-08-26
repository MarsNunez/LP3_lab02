import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		double cantidad;
		double cantidadRetirar;
		Scanner in = new Scanner(System.in);
		
//		INGRESAR CANTIDAD
		CuentaBanco c03 = new CuentaBanco("Max Power");

		System.out.println("Ingrese cantidad($): ");
		cantidad = in.nextDouble();
		
		c03.ingresar(cantidad);
		System.out.println(c03.toString());
		
		System.out.println("****************************");
		
//		RETIRAR CANTIDAD
		CuentaBanco c01 = new CuentaBanco("John Doe", 100);
		
		System.out.println("Ingresar cantiad a retirar($): ");
		cantidadRetirar = in.nextDouble();
		
		c01.retirar(cantidadRetirar);
		System.out.println(c01.toString());
	}
}




