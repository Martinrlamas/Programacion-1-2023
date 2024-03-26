
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej13P3 {
	public static void main(String[]args){
		int opcion = obtener_num(), r1,r2,r3;
		
		while(opcion>= 1 && opcion<=4){
			r1 = obtener_num();
			r2 = obtener_num();
			r3 =obtener_num();
			if(opcion>1&&opcion<4){
				switch(opcion){
				case 1:
						System.out.println("la raiz cuadrada de"+r1+" y "+r3+" es: "+Math.sqrt(r1*r3));
					break;
				case 2:
					int promedio = (r1+r2+r3)/3;
					System.out.println("El promedio de "+r1+"+"+r2+"+"+r3+ " es: "+promedio);
					break;
				case 3:
					System.out.println("Cociente de la raiz cuadrada de ("+r3+"-"+r2+")/"+r1+ " es: "+ (Math.sqrt(r3-r2))/r1);
					break;
				case 4:
					promedio = (r1+r2+r3)/3;
					System.out.println("El cociente del promedio de los tres valores dividido por la ra�z cuadrada de"+ r2+" es: "+(promedio/(Math.sqrt(r2))));
					break;
				}
				
			}
			else{
				System.out.println("Valores no validos ingrese un valor en el rango de 1 a 4 inclusive fuera de rango para salir");
			}
				opcion = obtener_num();
		}
	}
	
	public static int obtener_num(){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		try{
			
			System.out.println("Ingrese un numero: ");
			num = Integer.valueOf(entrada.readLine());
			
		}
		
		catch(Exception exc){
		System.out.println(exc);	
		}
		return num;
	}
}
