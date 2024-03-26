
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej14P3 {
	public static final char caracter ='*';
	public static void main(String[]args){
		char us_char = obtener_caracter();
		
		while(us_char != caracter){
				
				if(Character.isDigit(us_char)){
					System.out.println("Es un digito");
				}
				else if(Character.isLowerCase(us_char)){
					switch(us_char){
					case'a':case'e':case'i':case'o':case'u':
						System.out.println("El caracter es una vocal");
						break;
					default:
						System.out.println("el caracter es un consonante.");
						break;
					}
				}
			
			us_char = obtener_caracter();
		}
	}
	
	public static char obtener_caracter(){
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		char carac = ' ';
		
		try{
			
			System.out.println("Ingrese un caracter: ");
			carac = entrada.readLine().charAt(0);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		return carac;
	}
	
}
