
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ej6 {
	public static void main(String[]args){
		String cliente,producto1, producto2;
		char t_factura;
		int n_factura;
		double val_producto1, val_producto2, importe_final;
		try{
			BufferedReader entrada= new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Ingrese tipo de factura: ");
			t_factura = entrada.readLine().charAt(0);
			
			System.out.println("Ingrese su nombre y apellido: ");
			cliente = entrada.readLine();
			
			System.out.println("Ingrese Numero de factura : ");
			n_factura = Integer.valueOf(entrada.readLine());
			
			System.out.println("Ingrese nombre del primer producto: ");
			producto1 = entrada.readLine();
			System.out.println("Valor: ");
			val_producto1 = Double.valueOf(entrada.readLine());
			
			System.out.println("Ingrese nombre del segundo producto: ");
			producto2 = entrada.readLine();
			System.out.println("Valor: ");
			val_producto2 = Double.valueOf(entrada.readLine());
			
			importe_final = val_producto1 + val_producto2;
			
			System.out.println("Factura\t\t" +t_factura + "\t N" +n_factura + "\n" +
								"Nombre  "+ cliente + "\n" +
								"Producto:\t\t Importe\n" +
								producto1 + "\t\t" + val_producto1 + "\n" +
								producto2 + "\t\t" + val_producto2 + "\n" +
								"Importe total:\t\t" + importe_final);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
}
