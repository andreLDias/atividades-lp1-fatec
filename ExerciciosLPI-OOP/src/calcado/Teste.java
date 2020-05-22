package calcado;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Calcado> array = new ArrayList<Calcado>();
		Calcado calcado1 = new Calcado("Nike", "Preto", 40);   
	    array.add(calcado1);
	    Calcado calcado2 = new Calcado("Adidas", "Branco", 38);   
	    array.add(calcado2);
	    Calcado calcado3 = new Calcado("Vans", "Preto e branco", 42);   
	    array.add(calcado3);
	    Calcado calcado4 = new Calcado("BandShoes", "Colorido", 41);   
	    array.add(calcado4);
	    Calcado calcado5 = new Calcado("AllStars", "Vermelho", 39);   
	    array.add(calcado5);
	    
	    
	    
	    for(int i = 0; i< array.size(); i++){

	    	System.out.println("O objeto atual é: " + array.get(i));
	    	System.out.println("O tamanho atual é: " + array.get(i).getSize());
	    	array.get(i).increaseSize(5);
	    	System.out.println("O tamanho atual é: " + array.get(i).getSize());
	    	array.get(i).decreaseSize(5);
	    	System.out.println("O tamanho atual é: " + array.get(i).getSize());
	    	System.out.println(array.get(i).buy());
	    	System.out.println(array.get(i).cancel("Tamanho incorreto!"));
	    	System.out.println();
	    }
	}
}
