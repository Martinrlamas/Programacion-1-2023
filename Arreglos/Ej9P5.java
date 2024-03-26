import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej9P5 {
	
	 public static final int MAX=10;
	 public static final int MAXVALOR = 10;
	 public static final int MINVALOR = 1;
	 
		public static void main(String[]args){
			
			int us_num = obtener_num();
			
			int[] arrint = new int[MAX];
			
			cargar_arrint(arrint);
			imprimir_arr(arrint);
				
				corrimiento_der(arrint);
				insertar_num(arrint,us_num);
				imprimir_arr(arrint);
			
		}
		public static void insertar_num(int[] arr, int num){
			
			arr[0] = num;
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
				return num;
		}
		 
		 public static void corrimiento_der(int[] arr){
			int indice = MAX-1;
			
			 	while(indice > 0){
			 		
			 		arr[indice] = arr[indice - 1];
			 		indice--;
			 	}
		 }
		 
		 private static void imprimir_arr(int[] arr){
				
				for(int pos=0; pos < MAX; pos++ ){
					
					System.out.print("|" +arr[pos]+ "|");	
				}
				System.out.println(" ");
		}
}
