import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej8P5 {
	
	 public static final int MAX=10;
	 public static final int MAXVALOR = 10;
	 public static final int MINVALOR = 1;
	 
	public static void main(String[]args){
		
		int us_pos = obtener_num();
		
		int[] arrint = new int[MAX];
		
		cargar_arrint(arrint);
		imprimir_arr(arrint);
			
		if(us_pos < MAXVALOR && us_pos >= 0 ){
			
			corrimiento_izq(arrint,us_pos);
			imprimir_arr(arrint);
		}
		
		else{
			System.out.println("El valor ingresado esta fuera del rango.");
		}
		
	}
	
	 public static void cargar_arrint(int [] arr){
		 Random r = new Random();
		 for (int pos = 0; pos < MAX; pos++){
			 
			 arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	 public static int obtener_num(){
			
			int num = 0;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			try{
				System.out.println("Ingrese una posicion entre "+MINVALOR+" y "+MAX+": ");
				num = Integer.valueOf(entrada.readLine());
			}
			catch(Exception exc){
				System.out.println(exc);
			}
			return --num;
	}
	 
	 public static void corrimiento_izq(int[] arr, int num){
		int indice = num;
		
		 	while(indice < MAX-1){
		 		
		 		arr[indice] = arr[indice + 1];
		 		indice++;
		 	}
	 }
	 
	 private static void imprimir_arr(int[] arr){
			
			for(int pos=0; pos < MAX; pos++ ){
				
				System.out.print("|" +arr[pos]+ "|");	
			}
			System.out.println(" ");
	}
}