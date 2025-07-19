# 🏎️ Gestión de Escuderías de Fórmula 1 en Java 🏎️

Desarrollé una aplicación en Java utilizando los principios de la Programación Orientada a Objetos (POO) para gestionar información de escuderías de Fórmula 1, sus coches y su personal (pilotos y mecánicos). Permite dar de alta, baja y visualizar la información de los empleados, así como la de las escuderías y los monoplazas. Este proyecto se enfoca en el uso de herencia y polimorfismo para una gestión eficiente de los diferentes tipos de trabajadores.

🧩 Tecnologías y Conceptos Utilizados:

✅ Java: Lenguaje principal de desarrollo.<br>
✅ Programación Orientada a Objetos (POO): Diseño basado en clases, objetos, herencia, polimorfismo y encapsulamiento.<br>
✅ Herencia: Piloto y Mecanico heredan de Trabajador, reutilizando atributos y comportamientos comunes.<br>
✅ Polimorfismo: Manejo de objetos Piloto y Mecanico como Trabajador en colecciones (ArrayList) y a través del operador instanceof.<br>
✅ Clases y Objetos: Modelado de entidades como Escuderia, Coche, Trabajador, Piloto y Mecanico.<br>
✅ ArrayList: Para almacenar colecciones de coches y trabajadores dentro de cada escudería.<br>
✅ Encapsulamiento: Uso de private para atributos y public para métodos (getters y setters).<br>
✅ Métodos toString(): Implementación para una representación legible de los objetos.<br>
✅ Gestión de Consola: Interacción con el usuario a través de la consola para las operaciones CRUD.<br>

📂 Estructura Modular:

Trabajador.java: Clase base para todos los empleados de la escudería. Define atributos comunes como nombre, apellido, edad y antigüedad, además del sueldo base.
Piloto.java: Clase que extiende Trabajador. Añade atributos específicos como altura y peso, y calcula el sueldo del piloto con un plus por peligrosidad y antigüedad.
Mecanico.java: Clase que extiende Trabajador. Incluye un atributo para indicar si tiene estudios superiores de mecánica y su propio cálculo de sueldo basado en la antigüedad.
Coche.java: Clase para modelar los monoplazas, con atributos como potencia, velocidad máxima, color y precio. Incorpora un id autoincremental.
Escuderia.java: Clase principal que agrupa coches y trabajadores (pilotos y mecánicos) utilizando ArrayList. Contiene métodos para añadir, eliminar y listar trabajadores, haciendo uso de instanceof para diferenciar entre pilotos y mecánicos.

M8_Exercici_6_Carlos_Merina.java:<br>
Clase principal con el método main. Contiene la lógica del menú, la interacción con el usuario y la gestión de las colecciones de escuderías. Aquí se inicializan algunos datos de ejemplo.

🧠 ¿Qué Aprendí o Reforcé?

✅ Aplicación Práctica de la POO: Consolidé la comprensión de la herencia y el polimorfismo en un escenario real.<br>
✅ Diseño de Jerarquías de Clases: Creación de una estructura lógica de clases (Trabajador como superclase, Piloto y Mecanico como subclases).<br>
✅ Manejo de Colecciones Polimórficas: Cómo almacenar diferentes tipos de objetos relacionados en una misma colección y procesarlos de forma diferenciada usando instanceof.<br>
✅ Desarrollo de Interfaces de Consola: Implementación de menús interactivos para gestionar la aplicación.<br>
✅ Cálculos de Salarios Condicionales: Lógica para calcular salarios basados en la categoría del empleado y su antigüedad.<br>
✅ Modularización del Código: Organización del proyecto en clases con responsabilidades claras.<br>

💡 ¡Estoy muy satisfecho con este proyecto! Me permitió aplicar y consolidar conceptos fundamentales de la POO en Java, cruciales para el desarrollo de software más complejo.
