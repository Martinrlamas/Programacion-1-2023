package Secuencias;

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej25P5 {
	
	public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, DELIMITADOR = 0;
	public static final double probabilidad_numero = 0.4;
	
	public static void main(String[]args){
		int us_num;
		int[]arrint = new int[MAX], arr_g = new int[MAX];
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			cargar_arrint_sec(arrint);
			inicializar_arr_a_cero(arr_g);
			System.out.println("Arreglo inicial: ");
			
				imprimir_arr(arrint);
				
			System.out.println("Arreglo en cero: ");
				imprimir_arr(arr_g);
				
			System.out.println("Ingrese un tamaño de secuencia para copiarla al otro arreglo: ");
			us_num = Integer.valueOf(entrada.readLine());
				
			copiar_sec_igual_tamanio(arrint,arr_g, us_num);
			
			System.out.println("Arreglo con secuencias guardadas: ");
			imprimir_arr(arr_g);
		}
		catch(Exception exc){
			System.out.println("Error!" + exc);
		}
	}
	
	public static void copiar_sec_igual_tamanio(int[]arr, int[] G, int tam){
		int fin = -1, inicio =0, poscopia=0, tamanio;
		
		while(inicio < MAX){
			inicio = obtener_ini_sec(arr, fin +1);
			if(inicio < MAX){
				fin = obtener_fin_sec(arr, inicio);
				tamanio = contar_sec(inicio,fin);	
				if(tam == tamanio){
					copiar_sec(arr,G,inicio, fin,poscopia);
					poscopia += tamanio;
					
				}
			}			
		}
	}
	
	public static void copiar_sec(int[] arr, int[] G,int ini, int fin, int pos){
		while(ini<=fin){
			
			G[pos] =arr[ini];
			ini++;
			pos++;
		}
	}
	
	public static int contar_sec(int ini, int fin){
		int contador =0;
		for(int i=ini; i<fin; i++)
			contador++;
		
		return contador;
	}
	
	public static int obtener_ini_sec(int[] arr, int pos){
		while(pos<MAX && arr[pos]== DELIMITADOR)
			pos++;
		
		return pos;
	}
	
	public static int obtener_fin_sec(int[] arr, int pos){
		
		while(pos<MAX && arr[pos] != DELIMITADOR)
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
	
	public static void inicializar_arr_a_cero(int[] arr){
		for(int pos=0; pos<MAX; pos++){
			arr[pos]= DELIMITADOR;
		}
	}
	
	 private static void imprimir_arr(int[] arr){
			
			for(int pos=0; pos < MAX; pos++ ){
				
				System.out.print("|" +arr[pos]+ "|");	
			}
			System.out.println(" ");
	}

}
