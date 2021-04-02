
public class Nivell3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int horas = 23;
		int minutos = 59;
		int segundos = 55;
		
		while(true) 
		{
			if (horas < 10){
				System.out.print("0");
			}
			System.out.print(horas + ":");
			
			if (minutos < 10){
				System.out.print("0");
			}
			System.out.print(minutos + ":");
			
			if (segundos < 10){
				System.out.print("0");
			} 
			System.out.println(segundos);
			
			segundos ++;
			
			if (segundos == 60){
				segundos = 0;
				minutos ++;    
										
				if (minutos == 60) {
					minutos = 0;
					horas ++;
						
					if (horas == 24) {
						horas = 0;
					}
				}
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}
}
