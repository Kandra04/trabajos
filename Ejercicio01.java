package Practica02;
import java.io.*;

public class Ejercicio01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int PrimerNum;
		int SegundoNum;
		
		BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("Dime un numero entero.");
		
		
		String valor_escrito=br.readLine();
		
		PrimerNum=Integer.parseInt(valor_escrito);
		
		
		
		BufferedReader br2= new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("Dime otro numero entero, y te lo comparare al primer numero.");
		
		
		String valor_escrito2=br2.readLine();
		
		SegundoNum=Integer.parseInt(valor_escrito2);
		
		
				if(PrimerNum>SegundoNum){
			
					System.out.println("El primer numero que es el " + PrimerNum + " es mayor que el segundo " +SegundoNum+ ".");
				
				}else if (PrimerNum<SegundoNum) {
			
			
				System.out.println("El segundo numero que es el " + SegundoNum + " es mayor que el primero que es el " +PrimerNum+ ".");
			
		
				}else {
			
					System.out.println("El primero numero que es el " +PrimerNum+ " y el segundo que es " + SegundoNum + " son iguales.");
				}	
				
				
				
	}		
}
	


