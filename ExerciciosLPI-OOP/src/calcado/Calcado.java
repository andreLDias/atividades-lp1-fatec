package calcado;

public class Calcado {
	private String brand;
	private String color;
	private int size;

	// Constructor
	public Calcado(String brand, String color, int size) {
		this.brand = brand;
		this.color = color;
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	// Methods
	public String toString() {
		return "Marca: " + getBrand() + " Cor:" + getColor() + " Tamanho:" + getSize();
	}
	
	public void increaseSize(int increaseAmount) {
		setSize(getSize() + increaseAmount);
	}
	
	public String buy() {
		return "Comprando o produto " + toString() + ". Parabéns pela compra e obrigado pela preferência!";
	}
	
	public void decreaseSize(int decreaseAmount) {
		setSize(getSize() - decreaseAmount);
	}
	
	public String cancel(String reason) {
		return "Compra sendo cancelada!. Motivo: " + reason;
	}
}
