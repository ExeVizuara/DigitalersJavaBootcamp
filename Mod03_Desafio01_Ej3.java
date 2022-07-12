import java.util.Scanner;

public class Mod03_Desafio01_Ej3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String usuario = "Pepito";
		String clave = "1234";
		String usuarioIngresado;
		String claveIngresada;
		
		System.out.println("Bienvenido, ingrese su nombre de usuario:");
		usuarioIngresado = scanner.nextLine();
		
		System.out.println("Ingrese su contraseña:");
		claveIngresada = scanner.nextLine();
		
		if(usuarioIngresado.equalsIgnoreCase(usuario) & claveIngresada.equals(clave))
		{ System.out.println("¡Bienvenido Pepito!"); } 
		else if(!(usuarioIngresado.equalsIgnoreCase(usuario)) & claveIngresada.equals(clave))
		{ System.out.println("Usuario incorrecto"); }
		else if(usuarioIngresado.equalsIgnoreCase(usuario) & !(claveIngresada.equals(clave)))
		{ System.out.println("Contraseña incorrecta"); }
		
		
		scanner.close();
	}
}

