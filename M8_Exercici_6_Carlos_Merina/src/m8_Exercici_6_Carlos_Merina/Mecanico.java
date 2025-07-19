package m8_Exercici_6_Carlos_Merina;

public class Mecanico extends Trabajador {

	private int sueldoMecanico;
	private String studios;
	private boolean tieneStudio;
	
	public Mecanico(String nombre, String apellido, int edad, int anoAntiguedad, boolean tieneStudio) {
		super(nombre, apellido, edad, anoAntiguedad);
		
		this.tieneStudio = tieneStudio;
		this.sueldoMecanico = super.SUELDO_BASE + (super.SUELDO_PLUS * this.anoAntiguedad);
		studios = (tieneStudio) ? "Si" : "No";
	}
	
//	Getters y Setters
	public int getSueldoMecanico() {
		return this.sueldoMecanico;
	}
	public boolean isTieneStudio() {
		return this.tieneStudio;
	}
	public void setSueldoMecanico(int sueldoMecanico) {
		this.sueldoMecanico = sueldoMecanico;
	}
	public void setTieneStudio(boolean tieneStudio) {
		this.tieneStudio = tieneStudio;
	}

//	Metodo toString
	@Override
	public String toString() {
	    return "\nNombre: " + this.nombre + "\n"
	            + "Apellido: " + this.apellido + "\n"
	            + "Edad: " + this.edad + "\n"
	            + "Sueldo: " + this.sueldoMecanico + "€\n"
	            + "Antiguedad: " + this.anoAntiguedad + " Años\n"	            
	            + "Studios: " + this.studios + "\n";
	}
}