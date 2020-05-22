package instrumentoMusical;

public class InstrumentoMusical {
	private String name;
	private String type;
	private String color;
	private boolean playing = false;
	  
	public InstrumentoMusical(String name, String type, String color) {
		this.name = name;
		this.type = type;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isPlaying() {
		return playing;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
	
	// Methods
	public String toString() {
	 return getName() + " " + getType() + " " + getColor();
	}

	public String play() {
		setPlaying(true);
		return "O instrumento " + getName() + " está tocando...";
	}
	
	public String stop() {
		setPlaying(false);
		return "O instrumento " + getName() + " parou de tocar! Que silêncio...";
	}
	
	public String isPlayingNow() {
		if (isPlaying() == true) {
			return "Está tocando!";
		} else {
			return "Não está tocando! :(";
		}
	}
}
