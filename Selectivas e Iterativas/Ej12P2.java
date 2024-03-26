
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej12P2 {
	public static void main(String []args){
		
		char us_char = 1, maxchar= 'a', minchar='z';
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			
			while(true){
				System.out.println("Ingrese un caracter letra minuscula (0 para salir):");
				us_char = entrada.readLine().charAt(0);
				
				if(us_char == '0'){
					break;
				}
				
				if(us_char<='z'&& us_char>='a'){
					if(us_char < minchar){
						minchar = us_char;
					}
					if(us_char > maxchar){
						maxchar= us_char;
					}
				}
				else{
					System.out.println("El numero ingresado no es una minuscula");
				}
			}
			System.out.println("El maximo caracter ingresado es: "+ maxchar);
			System.out.println("El minimo caracter ingresado es: "+ minchar);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
