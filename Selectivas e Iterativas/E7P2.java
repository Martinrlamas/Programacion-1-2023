
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E7P2 {
	
	public static void main(String[]args){
		final char caracter= '*';
		char us_caracter = 0;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			while(us_caracter != caracter){
				System.out.println("ingrese un caracter '*' para finalizar");
				us_caracter = entrada.readLine().charAt(0);
				
				if(Character.isDigit(us_caracter)){
					System.out.println("Es caracter digito");
				}
				else if(Character.isLowerCase(us_caracter)){
					System.out.println("Es una letra minuscula");
				}
			}
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	
}
