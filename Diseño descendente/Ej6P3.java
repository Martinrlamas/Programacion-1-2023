
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej6P3 {
	public static void main(String[]args){
		char us_char = obtener_char();
	
		while(Character.isLowerCase(us_char)){
			System.out.println(us_char);
			imprimir_t_9();
			us_char= obtener_char();
		}
	}
	
	public static char obtener_char(){
		char us_char = 'a';
		BufferedReader entrada= new BufferedReader (new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un caracter letra: ");
			us_char = entrada.readLine().charAt(0);
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		return us_char;
	}
	private static void imprimir_t_9(){
		for(int i = 1; i<=10; i++ ){
			System.out.println("|"+i+"*9|="+(i*9));
		}
	}
}

