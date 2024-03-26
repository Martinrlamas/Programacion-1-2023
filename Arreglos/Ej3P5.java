import java.util.Random;

public class Ej3P5 {
	
 public static final int MAX=10;
 public static final int MAXVALOR = 10;
 public static final int MINVALOR = 1;
 
	 public static void main(String[]args){
		 int[] arrint = new int[MAX];
		 double prom;
		 cargar_arrint(arrint);
		 prom = calcular_prom_arr(arrint);
		 imprimir_arr(arrint);
		 System.out.println("promedio es: "+ prom);
		 encima_prom(arrint,prom);
	 }
	 
	 public static void cargar_arrint(int [] arr){
		 Random r = new Random();
		 for (int pos = 0; pos < MAX; pos++){
		 arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
		}
	}
	 
	 public static double calcular_prom_arr(int[] arr){
		 
		 double suma=0;
		 for(int pos=0; pos<MAX; pos++){
			suma += arr[pos]; 
		 }
		 return (suma/MAX);
	 }
	 
	 public static void encima_prom(int[] arr, double prom){
		 int elemento=0;
		 for(int pos=0; pos<MAX; pos++){
			 if(arr[pos]>prom){
				elemento++;
			 } 
		 }
		 System.out.println("Hay "+ elemento +" elementos por encima del promedio.");
	 }
	 
	private static void imprimir_arr(int[] arr){
		
		for(int pos=0; pos < MAX; pos++ ){
			
			System.out.print("|" +arr[pos]+ "|");
		}
		System.out.println(" ");
	}
	 
}