
import java.util.Random;

public class Ej6P5 {
	
	public static final int MAX=10;
	 public static final int MAXVALOR = 10;
	 public static final int MINVALOR = 1;
	
	 public static void main(String[]args){
		 int pares;
		 
		 int[] arrint = new int [MAX];
			
			cargar_arrint(arrint);
			imprimir_arr(arrint);
			pares = contar_pares(arrint);
			System.out.println("Hay "+pares+" elementos pares en el arreglo.");
	 }
	 
	 public static void cargar_arrint(int [] arr){
		 Random r = new Random();
		 for (int pos = 0; pos < MAX; pos++){
			 
			 arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	 public static int contar_pares(int[] arr){
		 int pares = 0;
		 for(int pos = 0; pos<MAX; pos++){
			 if(arr[pos] % 2 == 0){
				 pares++;
			 }
		 }
		 
		 return pares;
	 }
	 
	 private static void imprimir_arr(int[] arr){
			
			for(int pos=0; pos < MAX; pos++ ){
				
				System.out.print("|" +arr[pos]+ "|");	
			}
			System.out.println(" ");
	}
}
