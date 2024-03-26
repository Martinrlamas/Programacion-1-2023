package Secuencias;

import java.util.Random;

public class Ej22P5 {
	
	public static final int MAX = 20, MAXVALOR = 9, MINVALOR = 1, DELIMITADOR = 0, TAMANIOPATRON=4;
	public static final double probabilidad_numero = 0.4;
	
	public static void main(String[] args){
		int[] Arr_A= new int[MAX], Arr_P = new int[MAX], Arr_R= new int[MAX];
		
		cargar_arrint_sec(Arr_A);
		cargarpatron(Arr_P);
		cargarsec(Arr_R);
		System.out.println("Arreglo Inicial: ");
			imprimir_arr(Arr_A);
		System.out.println("Arreglo con patron: ");
			imprimir_arr(Arr_P);
		System.out.println("Secuencia a cargar: ");
			imprimir_arr(Arr_R);
			Cambiar_patron_a_sec(Arr_A,Arr_P,Arr_R);
			
		System.out.println("Arreglo Inicial con secuencia copiada: ");
			imprimir_arr(Arr_A);
		
	}
	
	public static void Cambiar_patron_a_sec(int[] A, int[] P, int[] R){
		int fin = -1;
		int inicio = obtener_ini_sec(A, fin + 1);
			while(inicio<MAX -1){
				
				fin = obtener_fin_sec(A,inicio);
				
				if(son_iguales(A,P,inicio,fin)){
					
					cambio_pat_en_A_a_sec_R(A,R,inicio,fin);
					
					fin= inicio - 1;
				 }
				inicio= obtener_ini_sec(A,fin + 1);
			}
		
		
	}
	
	public static void cambio_pat_en_A_a_sec_R(int[] A, int[] R, int ini,int fin){
		int posR=1;
		
		while(ini <=fin){
			
			A[ini] = R[posR];
			posR++;
			ini++;
		}
	}
	
	public static boolean son_iguales(int[] A, int[] P, int inicio, int fin){
		int Pospat= 1;
		int Tampat = fin-inicio + 1;
			while(inicio<= fin){
				
				if((A[inicio] == P[Pospat])&&(Tampat == TAMANIOPATRON)){
						Pospat++;
						inicio++;
				}
				else
					return false;
			}
		return true;
	}
	
	public static void cargarpatron(int[] arr){
		
		for(int pos=DELIMITADOR; pos<MAX; pos++){
			if(pos>0 && pos<5)
				arr[pos] = pos;
			
			else
				arr[pos] = DELIMITADOR;
		}
	}
	public static void cargarsec(int[] arr){
		Random r = new Random();
		for(int pos=DELIMITADOR; pos<MAX; pos++){
			if(pos>0 && pos<5)
				arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
			else
				arr[pos]=DELIMITADOR;
		}
		
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
		//test cargar patron.
		
		arr[1] = DELIMITADOR;
		arr[2] = 1;
		arr[3] = 2;
		arr[4] = 3;
		arr[5] = 4;
		arr[6] = DELIMITADOR;
		
	}
	
	 private static void imprimir_arr(int[] arr){
			
			for(int pos=0; pos < MAX; pos++ ){
				
				System.out.print("|" +arr[pos]+ "|");	
			}
			System.out.println(" ");
	}
}
