
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej8P3 {
	public static void main(String[]args){
		int us_num1, us_num2;
		char us_char;

		
			us_num1 = obtener_num();
			us_num2 = obtener_num();
			us_char = obtener_char();
			
			switch(us_char){
			case 'a':
				System.out.println("|"+us_num1 +"+"+us_num2+"|="+ (us_num1+us_num2));
				break;
			case 'b':
				System.out.println("|"+us_num1 +"-"+us_num2+"|="+ (us_num1-us_num2));
				break;
			case 'c':
				System.out.println("|"+us_num1 +"*"+us_num2+"|="+ (us_num1*us_num2));
				break;
			case 'd':
				System.out.println("|"+us_num1 +"/"+us_num2+"|="+ (us_num1/us_num2));
				break;
			default:
				System.out.println("Ninguna operacion!");
				break;
			}
		
	}
	
	public static int obtener_num(){
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		int numero = 1;
		try{
			System.out.println("Ingrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		return numero;
	}
	
	public static char obtener_char(){
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		char caracter= ' ';
		try{
			System.out.println("Ingrese un caracter: ");
			caracter = entrada.readLine().charAt(0);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		return caracter;
	}
}
