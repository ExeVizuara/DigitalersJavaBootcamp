
public class Mod04_Desafio01_Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, suma = 0;
		
		do {
			if(i % 2 == 0) { suma += i; }
			i++;
			System.out.println("Numero de ciclo: " + i + " Suma: " + suma);
		} while(i < 25);
		System.out.println("Suma de pares de 1 a 25: " + suma);
	}

}
