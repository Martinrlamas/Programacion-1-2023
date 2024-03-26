
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej9P2 {
	public static void main(String [] args){
		char caracter = 0;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			while(caracter != '*'){
				
				System.out.println("Ingrese un caracter letra o un digito ('*' para salir): ");
				caracter = entrada.readLine().charAt(0);
				
				if((caracter != '*')&&(Character.isDigit(caracter))){
					System.out.println("Es un digito");
				}
				else if((caracter != '*')&&(Character.isLowerCase(caracter))){
					
					switch(caracter){
					case 'a':case'e':case 'i':case 'o':case 'u':
						System.out.println("es vocal"); break;
						
					default:
						System.out.println("Es consonante");
						break;
					}
				}
			}
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
