package m8_Exercici_6_Carlos_Merina;

public class Trabajador {
//	Atributos super clase
	public String nombre;
	public String apellido;
	public int edad;
	public int anoAntiguedad;
	public final int SUELDO_BASE = 50000;
	public final int SUELDO_PLUS = 10000;
	
//	Constructor super clase
	public Trabajador(String nombre, String apellido, int edad, int anoAntiguedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.anoAntiguedad = anoAntiguedad;
	}
	
//	Getters y Setters
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public int getEdad() {
		return this.edad;
	}
	public int getAnoAntiguedad() {
		return this.anoAntiguedad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setAnoAntiguedad(int anoAntiguedad) {
		this.anoAntiguedad = anoAntiguedad;
	}
}