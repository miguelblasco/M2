import java.util.*;

public class Nivell2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num = 0;
	int k = 1;
	int i = 0;
	int j = 1;
		
	System.out.print("Introduce altura: ");	
	Scanner entrada = new Scanner(System.in);
	num = entrada.nextInt();
	System.out.print("\n");
		
	do{
		for (i = k; i <= num; i ++)
			{	
				System.out.print(i);
				System.out.print("*");									
			}  		
		k = k + 1;
		num--;
			
		System.out.print("\n");
		
		// éste for nos permite aumentar los espacios en blanco por línea
		for (j = 1; j < k; j ++) {
			System.out.print("  ");
			}
	
	}while (num >= k);  
	entrada.close();
	
	}
}
