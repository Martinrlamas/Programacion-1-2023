
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej20P2 {
	public static void main(String[] args){
		final int cero = 0;
		int us_num= 1,num,num2,num3,num4,num5;
		String us_text;
		char us_char = 'o';
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		try{
			while(us_num !=0){
				System.out.println("Ingrese un numero entero (0 para salir): ");
				us_num = Integer.valueOf(entrada.readLine());
					if(us_num>0&&us_num !=0){
						while(us_char != 'z'){
							System.out.println("Ingrese un caracter( 'z' para salir): ");
							us_char = entrada.readLine().charAt(0);
							
							if(us_char != 'z'){
								
								switch(us_char){
								
								case 'a':
									System.out.println("escriba lo que desee: ");
									us_text = entrada.readLine();
										System.out.println(us_text);
									break;
									
								case 'b':
									System.out.println("Ingrese el primer valor: ");
									num = Integer.valueOf(entrada.readLine());
									System.out.println("Ingrese el segundo valor: ");
									num2 = Integer.valueOf(entrada.readLine());
									System.out.println("Ingrese el tercer valor: ");
									num3 = Integer.valueOf(entrada.readLine());
									System.out.println("Ingrese el cuarto valor: ");
									num4 = Integer.valueOf(entrada.readLine());
									System.out.println("Ingrese el quinto valor: ");
									num5 = Integer.valueOf(entrada.readLine());
										if((num<num2)&&(num2<num3)&&(num3<num4)&&(num4<num5)){
											System.out.println("Los numeros estan colocados de forma ascendente.");
										}
									break;
									
								case 'c':
									System.out.println("Por favor ingrese dos numeros enteros negativos: ");
									num = Integer.valueOf(entrada.readLine());
									System.out.println("Ingrese el segundo valor: ");
									num2 = Integer.valueOf(entrada.readLine());
									
									if(num<0&&num2<0){
											int raiz =num*num2;
											Math.sqrt(raiz);
											System.out.println("La raiz de: |" + num+"*"+num2+"| es:"+ raiz);
											
										}else{
											System.out.println("Los valores no son validos");
										}
									break;
							default:
								System.out.println("Error, valor no permitido!");
								}
							}
						}
						
					}
					else if(us_num<0 &&us_num!=0){
						System.out.println("El valor ingresado no esta permitido");
					}
			}
			
			
		}catch(Exception exc){
			System.out.println(exc);
		}
		
	}
}
