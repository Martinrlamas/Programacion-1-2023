import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej4 {
	public static void main(String[]args){
		int us_num, us_num2, us_num3, us_num4, us_num5;
		
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el primer numero: ");
			us_num = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el segundo numero: ");
			us_num2 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el tercer numero: ");
			us_num3 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el cuarto numero: ");
			us_num4 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el quinto numero: ");
			us_num5 = Integer.valueOf(entrada.readLine());
			
				
				System.out.print("|" + us_num5 +"|");
				System.out.print("|" + us_num4 +"|");
				System.out.print("|" + us_num3 +"|");
				System.out.print("|" + us_num2 +"|");
				System.out.print("|" + us_num +"|");
		}
		catch(Exception exc){
			System.out.println(exc);
			
		}
	}
}