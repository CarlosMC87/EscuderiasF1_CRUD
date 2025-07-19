package m8_Exercici_6_Carlos_Merina;

import java.util.ArrayList;

public class Escuderia {
	
	String nombre;
	int presupuesto;
	String pais;	
    ArrayList<Coche> coches;
    ArrayList<Trabajador> trabajadores;
	
//  Constructor Escuderia sin coche, sin pilotos, y sin mecanicos.
	public Escuderia(String nombre, int presupuesto, String pais) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.pais = pais;		
        this.coches = new ArrayList<Coche>();
        this.trabajadores = new ArrayList<Trabajador>();
	}
	
//  Constructor de Escuderia con coche y, con los pilotos, y mecanicos dentro del array trabajadores
	public Escuderia(String nombre, int presupuesto, String pais, ArrayList<Coche> coches, ArrayList<Trabajador> trabajadores) {
    this.nombre = nombre;
    this.presupuesto = presupuesto;
    this.pais = pais;

    this.coches = new ArrayList<Coche>();
    for (Coche c : coches) {
    	añadirCoche(c);
//      this.coches.add(c);
    }
    this.trabajadores = new ArrayList<Trabajador>();
    for (Trabajador t : trabajadores) {
    	añadirTrabajador(t);
//  	this.trabajadores.add(t);
    }
}

//  Getters y Setters
	public String getNombre() {
		return this.nombre;
	}
	public int getPresupuesto() {
		return this.presupuesto;
	}
	public String getPais() {
		return this.pais;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
		
//	Metodos Generales
    public void añadirCoche(Coche coche) {
        coches.add(coche);
    }
    public void eliminarCoche(Coche coche) {
        coches.remove(coche);
    }
    public void añadirTrabajador(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }
    public void eliminarTrabajador(Trabajador trabajador) {
        trabajadores.remove(trabajador);
    }

//  Metodos para buscar trabajador usando instanceof
    public ArrayList<Piloto> getPilotos() {
        ArrayList<Piloto> pilotos = new ArrayList<>();
        for (Trabajador t : trabajadores) {
            if (t instanceof Piloto) {
                pilotos.add( (Piloto) t);
            }
        }
        return pilotos;
    }

    public ArrayList<Mecanico> getMecanicos() {
        ArrayList<Mecanico> mecanicos = new ArrayList<>();
        for (Trabajador t : trabajadores) {
            if (t instanceof Mecanico) {
                mecanicos.add( (Mecanico) t);
            }
        }
        return mecanicos;
    }

//  Metodo toString    
    @Override
    public String toString() {
        String resultado = "\n***ESCUDERIA***\nNombre:" + nombre + "\n" +
                "Presupuesto: " + presupuesto + "\n" +
                "País: " + pais + "\n";
        resultado += "\n***MONOPLAZAS***";
        for (Coche c : coches) {
            resultado += c.toString();
        }
        resultado += "\n***PILOTOS***";
        for (Piloto p : getPilotos()) {
            resultado += p.toString();
        }
        resultado += "\n***MECANICOS***";
        for (Mecanico m : getMecanicos()) {
            resultado += m.toString();
        }
        return resultado;
    } 
}