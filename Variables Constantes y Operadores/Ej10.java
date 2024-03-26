
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej10 {
	public static void main(String[]args){
			
			int numero, numero2;
			
			try{
				BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
				
				System.out.println("Ingrese el primer valor: ");
				numero = Integer.valueOf(entrada.readLine());
				System.out.println("Ingrese el primer valor: ");
				numero2 = Integer.valueOf(entrada.readLine());
				
				System.out.println("¿ "+ numero + " es mayor que " + numero2 + " ? " +(numero>numero2));
				System.out.println("¿Ambos son multiplo de 2? " +(numero%2 ==0 && numero2%2==0));
				
			}
			catch(Exception exc){
				System.out.println(exc);
			}
		}

}
