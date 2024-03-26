
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej9 {
	public static void main(String[]args){
		
		double numero, cal_num;
		
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Ingrese el primer valor: ");
			numero = Double.valueOf(entrada.readLine());
			cal_num= numero/2;
			System.out.println(numero +" : 2 = " + cal_num);
			cal_num=numero/4;
			System.out.println(numero +" : 4 = " + cal_num);
			cal_num =numero/6;
			System.out.println(numero +" : 6 = " + cal_num);
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
