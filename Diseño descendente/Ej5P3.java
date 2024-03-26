
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej5P3 {
	
	public static final int MAX = 4;
	
	public static void main(String [] args){
		//Toma valor 1 por teclado y lo envia al metodo "ciclo incremento"
		// los valores van hasta imprimir hasta que el numero sea 4 y el metod imprime "Termino".
		
	}
	public static void ciclo_incremento(){
		
		for(int i=1; i<=MAX; i++){
			
			imprimir(i);
		}
	}
	
	private static void imprimir(int numero){
		System.out.println(numero);
		if (numero == 4){
		System.out.println("Termino.");
		}
	}
}
