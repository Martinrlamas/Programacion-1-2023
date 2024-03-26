
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej12 {
	public static void main(String[]args){
			
		int numero, numero2, aux_num;
		
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Ingrese el primer valor: ");
			numero = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el segundo valor: ");
			numero2 = Integer.valueOf(entrada.readLine());
			
			System.out.print("Primer valor: "+ numero);
			aux_num = ++numero;
			System.out.println(" Valor incrementado: "+aux_num);
			System.out.print("Segundo valor: "+numero2);
			aux_num = --numero2;
			System.out.println(" Valor decrementado: "+aux_num);
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
