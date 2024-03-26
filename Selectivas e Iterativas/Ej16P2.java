
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej16P2 {
	public static void main(String[] args){
		final int MAX= 15;
		char us_char;
		int contador = 0;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			for(int i=0; i<MAX; i++){
				System.out.println("Ingrese un caracter (0 para salir): ");
				us_char = entrada.readLine().charAt(0);
				
				if(us_char == '0'){
					break;
				}
				if(us_char != 'a'){
					contador = 0;
				}
				if(us_char =='a'){
					contador++;
				}
			
			}
			System.out.println("La mayor cantidad de 'a' seguidas que se ingresaron fue de: "+ contador);
		}
		catch(Exception exc){
			
		}
	}
}
