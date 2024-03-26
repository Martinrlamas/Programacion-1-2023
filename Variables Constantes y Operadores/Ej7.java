
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej7 {
	public static void main(String[]args){
		
		double num, num2, num3;
		
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Ingrese un numero real: ");
			num = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese un segundo numero real: ");
			num2 = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese un tercer numero real: ");
			num3 = Double.valueOf(entrada.readLine());
			
			num /=num2;
			num -= num3;
			
			System.out.println("El resultado es: " + num);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
