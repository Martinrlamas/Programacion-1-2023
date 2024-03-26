
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej4P2 {
	public static void main(String[]args){
		final int MIN=0, cien=100, MAX=999;
		int us_num;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			System.out.println("ingrese un numero entre 0 y 999: ");
			us_num = Integer.valueOf(entrada.readLine());		
			
			if((us_num>0)&&(us_num<999)){
				if(us_num<10){
					System.out.println("Tiene 1 digito");
				}
				else if((us_num>10)&&(us_num<cien)){
					
					System.out.println("Tiene 2 digitos");
				}
				else if(us_num>=cien){
					System.out.println("Tiene 3 digitos "+ us_num);
				}
			
			}
			else{
				System.out.println("Numero no valido!");
			}
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

}
