package Secuencias;

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej24P5 {
	
	public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, DELIMITADOR = 0;
	public static final double probabilidad_numero = 0.4;
	
	public static void main(String[] args){
		
		int us_pos = -1;
		int[] arrint = new int[MAX];
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			
			cargar_arrint_sec(arrint);
			imprimir_arr(arrint);
				
				System.out.println("Ingrese una posicion del arreglo entre "+DELIMITADOR+" y "+ (MAX-1) + ": ");	
				us_pos = Integer.valueOf(entrada.readLine());
				
				obtener_sec(arrint, us_pos);
		}
		
		catch(Exception exc){
			System.out.println("Error!" + exc);
			
		}
		
		
		
	}
	
	public static void obtener_sec(int[] arr, int pos){
		int inicio = obtener_ini_sec(arr, pos);
		int fin = obtener_fin_sec(arr, inicio);
		if(inicio < MAX)
			System.out.println("La siguente secuencia se encuentra entre: "+ inicio +" y "+ fin +" Posicion inicial: "+pos);
		else
		System.out.println("No existe secuencia despues de la posicion ingresada");
	}
	
	
	public static int obtener_fin_sec(int[] arr, int pos){
		
		while(pos< MAX && arr[pos] != DELIMITADOR)
			pos++;
		return pos - 1;
	}
	
	
	public static int obtener_ini_sec(int[]arr, int pos){
		if(arr[pos] !=0)
			pos = obtener_fin_sec(arr, pos) + 1;
		
		while(pos < MAX && arr[pos] == DELIMITADOR)
			pos++;
		
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
