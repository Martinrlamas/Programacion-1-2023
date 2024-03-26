
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej11P2 {
	public static void main(String[]args){
		char us_char = 'i';
		int contador = 0;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try{
			while(Character.isLowerCase(us_char)){
				System.out.println("Ingrese letras minusculas, vocal para ser contada(cualquier otro caracter para salir): ");
				us_char = entrada.readLine().charAt(0);
				
				if(Character.isLowerCase(us_char)){
					switch(us_char){
					case'a':case'e':case'i':case'o':case'u':
						contador++;
						break;
					}
				}
			}
			System.out.println("La cantidad de vocales ingresadas es: " + contador);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
