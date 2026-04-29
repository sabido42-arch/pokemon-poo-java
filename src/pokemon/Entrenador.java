package pokemon;

// Clase Entrenador. Asociación: un entrenador tiene un único Pokemon
public class Entrenador {
	
	//Atributos 
	private String nombre;
	private int experiencia;
	private int edad;
	private String ciudad;
	
	// Asociación: cada entrenador tiene un único Pokemon
	private IPokemon companero;
	
	// Constructor sin parámetros
	public Entrenador() {
	}
	
	// Constructor con parámetros
	public Entrenador(String nombre, int experiencia, int edad, String ciudad, IPokemon companero) {
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.edad = edad;
		this.ciudad = ciudad; 
		this.companero = companero;
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
	

	public IPokemon getCompanero() {
		return companero;
	}
	
	public void setCompanero(IPokemon companero) {
	    this.companero = companero;
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
		
	
	@Override
	public String toString() {
		return "Entrenador: " + nombre
				+ ", experiencia= " + experiencia 
				+ " , edad= " + edad
				+ " , ciudad= " + ciudad
				+ " , companero= " + (companero != null ? companero.getNombre() : "Sin Pokemon");
	}
}
