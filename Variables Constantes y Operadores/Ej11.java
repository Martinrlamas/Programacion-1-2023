
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej11 {
	public static void main(String[]args){
		
		int numero;
		
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Ingrese el primer valor: ");
			numero = Integer.valueOf(entrada.readLine());
			
			System.out.println( "� " + numero + " es multiplo de 6 y 7? " +(numero%6 ==0 && numero%7==0));
			
			System.out.println("� "+ numero + " es mayor a 30 y m�ltiplo de 2,"
											+ " o es menor igual a 30? " +
											((numero>30 && numero%2 ==0)||(numero<=30)));
			System.out.println( "�el cociente de la divisi�n de "+ numero + " por 5 es mayor que 10 " +(numero/5 > 10));
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
