
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej10P2 {
	public static void main(String []args){
	final int MAX =10, MIN =1;
	int us_num = MIN, suma = 0;
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			while((us_num>=MIN)&&(us_num<=MAX)){
				System.out.println("Ingrese un numero entre 1 y 10 (fuera de rango para salir): ");
				us_num = Integer.valueOf(entrada.readLine());
				
				if((us_num>=MIN)&&(us_num<=MAX)){
					suma += us_num;
				}
			}
			System.out.println("La suma de todos los numeros ingresados es: " + suma);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
