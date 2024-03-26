
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej1P3 {
	public static void main(String[]args){
		int entero= obtener_num();
		
		//BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
			while(entero !=0){
			try{
				System.out.println(entero);
					//System.out.println("Ingrese un numero: ");
					//entero = Integer.valueOf(entrada.readLine());
				
					if(entero != 0){
						entero = obtener_num();
						System.out.println(entero);
						//System.out.println("ingrese otro numero :");
						//entero = Integer.valueOf(entrada.readLine());
						imprimir(entero);
					}
				}
				catch(Exception exc){
					System.out.println(exc);
				}
			}
		}
	
	public static int obtener_num(){
		int entero = 1;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un numero: ");
			entero = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		return entero;
	}
	
	private static void imprimir(int entero){
		System.out.println("numero: " + entero);
	}
}
