import java.util.*;

public class Fase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.print("Nombre: \n");

        ArrayList<Character> name = new ArrayList<Character>(); // declarar una lista
        name.add('M');
        name.add('i');
        name.add('g');
        name.add('u');
        name.add('e');
        name.add('l');

        for (Character n:name)
        {
            System.out.println(n);
        }

        System.out.print("\n");
        System.out.print("Apellido: \n");


        ArrayList<Character> surname = new ArrayList<Character>(); // declarar una lista
        surname.add('B');
        surname.add('l');
        surname.add('a');
        surname.add('s');
        surname.add('c');
        surname.add('o');

        for (Character s:surname)
        {
        	System.out.println(s);
        }

        // lista fullname

        System.out.print("\n");
        System.out.print("Nombre completo: \n");

        ArrayList<Character> fullName = new ArrayList<Character>(); // declarar una lista


        for (Character n:name)  //guardamos datos de name en fullname
        {
        	fullName.add(n);
        }

        fullName.add(' '); // guardamos espacio en blanco en fullname


        for (Character s: surname) // guardamos datos de surname en fullname
        {
        	fullName.add(s);
        }

        for (Character fn:fullName) //sacamos por pantalla los datos de fullname
        {
        	System.out.println(fn);
        }
    }
}
		
		
		
		
	


