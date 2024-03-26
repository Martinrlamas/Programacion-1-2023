package Secuencias;

public class ejParcial2022 {

	static final int MAX = 22;
	static final int cte2 = 2;
	static final int cte3 = 3;

    public static void main(String[] args) {
    	int[] A = {1,2,3,4,5,6,7,8,9,10,11,11,11,12,13,14,15,16,17,18,19,20};
    	int[] B = {0,2,4,8,4,6,0,1,11,13,4,5,6,7,0,2,2,2,2,0};
    	int fin = indice_final_sec_primos(B);
    	int inicio = indice_inicial_sec(B, fin);
    	System.out.println("Arreglo A sin primos de B eliminados: ");
    	imprimir_arr(A);
    	eliminar_primos_arreglo(A, B, inicio, fin);
    	System.out.println("Arreglo A con primos de B eliminados: ");
    	imprimir_arr(A);
    }
    //preexistente
    public static int indice_final_sec_primos(int[] arr){
        return 13;//no es necesario poner valor
    }
    //Practico 7 ejercicio 12
    public static int indice_inicial_sec(int[] arr, int pos){
    	while ((pos>0)&&(arr[pos]!=0)){
    		pos--;
    	}
    	return pos+1;
    }
    //Practico 7 ejercicio 8
    public static void corrimiento_izq(int[] arr, int pos){
    	while (pos<MAX-1){
    		arr[pos] = arr[pos+1];
    		pos++;
    	}
    }
    //Practico 7 ejemplo 6
    public static int obt_pos_valor_ord(int[] arr, int valor){

    	int pos = 0;
    	while ((pos<MAX)&&(arr[pos]<valor)){
    		pos++;
    		System.out.println("valor de inicio: "+ pos);
    	}
    	return pos;
    }
    //Practico 7 ejercicio 8
    public static void eliminar_primos_arreglo(int[] A, int[] B, int inicio, int fin){
    	int pos = 0;
    	while (inicio<fin){									
    		if ((B[inicio]%cte2!=0)&&(B[inicio]%cte3!=0)){
    			pos = obt_pos_valor_ord(A,B[inicio]);
    			if ((pos<fin)&&(A[pos]==B[inicio])){
    				
    				while(A[pos]==B[inicio]){
    					
    					corrimiento_izq(A,pos);
    				}
                }
            }
    		System.out.println("valor de pos: "+pos);
    		inicio++;
    	}
    }
	 private static void imprimir_arr(int[] arr){
			
			for(int pos=0; pos < MAX; pos++ ){
				
				System.out.print("|" +arr[pos]+ "|");	
			}
			System.out.println(" ");
	}
}
