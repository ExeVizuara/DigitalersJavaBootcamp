import java.util.Arrays;

public class Mod05_Desafio01_Ej2 {

	public static void main(String[] args) {
		double inflacion[] = { 0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 0.3, 0.7, 0.3, 0.2, 0.9 };
		double suma = 0;
		double maximo = inflacion[0];
		int mesMaximo = 0;
		double minimo = inflacion[0];
		int mesMinimo = 0;
			
		for(int i = 0; i < inflacion.length; i++ ) {
				Imprimir("El mes " + (i+1) + " registra un total de " + inflacion[i] + " de inflación");
		        suma += inflacion[i];
		        Imprimir("");
		        if(inflacion[i] > maximo) { maximo = inflacion[i]; mesMaximo = i+1; }
		        if(inflacion[i] < minimo) { minimo = inflacion[i]; mesMinimo = i+1; }
		}
		Imprimir("Inflacion total anual: " + suma);
		Imprimir("El mes " + mesMaximo + " fue el de mayor inflacion con " + maximo + " en total");
		Imprimir("El mes " + mesMinimo + " fue el de menor inflacion con " + minimo + " en total");
		Imprimir("Promedio mensual: " + suma/12);
		Arrays.sort(inflacion);
	}
	public static void Imprimir(String texto) {
		System.out.println(texto);
	}
}
