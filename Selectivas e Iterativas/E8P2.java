
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E8P2 {
	public static void main(String[]args){
		final int cero = 0;
		int us_num = 1;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			while(us_num != 0){
				System.out.println("Ingrese un numero (0 para salir): ");
				us_num = Integer.valueOf(entrada.readLine());
				
				if(us_num != 0){
					System.out.println("Su numero es: "+ us_num);	
				}
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		} 
	}
	
}
