
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej7P3 {
	public static void main(String[]args){
		int us_num = obtener_num();
		
		while(us_num > 0){
			imprimir_sumatoria();
			us_num = obtener_num();
		}
	}
	public static int obtener_num(){
		int us_num =1;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
		System.out.println("Ingrese un numero: ");
		us_num = Integer.valueOf(entrada.readLine());	
		}
		catch(Exception exc){
			
		}
		
		return us_num;
	}
	private static void imprimir_sumatoria(){
		int suma = 0;
		for(int i = 0; i<200; i++){
			suma += i;
		}
		System.out.println("La sumatoria de los primeros 200 numeros naturales es: " + suma);	
	}
}
