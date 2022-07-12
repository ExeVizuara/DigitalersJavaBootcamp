
public class Mod05_Desafio01_Ej1 {

	public static void main(String[] args) {
		int vector[] = { 10, 20, 5, 15, 30, 20 };
		int n, total = 0, maximo = vector[0], contador = 0;
		
		for(n = 0; n < vector.length; n++) {
			if(n % 2 == 1) { Imprimir("Vector impar: " + n + " valor: " + vector[n]); }
			total += vector[n];
			if(vector[n] > maximo) { maximo = vector[n]; }
			if(vector[n] == 20) contador++;
		}
		Imprimir("El numero mayor es: " + maximo);
		Imprimir("La suma de todos los valores es: " + total);
		Imprimir("El numero 20 aparece " + contador + " veces");
		
	}
	public static void Imprimir(String texto) {
		System.out.println(texto);
	}
}
