
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej3P2 {
	public static void main(String[]args){
		final int dos=2, tres=3;
		int us_num;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			System.out.println("ingrese un numero mayor que 50: ");
			us_num = Integer.valueOf(entrada.readLine());
			
			if(us_num>50){
				if((us_num % dos == 0)&&(us_num % tres == 0)){
					
					System.out.println(us_num + "Es multiplo de 2 y 3");
				}
			}
			
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
