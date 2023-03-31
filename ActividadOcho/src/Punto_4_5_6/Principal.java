package Punto_4_5_6;

public class Principal {
	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Mary Jones", 14, 46);
		Estudiante e2 = new Estudiante("John Stiner", 60, 173);
		Estudiante e3 = new Estudiante("Ari Samala", 31, 69);
		
		System.out.println(e3.toString());
		e3.adicionarCreditos_PuntosCalidad(13, 52);
		System.out.println(e3.toString());
	}
}
