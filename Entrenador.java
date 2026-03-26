package ud4.caso1;

// Clase Entrenador. Asociación: un entrenador tiene un único Pokemon
public class Entrenador {
	
	//Atributos privados para encapsular la información del entrenador
	private String nombre;
	private int experiencia;
	
	// Dos atributos extras 
	private int edad;
	private String ciudad;
	
	// Asociación: cada entrenador tiene un único Pokemon
	private Pokemon companhero;
	
	// Constructor sin parámetros
	public Entrenador() {
	}
	
	// Constructor con parámetros
	public Entrenador(String nombre, int experiencia, int edad, String ciudad, Pokemon companhero) {
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.edad = edad;
		this.ciudad = ciudad; 
		this.companhero = companhero;
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	
	public int getExperiencia() {
		return experiencia;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public Pokemon getCompanhero() {
		return companhero;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void setCompanhero(Pokemon companhero) {
		this.companhero = companhero;
	}
	
	@Override
	public String toString() {
		return "Entrenador [nombre= " + nombre
				+ ", experiencia= " + experiencia 
				+ " , edad= " + edad
				+ " , ciudad= " + ciudad
				+ " , companhero= " + (companhero != null ? companhero.getNombre() : "Sin Pokemon")
				+ "]";
	}
}
