package alunoFatecSJC;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<AlunoFatecSJC> array = new ArrayList<AlunoFatecSJC>();
		AlunoFatecSJC aluno1 = new AlunoFatecSJC("André", "Luiz", 22, 123, "Banco de dados", "Segundo semestre");
	    array.add(aluno1);
		AlunoFatecSJC aluno2 = new AlunoFatecSJC("Joao", "Paulo", 24, 112415, "Análise e desenvolvimento", "Sexto semestre");
	    array.add(aluno2);
		AlunoFatecSJC aluno3 = new AlunoFatecSJC("Kleber", "Machado", 22, 1246246, "Banco de dados", "Quarto semestre");
	    array.add(aluno3);
		AlunoFatecSJC aluno4 = new AlunoFatecSJC("Bill", "Gates", 22, 246246, "Logistica", "Quinto semestre");
	    array.add(aluno4);
		AlunoFatecSJC aluno5 = new AlunoFatecSJC("Luiz", "Hamilton", 22, 112453, "Manutenção de aeronaves", "Primeiro semestre");
	    array.add(aluno5);
	    
	    
	    for(int i = 0; i< array.size(); i++){

	    	System.out.println("O objeto atual é: " + array.get(i));
	    	System.out.println(array.get(i).scream());
	    	System.out.println(array.get(i).walk());
	    	System.out.println(array.get(i).run());
	    	System.out.println(array.get(i).quarentine());
	    	System.out.println(array.get(i).info());
	    	System.out.println(array.get(i).reenroll());
	    	System.out.println("Semetre atual: " + array.get(i).getSemester());
	    	System.out.println(array.get(i).graduate());
	    	System.out.println("Semetre atual: " + array.get(i).getSemester());
	    	System.out.println();
	    }
	}

}
