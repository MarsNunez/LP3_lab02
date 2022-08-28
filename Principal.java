import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String nombre;
		String apellido;
		String sexo;
		String fechaNacimiento;
		int altura;
		double peso;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingresar nombre: ");
		nombre = in.nextLine();
		System.out.println("Ingresar apellido: ");
		apellido = in.nextLine();
		System.out.println("Ingresar sexo (m/f): ");
		sexo = in.nextLine();
		System.out.println("Ingresar fecha de nacimiento (dia/mes/año): ");
		fechaNacimiento = in.nextLine();
		System.out.println("Ingresar altura (cm): ");
		altura = in.nextInt();
		System.out.println("Ingresar peso (kg): ");
		peso = in.nextInt();
		
		PerfilMedico p01 = new PerfilMedico(nombre, apellido, sexo, fechaNacimiento, altura, peso);
		System.out.println(p01.toString());
		p01.calcEdadUsuario();
		p01.calcFrecuenciaCardiaca();
		p01.calcMasaCorporal();
	}
}
