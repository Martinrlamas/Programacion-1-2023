
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej6P2 {
		
	public static void main(String[]args){
		
		final int Max=100, Min = 1, dos=2, tres=3;
		int us_num =1;
				
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			
			while(us_num>= Min && us_num<=Max){
				
				System.out.println("Ingrese un numero entre 1 y 100 (fuera de rango para salir): ");
				us_num = Integer.valueOf(entrada.readLine());
					
				if((us_num % dos == 0)&&(us_num % tres == 0)){
					System.out.println(us_num + " Es multiplo de 2 y 3 al mismo tiempo.");
				}
			}
			
		}
		catch(Exception exc){
			
			System.out.println(exc);
		}
	}
}
