package profissional;

import pessoa.Pessoa;

public class Profissional extends Pessoa{
	private String occupation;
	private int yearsOfExperience;

	public Profissional(String name, String surname, int age, String occupation, int yearsOfExperience) {
		super(name, surname, age);
		this.occupation = occupation;
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	// Methods
	public String toString() {
		return getName() + " " + getSurname() + " " + getAge() + " " + getOccupation() + " " + getYearsOfExperience();
	}
	
	public String profissao() {
		return "A profissão do(a) " + getName() + " é: " + getOccupation();
	}
	
	public String expertise() {
		return getName() + " tem " + getYearsOfExperience() + " ano(s) de experiência em " + getOccupation();
	}
	
	public String changeOccupation(String newOccupation) {
		setOccupation(newOccupation);
		setYearsOfExperience(0);
		return "Agora o novo cargo de " + getName() + " é: " + getOccupation();
	}
}
