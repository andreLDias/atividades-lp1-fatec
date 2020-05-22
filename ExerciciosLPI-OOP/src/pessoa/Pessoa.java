package pessoa;
import java.util.*;

public class Pessoa {
	private String name;
	private String surname;
	private int age;

	// Constructor
	public Pessoa(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	// Getters and setters
	// Name
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// Surname
	public String getSurname() {
		return this.surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	// Age
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Methods
	public String toString() {
		return getName() + " " + getSurname() + " " + getAge();
	}
	
	public String scream() {
		return getName() + " gritou: AHHHHHHHHHHHHHHHH!!!!";
	}
	
	public String walk() {
		return "A pessoa " + getName() + " está andando!";
	}
	
	public String run() {
		return "A pessoa " + getName() + " está correndo!!!!!";
	}
	
	public String quarentine() {
		Random r = new Random();
	    int int_random = r.nextInt(100);
		return "A pessoa " + getName() + " está em quarenta faz " + int_random + " dias!";
	}
}
