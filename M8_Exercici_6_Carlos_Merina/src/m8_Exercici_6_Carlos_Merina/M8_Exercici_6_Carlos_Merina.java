package m8_Exercici_6_Carlos_Merina;

import java.util.ArrayList;
import java.util.Scanner;

public class M8_Exercici_6_Carlos_Merina {

	static ArrayList<Escuderia> listaEscuderias = new ArrayList<Escuderia>();
	static ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	static ArrayList<Coche> coches = new ArrayList<Coche>();

	public static void main(String[] args) {
		int edad = 0, altura = 0, peso = 0, antiguedad = 0;
		int opcion = 0, opcionAlta = 0, opcionBaja = 0, opcionMostrar = 0;
		boolean tieneFormacion = false;
		Scanner entrada = new Scanner(System.in);
		String respuesta = "", nombre = "", apellido = "", aux = "", nombreEscuderia = "";
		Escuderia escuderia = null;
		Escuderia escuderiaMostrarPilotos = null;
		Escuderia escuderiaMostrarMecanicos = null;

		// Trabajadores
		Piloto piloto1 = new Piloto("Max", "Verstappen", 30, 4, 180, 85);
		Piloto piloto2 = new Piloto("Carlos", "Sainz", 28, 4, 185, 90);
		Mecanico mecanico1 = new Mecanico("Carlos", "Merina", 37, 5, true);

		trabajadores.add(piloto1);
		trabajadores.add(piloto2);
		trabajadores.add(mecanico1);

		// Coches
		Coche coche1 = new Coche(1600, 365, "Principal-Azul", 500000);
		Coche coche2 = new Coche(1600, 350, "Secundario-Naranja", 450000);

		coches.add(coche1);
		coches.add(coche2);

		// Escuderias
		Escuderia escuderia1 = new Escuderia("RedBull", 1000000, "Austria", coches, trabajadores);
		Escuderia escuderia2 = new Escuderia("Mercedez-Benz", 1000000, "UK");

		listaEscuderias.add(escuderia1);
		listaEscuderias.add(escuderia2);

		do {
			System.out.println(menuPrincipal());

			opcion = entrada.nextInt();

			switch (opcion) {
				case 1: // Alta nuevo empleado
					System.out.println(subMenuAlta());
					opcionAlta = entrada.nextInt();
					switch (opcionAlta) {
						case 1: // Alta piloto
							System.out.println("Introduce el nombre de la escuderia:");
							nombreEscuderia = entrada.next();
							escuderia = null;
							for (Escuderia e : listaEscuderias) {
								if (e.getNombre().equalsIgnoreCase(nombreEscuderia)) {
									escuderia = e;
								}
							}
							if (escuderia != null) {
								System.out.println("Introduce su nombre:");
								nombre = entrada.next();
								System.out.println("Introduce su apellido:");
								apellido = entrada.next();
								System.out.println("Introduce su edad:");
								edad = entrada.nextInt();
								System.out.println("Introduce su antiguedad:");
								antiguedad = entrada.nextInt();
								System.out.println("Introduce su altura en cm:");
								altura = entrada.nextInt();
								System.out.println("Introduce su peso en kg:");
								peso = entrada.nextInt();
								Piloto nuevoPiloto = new Piloto(nombre, apellido, edad, antiguedad, altura, peso);
								escuderia.añadirTrabajador(nuevoPiloto);
								System.out.println("Piloto añadido correctamente.");
							} else {
								System.out.println("Escuderia no encontrada.");
							}
							break;
						case 2: // Alta mecanico
							System.out.println("Introduce el nombre de la escuderia:");
							nombreEscuderia = entrada.next();
							escuderia = null;
							for (Escuderia e : listaEscuderias) {
								if (e.getNombre().equalsIgnoreCase(nombreEscuderia)) {
									escuderia = e;
								}
							}
							if (escuderia != null) {
								System.out.println("Introduce su nombre:");
								nombre = entrada.next();
								System.out.println("Introduce su apellido:");
								apellido = entrada.next();
								System.out.println("Introduce su edad:");
								edad = entrada.nextInt();
								System.out.println("Introduce antiguedad:");
								antiguedad = entrada.nextInt();
								System.out.println("Tiene formacion:");
								aux = entrada.next();
								tieneFormacion = aux.equalsIgnoreCase("si");
								Mecanico nuevoMecanico = new Mecanico(nombre, apellido, edad, antiguedad, tieneFormacion);
								escuderia.añadirTrabajador(nuevoMecanico);
								System.out.println("Mecánico añadido correctamente.");
							} else {
								System.out.println("Escuderia no encontrada.");
							}
							break;
						case 0:
							System.out.println("Volviendo...");
							break;
						default:
							System.out.println("Opción no válida.");
							break;
						}
					break;
	
				case 2: // Baja empleado
					System.out.println(subMenuBaja());
					opcionBaja = entrada.nextInt();
					switch (opcionBaja) {
						case 1: // Baja piloto
						case 2: // Baja mecanico
							System.out.println("Introduce el nombre de la escuderia:");
							nombreEscuderia = entrada.next();
							Escuderia escuderiaBaja = null;
							for (Escuderia e : listaEscuderias) {
								if (e.getNombre().equalsIgnoreCase(nombreEscuderia)) {
									escuderiaBaja = e;
								}
							}
							if (escuderiaBaja != null) {
								System.out.println("Introduce el nombre del empleado:");
								nombre = entrada.next();
								System.out.println("Introduce el apellido del empleado:");
								apellido = entrada.next();
								Trabajador trabajadorAEliminar = null;
								for (Trabajador t : escuderiaBaja.trabajadores) {
									if (t.nombre.equalsIgnoreCase(nombre) && t.apellido.equalsIgnoreCase(apellido)) {
										if ((opcionBaja == 1 && t instanceof Piloto) || (opcionBaja == 2 && t instanceof Mecanico)) {
											trabajadorAEliminar = t;
										}
									}
								}
								if (trabajadorAEliminar != null) {
									escuderiaBaja.eliminarTrabajador(trabajadorAEliminar);
									System.out.println("Empleado eliminado correctamente.");
								} else {
									System.out.println("Empleado no encontrado.");
								}
							} else {
								System.out.println("Escuderia no encontrada.");
							}
							break;
						case 0:
							System.out.println("Volviendo...");
							break;

						default:
							System.out.println("Opcion no valida.");
							break;
					}					
					break;
	
				case 3: // Mostrar empleado
					System.out.println(menuVerEmpleados());
					opcionMostrar = entrada.nextInt();
					switch (opcionMostrar) {
						case 1: // Mostrar pilotos
							System.out.println("Introduce el nombre de la escuderia:");
							aux = entrada.next();
							for (Escuderia e : listaEscuderias) {
								if (e.getNombre().equalsIgnoreCase(aux)) {
									escuderiaMostrarPilotos = e;
								}
							}
							if (escuderiaMostrarPilotos != null) {
								ArrayList<Piloto> pilotos = escuderiaMostrarPilotos.getPilotos();
								if (pilotos.size() == 0) {
									System.out.println("No hay pilotos en esta escuderia.");
								} else {
									for (Piloto p : pilotos) {
										System.out.println(p);
									}
								}
							} else {
								System.out.println("Escuderia no encontrada.");
							}
							break;
		
						case 2: // Mostrar mecanicos
							System.out.println("Introduce el nombre de la escuderia:");
							aux = entrada.next();
							for (Escuderia e : listaEscuderias) {
								if (e.getNombre().equalsIgnoreCase(aux)) {
									escuderiaMostrarMecanicos = e;
								}
							}
							if (escuderiaMostrarMecanicos != null) {
								ArrayList<Mecanico> mecanicos = escuderiaMostrarMecanicos.getMecanicos();
								if (mecanicos.size() == 0) {
									System.out.println("No hay mecanicos en esta escuderia.");
								} else {
									for (Mecanico m : mecanicos) {
										System.out.println(m);
									}
								}
							} else {
								System.out.println("Escuderia no encontrada.");
							}
							break;
						case 0:
							System.out.println("Volviendo...");
							break;
						default:
							System.out.println("Opción no válida.");
							break;
						}
					break;
	
				case 4:
					System.out.println("Introduce el nombre de la escuderia:");
					aux = entrada.next();
					Escuderia escuderiaInfo = null;
					for (Escuderia e : listaEscuderias) {
						if (e.getNombre().equalsIgnoreCase(aux)) {
							escuderiaInfo = e;
						}
					}
					if (escuderiaInfo != null) {
						System.out.println(escuderiaInfo);
					} else {
						System.out.println("Escuderia no encontrada.");
					}
					break;
	
				case 0:
					respuesta = "Saliendo...";
					break;
	
				default:
					respuesta = "Opcion no valida!";
					break;
			}
		} while (opcion != 0);		
		System.out.println(respuesta);
	}

//	Metodos propios
	public static String menuPrincipal() {

		String menu = "|******* MENU PRINCIPAL *******|\n"
					+ "|                              |\n"
					+ "|Elige una opcion:             |\n"
					+ "|                              |\n"
					+ "|1 - Alta nuevo empleado       |\n"
					+ "|2 - Baja empleado             |\n"
					+ "|3 - Mostrar empleado          |\n"
					+ "|4 - Ver informacion escuderia |\n"
					+ "|0 - Salir                     |\n"
					+ "|______________________________|";

		return menu;
	}

	public static String subMenuAlta() {

		String menu = "|********* MENU  ALTA *********|\n"
					+ "|                              |\n"
					+ "|Elige una opcion:             |\n"
					+ "|                              |\n"
					+ "|1- Alta nuevo piloto          |\n"
					+ "|2- Alta nuevo mecanico        |\n"
					+ "|0- Volver                     |\n"
					+ "|______________________________|";
		return menu;
	}

	public static String subMenuBaja() {

	    String menu = "|********* MENU  BAJA *********|\n"
	                + "|                              |\n"
	                + "|Elige una opcion:             |\n"
	                + "|                              |\n"
	                + "|1- Baja piloto                |\n"
	                + "|2- Baja mecanico              |\n"
	                + "|0- Volver                     |\n"
	                + "|______________________________|";
    return menu;
}

	public static String menuVerEmpleados() {

		String menu = "|****** MOSTRAR EMPLEADO ******|\n"
					+ "|                              |\n"
					+ "|Elige una opcion:             |\n"
					+ "|                              |\n"
					+ "|1- Mostrar pilotos            |\n"
					+ "|2- Mostrar mecanicos          |\n"
					+ "|0- Volver                     |\n"
					+ "|______________________________|";
		return menu;
	}
}