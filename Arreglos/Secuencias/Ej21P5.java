package Secuencias;

import java.util.Random;


public class Ej21P5 {

	public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, DELIMITADOR = 0;
	public static final double probabilidad_numero = 0.4;
	
	public static void main(String[]args){
		
		int[] arrint = new int[MAX];
		 
		cargar_arrint_sec(arrint);
		imprimir_arr(arrint);
		eliminar_sec_desc(arrint);
		System.out.println("Arreglo con secuencias descendentes eliminadas: ");
		imprimir_arr(arrint);
	}
	public static void eliminar_sec_desc(int[] arr){
		int fin = -1;
		int inicio = obtener_ini_sec(arr, fin+1);
		while(inicio< MAX-1){
			fin = obtener_fin_sec(arr, inicio);
			
			if(es_descendente(arr,inicio, fin)){
				eliminar_sec(arr,inicio,fin);
				fin = inicio -1;
			}
			inicio = obtener_ini_sec(arr, fin +1);
		}
		
	}
	
	public static boolean es_descendente(int[] arr, int inicio, int fin){
			for(int pos=inicio; pos<=fin; pos++){
			if((arr[pos] <= arr[pos+1]) || (inicio == fin))
				return false;
		}
		return true;
	}
	
	public static int obtener_ini_sec(int[] arr, int pos){
		while(pos<MAX && arr[pos]==DELIMITADOR)
			pos++;
		
		return pos;
	}
	public static int obtener_fin_sec(int[] arr, int pos){
		while(pos<MAX && arr[pos] != DELIMITADOR)
			pos++;
		
		return pos -1;
	}
	
	public static void eliminar_sec(int[] arr, int ini, int fin){
		for(int i =ini; i<=fin; i++)
			corrimiento_izq(arr, ini);
	}
	
	public static void corrimiento_izq(int[]arr, int num){
		
		for(int i=num; i<MAX-1; i++)
			arr[i] = arr[i + 1];
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
