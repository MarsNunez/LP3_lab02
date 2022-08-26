
public class Principal {
	public static void main(String[] args) {
		CuentaBanco c01 = new CuentaBanco("John Doe");
		CuentaBanco c02 = new CuentaBanco("Jack Hanma", 90.50);
		
		System.out.println(c01.toString());
		System.out.println(c02.toString());
	}
}




