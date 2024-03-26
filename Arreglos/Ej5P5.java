
import java.util.Random;

public class Ej5P5 {
	
	 public static final int MAX=10;
	 public static final int MAXVALOR = 10;
	 public static final int MINVALOR = 1;
	 
	public static void main(String[]args){
		
		int[] arrint = new int [MAX], B = new int [MAX];
		
		cargar_arrint(arrint);
		imprimir_arr(arrint);
		 invertir_arr(arrint, B);
		 imprimir_arr(B);
	}
	
	 public static void cargar_arrint(int [] arr){
		 Random r = new Random();
		 for (int pos = 0; pos < MAX; pos++){
			 
			 arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	 public static void invertir_arr(int[] arr, int[] b){
		 int indice = 0;
		 for(int pos=MAX-1; pos>=0; pos--){
			 
			 b[indice] = arr[pos];
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
