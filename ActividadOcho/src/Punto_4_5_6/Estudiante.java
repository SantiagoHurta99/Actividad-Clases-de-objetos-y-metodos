package Punto_4_5_6;

public class Estudiante {
	private String nombre;
	private int creditos;
	private double gpa;
	private int puntosCalidad;
	
	public Estudiante(String nombre, int creditos, int puntosCalidad) {
		this.nombre = nombre;
		this.creditos = creditos;
		this.puntosCalidad = puntosCalidad;
		this.gpa = (double)puntosCalidad / creditos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getPuntosCalidad() {
		return puntosCalidad;
	}

	public void setPuntosCalidad(int puntosCalidad) {
		this.puntosCalidad = puntosCalidad;
	}
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", creditos=" + creditos + ", gpa=" + gpa + ", puntosCalidad=" + puntosCalidad + "]";
	}

	public double calcularGPA () {
		double result = (double)this.puntosCalidad / this.creditos;
		return result;
	}
	
	public void adicionarCreditos_PuntosCalidad(int creditos, int puntosCalidad) {
		setCreditos(this.creditos + creditos);
		setPuntosCalidad(this.puntosCalidad + puntosCalidad);
		setGpa(calcularGPA());
	}
}
