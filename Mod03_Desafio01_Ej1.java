
public class Mod03_Desafio01_Ej1 {

	public static void main(String[] args) {

		int nro1;
		int nro2;
		int nro3;
		
		nro1 = 100;
		nro2 = 500;
		nro3 = 250;
		
		if(nro1 > nro2 & nro1 > nro3) {
			System.out.println("El numero mayor es: " + nro1);
		} else if(nro2 > nro1 & nro2 > nro3) {
			System.out.println("El numero mayor es: " + nro2);
			
		} else System.out.println("El numero mayor es: " + nro3);
	}
}
