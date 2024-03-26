
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej1P5 {
	public static final int MAX=15;
	public static void main(String[]args){
		
		int[] arrint = new int[MAX];
		int us_num, pos =0;
		
			for(int i=0; i<MAX; i++){
				us_num = obtener_numero();
				if((us_num>=1 && us_num<=12)&& us_num != 0){
					
					System.out.println(pos);
					cargar_arr(arrint,us_num,pos);
					pos++;
				}
			}
			imprimir_arr(arrint);
		} 
		
	public static int obtener_numero(){
		int num = 0;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese valores entre 1 y 12 inclusive (0 para salir): ");
			num = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		return num;
	}
	
	public static void cargar_arr(int[] arr,int num, int pos){
		
		arr[pos] = num;
	}
	
	private static void imprimir_arr(int[] arr){
		
		for(int pos=0; pos < MAX; pos++ ){
			
			System.out.print("|" +arr[pos]+ "|");
		}
		System.out.println(" ");
	}
}
