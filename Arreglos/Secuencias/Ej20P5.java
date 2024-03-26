package Secuencias;

import java.util.Random;

public class Ej20P5 {
	public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, DELIMITADOR = 0, TAMANIOPATRON=4;
	public static final double probabilidad_numero = 0.4;
	

	public static void main(String[]args){
		
		int[] arrinicio =  new int[MAX];
		int[] arrpatron = new int[MAX]; 
		
		cargar_arrint_sec(arrinicio);
		cargar_patron(arrpatron);
		System.out.println("Arreglo inicial: ");
		imprimir_arr(arrinicio);
		System.out.println("Arreglo patron: ");
		imprimir_arr(arrpatron);
		eliminar_sec_patron(arrinicio, arrpatron);
		System.out.println("Arreglo incial con Patron eliminado: ");
		imprimir_arr(arrinicio);
	}
	
	public static void eliminar_sec_patron(int[]arrinicio, int[]arrpatron){
		int fin=-1;
		int inicio = obtener_ini_sec(arrinicio, fin +1);
		
		while(inicio < MAX -1){
			
			fin= obtener_fin_sec(arrinicio, inicio);
			if(son_iguales(arrinicio, arrpatron, inicio, fin)){
				
				eliminar_sec(arrinicio, inicio, fin);
				fin = inicio -1;
			}
			inicio= obtener_ini_sec(arrinicio, fin+ 1);
		}
	}
	public static boolean son_iguales(int[] arrinicio, int[] arrpatron, int inicio, int fin){
		int Pospatron = 1;
		int tamanioarr = fin - inicio + 1;
		
		while(inicio <= fin){
			if((arrinicio[inicio] == arrpatron[Pospatron])&&(tamanioarr == TAMANIOPATRON)){
				Pospatron++;
				inicio++;
			}
			else {
				return false;
			}
		}
		 return true;
	}
	
	public static void eliminar_sec(int[] arr, int ini, int fin){
		for(int i =ini; i<=fin; i++)
			corrimiento_izq(arr, ini);
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
	
	public static void cargar_patron(int[] arr){
		for(int pos=0; pos<MAX; pos++){
			if(pos>0 && pos<5){
				arr[pos]= pos;
			}
			else
				arr[pos] = 0;
		}
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
			//cargar_sec patron
			arr[0]= 0;
			arr[1]= 1;
			arr[2]= 2;
			arr[3]= 3;
			arr[4]= 4;
			arr[5]= 0;
		}
	}
	
	
	 private static void imprimir_arr(int[] arr){
			
			for(int pos=0; pos < MAX; pos++ ){
				
				System.out.print("|" +arr[pos]+ "|");	
			}
			System.out.println(" ");
	}
}
