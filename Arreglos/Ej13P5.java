
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej13P5 {
	
	public static final int MAX=10;
	 public static final int MAXVALOR = 10;
	 public static final int MINVALOR = 1;
	
	public static void main(String[] args){
		int us_num = obtener_num();
		
		int[] arrint = new int[MAX];
		
		cargar_arrint(arrint);
		imprimir_arr(arrint);
		arrint[0]= us_num;
		burbujeo_des(arrint);
		imprimir_arr(arrint);
		

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
	 
	 public static void cargar_arrint(int [] arr){
		 Random r = new Random();
		 for (int pos = 0; pos < MAX; pos++){
			 
			 arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	 
	 public static void burbujeo_des(int[] arr){
		 int temp;
		 
		 	for(int i = 1;i < MAX;i++){
		 		for (int j = 0 ; j < MAX - 1; j++){
		 			if (arr[j] < arr[j+1]){
		 				
		 				temp = arr[j];
		 				arr[j] = arr[j+1];
		 				arr[j+1] = temp;
		 			}
		 		}
		 	}
		}
	 
	 private static void imprimir_arr(int[] arr){
			
			for(int pos=0; pos < MAX; pos++ ){
				
				System.out.print("|" +arr[pos]+ "|");	
			}
			System.out.println(" ");
	}
}
