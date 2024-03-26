import java.util.Random;


public class Ej14P5 {
	
	public static final int MAX=10;
	 public static final int MAXVALOR = 10;
	 public static final int MINVALOR = 1;
	 public static final int PAR = 2;
	 
	 public static void main(String[]args){
		 int[] arrint = new int[MAX];
		 
		 cargar_arrint(arrint);
		 imprimir_arr(arrint);
		 eliminar_pares(arrint);
		 imprimir_arr(arrint);
		 
	 }
	 
	 
	 public static void eliminar_pares(int[] arr){
		 int pos= buscar_pos_pares(arr);
		 int indice =0;
		 if(pos >= MAX){
			 System.out.println("No existen valores pares en el arreglo.");
		 }
		 else{
			 if(arr[MAX-1] % 2 == 0)
				arr[MAX-1] = 1;
				 
			 while(pos < MAX && indice < MAX){
				 
				 pos = buscar_pos_pares(arr);
				 corrimiento_izq(arr, pos);
				 indice++;
			 }
		 }
	 }
	 
	 public static int buscar_pos_pares(int[] arr){
		 int pos = 0;
		 
		 	while(pos < MAX && (arr[pos] % PAR != 0)){
		 		pos++;
		 	}
		 
		 return pos;
	 }
	 
	 public static void corrimiento_izq(int[] arr, int num){
			int indice = num;
			
			 	while(indice < MAX-1){
			 		
			 		arr[indice] = arr[indice + 1];
			 		indice++;
			 	}
		 }

	 public static void cargar_arrint(int [] arr){
		 Random r = new Random();
		 for (int pos = 0; pos < MAX; pos++){
			 
			 arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	 private static void imprimir_arr(int[] arr){
			
			for(int pos=0; pos < MAX; pos++ ){
				
				System.out.print("|" +arr[pos]+ "|");	
			}
			System.out.println(" ");
	}
}
