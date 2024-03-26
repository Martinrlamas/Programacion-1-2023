
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej19P2 {
	public static void main(String[]args){
		final int MIN= 1, MAX=12, anio19=2019, anio00=2000;
		int us_num;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese el numero de un mes del año: ");
			us_num = Integer.valueOf(entrada.readLine());
				if(us_num<=MAX&&us_num>=MIN){
					
					switch(us_num){
					case 1:case 3:case 5:case 7:case 8:case 10:case 12:
						System.out.println("Este mes tiene 31 dias");
						break;
						
					case 4:case 6:case 9:case 11:
						System.out.println("Este mes tiene 30 dias");
						break;
						
					case 2:
						System.out.println("Ingrese el año entre 2000 y 2019:");
						us_num = Integer.valueOf(entrada.readLine());
							
							if(us_num>=anio00&&us_num<=anio19){
								
								switch(us_num){
								case 2000:case 2004:case 2008:case 2012:case 2016:
									System.out.println("El mes tiene 29 dias");
									break;
									
								default:
									System.out.println("El mes tiene 28 dias");
								}
							}
							else{
								System.out.println("año no valido");
							}
						break;
					}
				}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
