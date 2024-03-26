
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej14P2 {
	public static void main(String []args){
		final int MAX=10;
		int us_num, contador = 0;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			for(int i = 0; i < MAX; i++){
				System.out.println("Ingrese un numero entero (0 para salir): ");
				us_num = Integer.valueOf(entrada.readLine()); 
				if(us_num == 0){
					break;
				}
					if(us_num>0){
						if(us_num % 2== 0){
							contador++;
						}
					}else{
						System.out.println("Valor no valido");
						break;
					}
			}
			System.out.println("Fueron ingresados "+ contador+ " numeros pares");
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
