
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Ej12P3 {
	public static final int MAXL=1000, MAX=6, MIN=1;
	public static void main(String[]args){
		int us_num =obtener_num(), contador= 0, dado;
		
		 while(us_num>=MIN&&us_num<=MAX){
			 contador = 0;
			 
			 for(int i=0; i<MAXL; i++){
				dado = (int) (6*Math.random() + 1);
				if(dado ==us_num){
					contador++;
				}
			 }
			 imprimir(contador, us_num);
			 us_num =obtener_num();
		 }
		
	}
	public static int obtener_num(){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int num= 1;
		
		try{
			System.out.println("Ingrese un numero entre 1 y 6 inclusive (cualquier otro numero para salir): ");
			num = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		
		return num;
	}
	private static void imprimir(int num, int us_num){
		System.out.println("El numero "+us_num+" salio "+num+ " veces en "+MAXL+ " tiradas.");
	}
}
