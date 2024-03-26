
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej17P2 {
	public static void main(String[]args){
		
		int us_num;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un numero entre 1 y 10 inclusive: " );
			us_num = Integer.valueOf(entrada.readLine());
				if((us_num<=10)&&(us_num>=1)){
					
					for(int i = us_num; i>=0; i--){
						System.out.print("|"+i+"|");
					}
				}
				else{
					System.out.println("El numero esta fuera de rango");
				}
		}	
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
