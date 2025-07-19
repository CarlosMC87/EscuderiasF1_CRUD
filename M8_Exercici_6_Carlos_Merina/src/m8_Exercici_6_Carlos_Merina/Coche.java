package m8_Exercici_6_Carlos_Merina;

public class Coche {
//	Atributos de la clase coche
	private static int idSiguiente = 1;
	private int id;
	private int potencia;
	private int velMax;
	private int pvp;
	private String color;
	
//	Constructor clase coche
	public Coche(int potencia, int velMax, String color, int pvp) {
		this.id = this.idSiguiente;
		this.idSiguiente++;
		this.potencia = potencia;
		this.velMax = velMax;
		this.color = color;
		this.pvp = pvp;
		
	}
	
//	Metodo toString
	@Override
	public String toString() {
		return "\nId_Coche: " + this.id + "\n"
				+ "Potencia: " + this.potencia + "c.c\n"
				+ "Velocidad Maxima: " + this.velMax + "km\\h\n"
				+ "Color: " + this.color + "\n"
				+ "PVP: " + this.pvp + "€\n";
	}
}