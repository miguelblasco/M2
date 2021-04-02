import java.util.Scanner;

public class Nivell2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        int i,j,numero;
        
		System.out.print("Introduce altura: ");
		
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		System.out.print("\n");

        for (i = 1; i <= numero; i ++){
            for (j = 1; j <= i; j ++){
            	System.out.print(j);
            }
            System.out.print("\n");
        }
        entrada.close();
    }		
}


