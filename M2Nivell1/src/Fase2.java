import java.util.*;


public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        ArrayList<Character> caracteres = new ArrayList<Character>(); // declarar una lista
        caracteres.add('M');
        caracteres.add('1');
        caracteres.add('g');
        caracteres.add('u');
        caracteres.add('e');
        caracteres.add('l');

        for (Character c:caracteres) {
        	
        	System.out.println(c);
        }
    

      char letra;
      boolean esVocal;
      boolean esNumero;


      for (Character c:caracteres){
            letra = c;

            esVocal = ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u'));
            esNumero = (letra >= '0') && (letra <= '9');

            if (esNumero) {
            	System.out.println(c + " Los nombres de personas no contienen número");
            }else if (esVocal) {
            	System.out.println(c + " es vocal");
            }else System.out.println(c + " es conosonante");
        }       
}
}
		
		
		
	


