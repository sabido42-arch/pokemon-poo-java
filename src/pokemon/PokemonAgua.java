package pokemon;

// Subclase PokemonAgua: hereda de Pokemon
public class PokemonAgua extends Pokemon {

    // Atributos propios
    private int presionChorro;
    private int capacidadDeposito;

    // Constructor sin parámetros
    public PokemonAgua() {
        super();
    }

    // Constructor con parámetros
    public PokemonAgua(String nombre, int nivel, int presionChorro, int capacidadDeposito) {
        super(nombre, nivel, "Agua");
        this.presionChorro = presionChorro;
        this.capacidadDeposito = capacidadDeposito;
    }

    // Getters
    public int getPresionChorro() {
        return presionChorro;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    // Setters
    public void setPresionChorro(int presionChorro) {
        this.presionChorro = presionChorro;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    // Método propio
    public void pistolaAgua() {
        System.out.println(getNombre() + " usa Pistola Agua con presión " + presionChorro);
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return super.toString() +
                " | Presión chorro: " + presionChorro +
                " | Capacidad depósito: " + capacidadDeposito;
    }
}


	




