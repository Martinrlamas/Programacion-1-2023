
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej15P2 {
	public static void main(String []args){
		final int  cero=0;
		int us_num = 1, promedio = 0, suma = 0, mayor = 0, menor = 999;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			while(us_num !=cero){
				
				System.out.println("Ingrese un numero por favor (0 para salir): ");
				us_num = Integer.valueOf(entrada.readLine());
				
				 if(us_num != cero){
					 promedio++;
					 suma += us_num;
					 
					 if(us_num>mayor){
						 mayor = us_num;
					 }
					 if(us_num<menor){
						 menor = us_num;
					 }
				 }
			}
			if(promedio != 0){
				
				promedio = suma/promedio;
				System.out.println("El promedio de los numero ingresados es: " +promedio);
				System.out.println("El mayor numero ingresado fue (0 no hubo ninguno): " + mayor);
				System.out.println("El menor numero ingresado fue(999 no hubo numero menor): "+ menor);
			}
			else{
				System.out.println("No se ingresaron numeros");
			}
	
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
