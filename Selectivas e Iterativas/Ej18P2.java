
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej18P2 {
	public static void main(String[]args){
		
		int us_num = 1, us_num2, us_num3;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			while(us_num !=0){
			System.out.println("Ingrese un numero (0 para salir): ");	
			us_num = Integer.valueOf(entrada.readLine());
				if(us_num != 0){
					System.out.println("Ingrese el primer valor");
					us_num2 = Integer.valueOf(entrada.readLine());
					System.out.println("Ingrese el segundo valor");
					us_num3 = Integer.valueOf(entrada.readLine());
					
					int calculo= us_num2 / us_num3;
					System.out.println(us_num2+"/"+us_num3+"="+ calculo);
				}
			
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
