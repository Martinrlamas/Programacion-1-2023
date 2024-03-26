import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ej1P2 {
	public static void main(String[]args){
		
		final int Mayor=100, cero = 0;
		int us_num, us_num2, us_num3;
		char letra;
		
		BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un numero para determinar si es positivo o negativo: ");
			us_num = Integer.valueOf(entrada.readLine());
				if(us_num > cero){
					System.out.println("El numero es positivo");
				}
				else if(us_num< cero){
					System.out.println("El numero es negativo");
				}
				else{
					System.out.println("El numero es 0");
				}
				
				System.out.println("Ingrese un numero mayor o menor que 100");
				us_num = Integer.valueOf(entrada.readLine());
				
				if(us_num>Mayor){
					System.out.println("Grande");
				}
				else if(us_num<Mayor){
					System.out.println("Chico");
				}
				
				System.out.println("Ingrese un numero del 1 al 7");
				us_num = Integer.valueOf(entrada.readLine());
				
				switch(us_num){
				
					case 1:
						System.out.println("Lunes");
						break;
					case 2:
						System.out.println("Martes");
						break;
					case 3:
						System.out.println("Miercoles");
						break;
					case 4:
						System.out.println("Jueves");
						break;
					case 5:
						System.out.println("Viernes");
						break;
					case 6:
						System.out.println("Sabado");
						break;
					case 7:
						System.out.println("Domingo");
						break;
					default:
						System.out.println("numero no valido!");
				}
				
				System.out.println("Ingrese una letra: ");
				letra = entrada.readLine().charAt(0);
				
				switch(letra){
				
					case 'a':
						System.out.println("Es vocal");
						break;
					case 'e':
						System.out.println("Es vocal");
						break;
					case 'i':
						System.out.println("Es vocal");
						break;
					case 'o':
						System.out.println("Es vocal");
						break;
					case 'u':
						System.out.println("Es vocal");
						break;
					default:
						System.out.println("Es consonante");
				}
				System.out.println("Ingrese el primer valor numero: ");
				us_num = Integer.valueOf(entrada.readLine());
				System.out.println("Ingrese el segundo valor numero: ");
				us_num2 = Integer.valueOf(entrada.readLine());
				System.out.println("Ingrese el tercer valor numero: ");
				us_num3 = Integer.valueOf(entrada.readLine());
				
				if((us_num < us_num2) &&(us_num2< us_num3)){
					
					System.out.println("Creciente");
				}
				else if((us_num>us_num2)&&(us_num2>us_num3)){
					
					System.out.println("Decreciente");
				}
				else{
					System.out.println("Error!");
				}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
