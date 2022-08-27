import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nombreUsuario = "";
		String requiereCantidadInicial;
		int option;
		
		System.out.println("----- Java Cuenta de Banco App -----");
		
		while(nombreUsuario == "") {
			System.out.println("Ingrese el nombre de usuario: ");
			nombreUsuario = in.nextLine();
			if (nombreUsuario == "") System.out.println("~> Es necesario el nombre.");
		}
		
		System.out.println("Desea ingresar cantidad inicial? (s/n): ");
		requiereCantidadInicial = in.nextLine();
		
		CuentaBanco c01 = new CuentaBanco(nombreUsuario);
		
		if (requiereCantidadInicial.equals("s")) {
			System.out.println("Ingresar cuenta incial: ");
			double cantidad = in.nextInt();
			c01.ingresar(cantidad);
					
		} else {
			System.out.println(requiereCantidadInicial);
			System.out.println("No requiere cantidad inicial");
		}
		
		while(true) {
			System.out.println("------------ Menu ------------");
			System.out.println("[1] Ingresar cantidad.\n[2] Retirar cantidad.\n[3] Imprimir informacion.\n[4] Salir.");
			option = in.nextInt();
			switch(option) {
			case 1:
				System.out.println("Escriba cantidad a ingresar: ");
				double cantidadIngresar = in.nextInt();
				c01.ingresar(cantidadIngresar);
				break;
			case 2:
				System.out.println("Case 02");
				System.out.println("Escriba cantidad a retirar: ");
				double cantidadRetirar = in.nextInt();
				c01.retirar(cantidadRetirar);
				break;
			case 3:
				System.out.println("--- Informacion de usuario ---");
				System.out.println(c01.toString());
				System.out.println("------------------------------");
				break;
			case 4:
				System.out.println("Ok, Adios ^_^/");
				return;
			default:
				System.out.println("Comando no valido.");
			}
		}
	}
}
