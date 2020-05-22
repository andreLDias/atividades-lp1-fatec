package profissional;

import java.util.ArrayList;

import pessoa.Pessoa;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Profissional> array = new ArrayList<Profissional>();
		Profissional profissional1 = new Profissional("André", "Luiz", 22, "DEV", 1);
	    array.add(profissional1);
	    Profissional profissional2 = new Profissional("Joao", "Raimundo", 41, "Gerente", 13);
	    array.add(profissional2);
	    Profissional profissional3 = new Profissional("Steve", "Jobs", 55, "CEO", 20);
	    array.add(profissional3);
	    Profissional profissional4 = new Profissional("Jose", "Kleber", 18, "Estagiário", 0);
	    array.add(profissional4);
	    Profissional profissional5 = new Profissional("Bill", "Gates", 60, "CEO", 45);
	    array.add(profissional5);
		
		
		for(int i = 0; i< array.size(); i++){

	    	System.out.println("O objeto atual é: " + array.get(i));
	    	System.out.println(array.get(i).scream());
	    	System.out.println(array.get(i).walk());
	    	System.out.println(array.get(i).run());
	    	System.out.println(array.get(i).quarentine());
	    	System.out.println(array.get(i).profissao());
	    	System.out.println(array.get(i).expertise());
	    	int controle = i + 1;
	    	if (i + 1 == array.size()) {
	    		controle = i - 2;
	    	}
	    	String newOc = array.get(controle).getOccupation();
	    	System.out.println(array.get(i).changeOccupation(newOc));
	    	System.out.println();
	    }

	}

}
