
public class CuentaBanco {
	public String titular;
	public double cantidad = 0.0;
	
	CuentaBanco(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	CuentaBanco(String titular) {
		this.titular = titular;
	}
	
	@Override
	public String toString() {
		return "Titular:" + titular + "\nCantidad: " + cantidad + "$\n";
	}
}


