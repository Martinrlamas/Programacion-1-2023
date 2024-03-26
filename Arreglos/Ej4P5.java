
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej4P5 {
	
	public static final int MAX = 10;
	
	public static void main(String[]args){
		
		char [] arrchar = new char[MAX];;
		char us_char = obtener_char();
		
		cargar_arr_char(arrchar);
		imprimir_arr(arrchar);
		
		 if(Character.isLowerCase(us_char)){
			 int cont = 0;
			 for(int pos = 0; pos<MAX; pos++){
				 if(arrchar[pos] == us_char){
					 
					 System.out.println("Arr["+pos+"]= "+us_char);
					 cont ++;
				 }
			 }
			 if(cont==0){
				 
				 System.out.println("No existe valor");
			 }
			 
		 }
		 else{
			 System.out.println("Valor no valido");
		 }
	}
	
	public static char obtener_char(){
		
		char letra = ' ';
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			System.out.println("Ingrese un carater letra minuscula: ");
			letra = entrada.readLine().charAt(0);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		return letra;
	}
	
	public static void cargar_arr_char(char [] arr){
		Random r = new Random();
		for (int pos = 0; pos < MAX; pos++){
			arr[pos]=(char)(r.nextInt(26) + 'a');
		}
	}
	private static void imprimir_arr(char[] arr){
			
			for(int pos=0; pos < MAX; pos++ ){
				
				System.out.print("|" +arr[pos]+ "|");
			}
			System.out.println(" ");
	}
}
