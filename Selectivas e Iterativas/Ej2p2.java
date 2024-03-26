
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej2p2 {

	public static void main(String[]args){
		final int meses= 12;
		int anio, us_mes;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese el numero de su mes de nacimiento");
			us_mes = Integer.valueOf(entrada.readLine());
			
			switch(us_mes){
			case 1:
				System.out.println("Enero 31 dias");
				break;
			case 2: 
				
				System.out.println("Ingrese Año de nacimiento");
				anio = Integer.valueOf(entrada.readLine());
					if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))){
						
						System.out.println("Febrero 29 dias");
					}
						
					else{
						System.out.println("Febrero 28 dias");
					}
				break;
			case 3:
				System.out.println("Marzo 31 dias");
				break;
			case 4:
				System.out.println("Abril 31 dias");
				break;
			case 5:
				System.out.println("Mayo 31 dias");
				break;
			case 6:
				System.out.println("Junio 30 dias");
				break;
			case 7:
				System.out.println("Julio 31 dias");
				break;
			case 8:
				System.out.println("Agosto 31 dias");
				break;
			case 9:
				System.out.println("Septiembre 30 dias");
				break;
			case 10:
				System.out.println("Octubre 31 dias");
				break;
			case 11:
				System.out.println("Noviembre 30 dias");
				break;
			case 12:
				System.out.println("Diciembre 31 dias");
				break;
			default:
				System.out.println("El numero de mes no existe");
			}
			
			
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
