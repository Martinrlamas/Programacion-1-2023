package Secuencias;

import java.util.Random;

public class Ej17P5 {
	
	public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, DELIMITADOR = 0;
	public static final double probabilidad_numero = 0.4;
	
	public static void main(String[]args){
		int[] arrint = new int[MAX];
		
		cargar_arrint_sec(arrint);
		imprimir_arr(arrint);
		obtener_antult_sec(arrint);
		
	}
	
	public static void obtener_antult_sec(int[] arr){
		int fin = obtener_fin_sec(arr, MAX -1);
		int inicio = obtener_ini_sec(arr, fin);
		fin = obtener_fin_sec(arr, inicio -1);
		inicio = obtener_ini_sec(arr, fin);
		
		System.out.println("La anteultima secuencia empienza en la posicion "
							+inicio+" y termina en la posicion "+fin);
		
	}
	
	public static int obtener_ini_sec(int [] arr, int ini){
		while(ini >= 0 && arr[ini] != DELIMITADOR)
			ini--;
		
		return ini + 1;
	}
	
	public static int obtener_fin_sec(int[] arr, int fin){
		
		while(fin >= 0 && arr[fin] == DELIMITADOR)
			fin--;
			
		return fin;
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
