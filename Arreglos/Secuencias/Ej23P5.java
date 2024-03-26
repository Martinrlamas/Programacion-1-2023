package Secuencias;

import java.util.Random;

public class Ej23P5 {
	public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, DELIMITADOR = 0;
	public static final double probabilidad_numero = 0.4;
	
	public static void main(String[] args){
		int[] arrint = new int[MAX];
		
		cargar_arrint_sec(arrint);
		System.out.println("Arreglo inicial: ");
			imprimir_arr(arrint);
			
			invertir_ultima_sec(arrint);
			
		System.out.println("Arreglo inicial con ultima secuencia invertida: ");
			imprimir_arr(arrint);
	}
	
	public static void invertir_ultima_sec(int[] arr){
		int inicio= MAX - 1;
		int fin = obtener_fin_sec(arr, inicio - 1);
			if(fin > 0){
				inicio = obtener_ini_sec(arr, fin);
				invertir_sec(arr, inicio, fin);
			}
		System.out.println(inicio + " , "+ fin);
	}
	
	public static void invertir_sec(int[] arr, int ini, int fin){
	
			for(int pos=ini; pos<=fin; pos++){
				int temp= arr[pos];
				arr[pos]= arr[fin];
				arr[fin]= temp;
				fin--;
				
					
			}
		
	}
	
	
	public static int obtener_ini_sec(int[] arr, int pos){
		while(pos>0 && arr[pos] != DELIMITADOR)
			pos--;
		return pos + 1;
	}
	
	
	public static int obtener_fin_sec(int[]arr, int pos){
			while(pos > 0 && arr[pos] == DELIMITADOR)
				pos--;
		return pos;
	}
	
	public static void cargar_arrint_sec(int [] arr){
		Random r = new Random();
		arr[0] = DELIMITADOR;
		arr[MAX-1] = DELIMITADOR;
		for (int pos = 1; pos < MAX-1; pos++){
			if (r.nextDouble()>probabilidad_numero){
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			}
			else{
				arr[pos]=DELIMITADOR;
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
