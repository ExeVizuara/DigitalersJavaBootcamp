
public class Mod04_Desafio01_Ej2 {

	public static void main(String[] args) {
		int mes;
		double dinero;
		mes = 1;
		dinero = 1000;
		
		do { 
			dinero = dinero * 1.02;
			System.out.println("Mes: " + mes + " Saldo: $" + dinero);
			mes++;
		} while(mes < 13); 
		System.out.println("Dinero Total: $" + dinero);
	}

}
