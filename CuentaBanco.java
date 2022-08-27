public class CuentaBanco {
	public String titular;
	public double cantidad = 0;
	
	CuentaBanco(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	CuentaBanco(String titular) {
		this.titular = titular;
	}
	
	@Override
	public String toString() {
		return "Titular:" + titular + "\nCantidad: " + cantidad + "$";
	}
	
	public void ingresar(double cantidad) {
		if (cantidad < 0)
			System.out.println("~> Cantidad no valida.");
		else {
			this.cantidad += cantidad;
			System.out.println("~> Cantidad ingresada con exito.\n");			
		}
	}
	
	public void retirar(double cantidad) {
		if (cantidad < 0) {
			System.out.println("~> Numero no validdo."); 
			return;
		}
		
		this.cantidad -= cantidad;
		if (this.cantidad < 0) this.cantidad = 0;
	}
}
