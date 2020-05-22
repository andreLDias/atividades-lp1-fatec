package instrumentoMusical;

import java.util.ArrayList;

import pessoa.Pessoa;

public class Teste {

	public static void main(String[] args) {
		ArrayList<InstrumentoMusical> array = new ArrayList<InstrumentoMusical>();
		InstrumentoMusical instrumento1 = new InstrumentoMusical("Viola", "Cordas", "Marrom");
	    array.add(instrumento1);
	    InstrumentoMusical instrumento2 = new InstrumentoMusical("Violão", "Cordas", "Branco");
	    array.add(instrumento2);
	    InstrumentoMusical instrumento3 = new InstrumentoMusical("Trompete", "Metais", "Dourado");
	    array.add(instrumento3);
	    InstrumentoMusical instrumento4 = new InstrumentoMusical("Bateria", "Percussão", "Preta");
	    array.add(instrumento4);
	    InstrumentoMusical instrumento5 = new InstrumentoMusical("Baixo", "Cordas", "Vermelho");
	    array.add(instrumento5);
	    
	    for(int i = 0; i< array.size(); i++){

	    	System.out.println("O objeto atual é: " + array.get(i));
	    	System.out.println(array.get(i).isPlayingNow());
	    	System.out.println(array.get(i).play());
	    	System.out.println(array.get(i).isPlayingNow());
	    	System.out.println(array.get(i).stop());
	    	System.out.println(array.get(i).isPlayingNow());
	    	System.out.println();
	    }
	    
	}

}
