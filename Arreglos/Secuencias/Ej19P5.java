package Secuencias;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ej19P5 {
	
	public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, DELIMITADOR = 0;
	public static final double probabilidad_numero = 0.4;
	public static void main(String[]args){
		int us_num = obtener_int();
		
		int[] arrint = new int [MAX];
		
		
		cargar_arrint_sec(arrint);
		imprimir_arr(arrint);
		
		int inicio=0,fin=-1, Tamsec;
		
	while(inicio<MAX){
		inicio = buscar_ini_sec(arrint, fin +1);
		
		if(inicio<MAX){
			
			fin = buscar_fin_sec(arrint, inicio);
			Tamsec = contar_sec(inicio, fin);
			
				if(Tamsec == us_num){
					eliminar_sec(arrint, inicio, fin);
					fin = inicio- 1;
				}	
			}
		}
		imprimir_arr(arrint);
	}
	
	public static int contar_sec(int ini, int fin){
		int contador =0;
		for(int i=ini; i<fin; i++)
			contador++;
		
		return contador;
	}
	
	public static int buscar_ini_sec(int[] arr, int pos){
		while(pos<MAX && arr[pos]== DELIMITADOR)
			pos++;
		
		return pos;
	}
	
	public static int buscar_fin_sec(int[] arr, int pos){
		
		while(pos<MAX && arr[pos] != DELIMITADOR)
			pos++;
		
		return pos;
	}
	public static void eliminar_sec(int[] arr, int ini, int fin){
		for(int i=ini; i<=fin; i++)
			corrimiento_izq(arr, ini);
	}
	
	public static void corrimiento_izq(int[] arr,int ini){
		int indice= ini;
			while(indice< MAX-1){
				arr[indice]=arr[indice+1];
				indice++;
			}
	}
	
	public static int obtener_int(){
		int num=0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
				System.out.println("Ingrese un numero de tamaño de secuencia");
				num = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		return num;
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
