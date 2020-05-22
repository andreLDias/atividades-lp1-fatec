package lugar;
import java.util.*;
public class Lugar {
  private String name;
  private String country;
  private int citizens;

  // Constructor
  public Lugar(String name, String country, int citizens) {
	  this.name = name;
	  this.country = country;
	  this.citizens = citizens;
  }
 // Getters and setters
 // Name
  public String getName() {
      return this.name;
  }

  public void setName(String name) {
      this.name = name;
  }

  // Country
  public String getCountry() {
      return this.country;
  }

  public void setCountry(String country) {
      this.country = country;
  }

  // Citizens
  public int getCitizens() {
      return this.citizens;
  }

  public void setCitizens(int citizens) {
      this.citizens = citizens;
  }

  // Methods
  public String toString() {
	  return getName() + " " + getCountry() + " " + getCitizens();
  }
  
  public String travel() {
    return "Viajando para o destino! Próxima parada: " + getName();
  }

  public String wichCountry() {
    return "O país do destino é: " + getCountry();
  }

  public String wichPlace() {
    return "O lugar de destino é: " + getName();
  }

  public String tourists() {
    Random rand = new Random();
    int int_random = rand.nextInt(15000);
    String touristsNumber = "O número de turistas hoje é: " + int_random;
    return touristsNumber;
  }
  
  public String temperature() {
	  Random r = new Random();
	  int min = 15;
	  int max = 40;
	  int temperature = r.nextInt(max-min) + min;
	  String obs = (temperature > 25) ? "Leve uma bermuda! Está quente hoje!" : "Melhor levar um casaco! Está frio!";
	  return "A temperatura atual é de " + temperature + " graus celcius. " + obs;
  }
}
