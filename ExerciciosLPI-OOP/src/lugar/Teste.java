package lugar;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Lugar> array = new ArrayList<Lugar>();
		Lugar lugar1 = new Lugar("São Paulo", "Brazil", 12000000);   
	    array.add(lugar1);

	    Lugar lugar2 = new Lugar("New York", "USA", 8000000);
	    array.add(lugar2);
	    
	    Lugar lugar3 = new Lugar("Athens", "Greece", 664046);
	    array.add(lugar3);
	    
	    Lugar lugar4 = new Lugar("São José dos Campos", "Brazil", 700000);
	    array.add(lugar4);
	    
	    Lugar lugar5 = new Lugar(" ", " ", 0);
	    lugar5.setName("Lisbon");
	    lugar5.setCountry("Portugal");
	    lugar5.setCitizens(500000);
	    array.add(lugar5);

	    for(int i = 0; i< array.size(); i++){

	    	System.out.println("O objeto atual é: " + array.get(i));
	    	System.out.println(array.get(i).travel());
	    	System.out.println(array.get(i).wichPlace());
	    	System.out.println(array.get(i).wichCountry());
	    	System.out.println(array.get(i).tourists());
	    	System.out.println(array.get(i).temperature());
	    	System.out.println();
	    }
	}

}
