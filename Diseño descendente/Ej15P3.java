
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej15P3 {
	public static void main(String[]args){
		int us_num = obtener_num();
		
		while(us_num>0){
			int sumatoria= calcular_sumatoria(us_num);
			imprimir(sumatoria);
			
			us_num =obtener_num();
		}
	}
	
	
	public static int obtener_num(){
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		int num =1;
		
		try{
			System.out.println("Ingrese un numero: ");
			num = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		
		return num;
	}
	public static int calcular_sumatoria(int num){
		int suma = 0;
		for(int i=1; i<=num; i++){
			suma+=i;
		}
		return suma;
	}
	private static void imprimir(int num){
		
		System.out.println("La el total de la sumatoria es: " + num);
	}
}
