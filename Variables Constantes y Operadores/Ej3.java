import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej3 {
	public static void main(String[]args){
		int us_num;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero: ");
			us_num = Integer.valueOf(entrada.readLine());
			
			System.out.println("El valor ingresado es " + us_num);
		}
		catch(Exception exc){
			System.out.println(exc);
			
		}
	}
}
/*
* El problema nos lo encontramos cuando 
* el valor que ingresamos no es de tipo integer.
*/