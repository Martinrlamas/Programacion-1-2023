
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej10P3 {
	public static final int MAX=10, MIN=1;
	
	public static void main(String[]args){
	int us_num= obtener_num();
	char us_char;
	
		while((us_num<=10)&&(us_num>=1)){
			
			if(us_num % 3 == 0){
				us_char = obtener_caracter();
				if(Character.isLowerCase(us_char)){
					System.out.println("Letra minuscula");
				}
				else if(Character.isUpperCase(us_char)){
					System.out.println("Letra mayuscula");
				}
				else if(Character.isDigit(us_char)){
					System.out.println("Digito");
				}
				else{
					System.out.println("Otro");
				}
			}
			if(us_num % 5 == 0){
				imprimir_tabla(us_num);
			}
			
			us_num = obtener_num(); 
		}
	}
	
	public static int obtener_num(){
		int num = 1;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese un entero entre 1 y 10 inclusive: ");
			num = Integer.valueOf(entrada.readLine());
			
		}
		
		catch(Exception exc){
			
		System.out.println(exc);	
		}
			return num;
	}
	public static char obtener_caracter(){
		char car = ' ';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("ingrese caracter: ");
			car = entrada.readLine().charAt(0);
			
		}catch(Exception exc){
			System.out.println(exc);
		}
		return car;
		
	}
	private static void imprimir_tabla(int num){
		for(int i=1; i<=10;i++ ){
			System.out.println("|"+i+"*"+num+"|="+(i*num));
		}
	}
}
