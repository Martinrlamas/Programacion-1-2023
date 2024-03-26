
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej11P3 {
	public static final int MAX=20;
	public static void main(String[]args){
		double nummayor, num2;
		
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			try{
				System.out.println("Ingrese un numero:");
				nummayor = Double.valueOf(entrada.readLine());
				
				for(int i=0; i<MAX;i++){
					System.out.println("ingrese un numero: ");
					num2 = Double.valueOf(entrada.readLine());
						nummayor = NumMayor(nummayor, num2);
				}
				imprimir(nummayor);
			}
			catch(Exception exc){
				
			}
		
	}
	public static double NumMayor(double num1, double num2){
		
		if(num1>num2){
			
			return num1;
		}
		else if(num1==num2){
			
			return num1;
		}
		else{
			return num2;
		}
	}
	private static void imprimir(double num){
		System.out.println("El numero mas grande ingresado es: " +num);
	}
}
