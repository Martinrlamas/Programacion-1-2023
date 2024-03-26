
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej2 {
	public static void main(String[]args){
		double numero = 1;
		double us_num;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero: ");
			us_num = Double.valueOf(entrada.readLine());
			
			System.out.println("El valor 1 es: " + numero);
			System.out.println("El valor ingresado es " + us_num);
		}
		catch(Exception exc){
			System.out.println(exc);
			
		}
	}
}
