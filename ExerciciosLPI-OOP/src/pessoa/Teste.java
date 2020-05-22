package pessoa;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Pessoa> array = new ArrayList<Pessoa>();
		Pessoa pessoa1 = new Pessoa("André", "Luiz", 22);
	    array.add(pessoa1);
	    
		Pessoa pessoa2 = new Pessoa("Larissa", "Henrique", 24);
	    array.add(pessoa2);
	    
		Pessoa pessoa3 = new Pessoa("Isabela", "Dias", 16);
	    array.add(pessoa3);
	    
		Pessoa pessoa4 = new Pessoa("Paulo", "Renato", 23);
	    array.add(pessoa4);

	    Pessoa pessoa5 = new Pessoa(" ", " ", 0);
	    pessoa5.setName("Fernanda");
	    pessoa5.setSurname("Alves");
	    pessoa5.setAge(51);
	    array.add(pessoa5);

	    for(int i = 0; i< array.size(); i++){

	    	System.out.println("O objeto atual é: " + array.get(i));
	    	System.out.println(array.get(i).scream());
	    	System.out.println(array.get(i).walk());
	    	System.out.println(array.get(i).run());
	    	System.out.println(array.get(i).quarentine());
	    	System.out.println();
	    }
	}

}
