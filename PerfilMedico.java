
public class PerfilMedico {
	String nombre;
	String apellido;
	char sexo;
	String fechaNacimiento; // dia, mes, año
	int altura; // cm
	double peso; // kg
	
	PerfilMedico(String nombre, String apellido, char sexo, String fechaNacimiento, 
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
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public char getSexo() {
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
}









