import java.util.Scanner;

public class Mod02_Desafio01_Ej1 {

	public static void main(String[] args) {
		Scanner Datos = new Scanner(System.in);

		String DatosIngresados;
		System.out.println("Ingrese su primer nombre y su primer apellido: ");
		System.out.println();
		
		DatosIngresados = Datos.nextLine();
		
		String[] separador = DatosIngresados.split(" ");
		String nombre = separador[0];
		String apellido = separador[1];
		
	
		String nombrePrimeraLetraMayuscula = nombre.substring(0, 1).toUpperCase()
				+ nombre.substring(1).toLowerCase();
		
		String apellidoPrimeraLetraMayuscula = apellido.substring(0, 1).toUpperCase()
				+ apellido.substring(1).toLowerCase();
		
		
		
		System.out.println("Nombre: " + nombrePrimeraLetraMayuscula);
		System.out.println();

		System.out.println("Apellido: " + apellidoPrimeraLetraMayuscula);
		System.out.println();
		
		Datos.close();
	}

}