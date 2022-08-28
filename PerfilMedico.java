import java.util.Date;

public class PerfilMedico {
	String nombre;
	String apellido;
	String sexo;
	String fechaNacimiento; // dia, mes, año
	int altura; // cm
	double peso; // kg
	
	PerfilMedico(String nombre, String apellido, String sexo, String fechaNacimiento, 
			int altura, double peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.altura = altura;
		this.peso = peso;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void calcEdadUsuario() {
		String[] datosNacimiento = fechaNacimiento.split(" ");
		int anio = Integer.parseInt(datosNacimiento[2]);
		
		Date dt = new Date();
		int currentYear = dt.getYear() + 1900;
		System.out.println("Edad del usuario: " + (currentYear - anio) + " años.");
	}
	
	public void calcFrecuenciaCardiaca() {
		String[] datosNacimiento = fechaNacimiento.split(" ");
		int edad = Integer.parseInt(datosNacimiento[0]);
		System.out.println("Frecuencia cardiaca maxima: " + (208 - (0.7 * edad)));
	}
	
	public void calcMasaCorporal() {
		System.out.println("Masa corporal: " + (peso / altura));
	}
	
	@Override
	public String toString() {
		return "* --------- *  Datos * --------- *\nNombre: " + nombre + "\nApellido: "
				+ apellido + "\nSexo: " + sexo + "\nFecha de nacimiento: " + fechaNacimiento
				+ "\nAltura: " + altura + "\nPeso: " + peso + "\n";
	}
}










