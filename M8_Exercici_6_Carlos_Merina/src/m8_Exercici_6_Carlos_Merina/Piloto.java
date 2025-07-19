package m8_Exercici_6_Carlos_Merina;

public class Piloto extends Trabajador {
	
	private double alturaPiloto;
	private double pesoPiloto;	
	private int sueldoPiloto;
	private final int SUELDO_PELIGROSIDAD = 50000;

//	Constructor clase Piloto
	public Piloto(String nombre, String apellido, int edad,	int anoAntiguedad, double alturaPiloto, double pesoPiloto) {
		super(nombre, apellido, edad, anoAntiguedad);
		
		this.alturaPiloto = alturaPiloto;
		this.pesoPiloto = pesoPiloto;		
		this.sueldoPiloto = super.SUELDO_BASE + (super.SUELDO_PLUS * this.anoAntiguedad) + this.SUELDO_PELIGROSIDAD;
		}
	
//	Getters y Setters
	public double getAlturaPiloto() {
		return this.alturaPiloto;
	}
	public double getPesoPiloto() {
		return this.pesoPiloto;
	}
	public int getSueldoPiloto() {
		return this.sueldoPiloto;
	}
	public void setAlturaPiloto(double alturaPiloto) {
		this.alturaPiloto = alturaPiloto;
	}
	public void setPesoPiloto(double pesoPiloto) {
		this.pesoPiloto = pesoPiloto;
	}
	public void setSueldoPiloto(int sueldoPiloto) {
		this.sueldoPiloto = sueldoPiloto;
	}
	
//	Metodo toString
	@Override
	public String toString() {
		return "\nNombre: " + this.nombre + "\n"
				+ "Apellido: " + this.apellido + "\n"
				+ "Edad: " + this.edad + "\n"
				+ "Altura: " + this.alturaPiloto + "cm\n"
				+ "Peso: " + this.pesoPiloto + "kg\n"
				+ "Antiguedad: " + this.anoAntiguedad + " Años\n"
				+ "Sueldo: " + this.sueldoPiloto + "€\n";
	}
}