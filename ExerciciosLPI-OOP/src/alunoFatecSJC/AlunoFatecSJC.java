package alunoFatecSJC;
import pessoa.*;
public class AlunoFatecSJC extends Pessoa{
	private int ra;
	private String course;
	private String semester;

	public AlunoFatecSJC(String name, String surname, int age, int ra, String course, String semester) {
		super(name, surname, age);
		this.ra = ra;
		this.course = course;
		this.semester = semester;
	}
	// Getters and setters
	// RA
	public int getRa() {
		return this.ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	// Course
	public String getCourse() {
		return this.course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	// Semester
	public String getSemester() {
		return this.semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	// Methods
	public String toString() {
		return getName() + " " + getSurname() + " " + getAge() + " " + getRa() + " " + getCourse() + " " + getSemester();
	}
	
	public String info() {
		return "O aluno(a) " + getName() + " está no " + getSemester() + " do curso de " + getCourse();
	}
	
	public String reenroll() {
		return "Aluno(a) " + getName() + " de RA: " + getRa() + " foi rematriculado!";
	}
	
	private void finishCourse() {
		setSemester("Finalizado.");
	}
	
	public String graduate() {
		finishCourse();
		return "Aluno(a) " + getName() + " de RA: " + getRa() + " concluiu o curso!";
	}
}
