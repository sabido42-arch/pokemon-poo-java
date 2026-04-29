package pokemon;

// Subclase PokemonPlanta: hereda de Pokemon
public class PokemonPlanta extends Pokemon {

    // Atributos propios
    private int clorofila;
    private int espinas;

    // Constructor sin parámetros
    public PokemonPlanta() {
        super();
    }

    // Constructor con parámetros
    public PokemonPlanta(String nombre, int nivel, int clorofila, int espinas) {
        super(nombre, nivel, "Planta");
        this.clorofila = clorofila;
        this.espinas = espinas;
    }

    // Getters
    public int getClorofila() {
        return clorofila;
    }

    public int getEspinas() {
        return espinas;
    }

    // Setters
    public void setClorofila(int clorofila) {
        this.clorofila = clorofila;
    }

    public void setEspinas(int espinas) {
        this.espinas = espinas;
    }

    // Método propio
    public void latigoCepa() {
        System.out.println(getNombre() + " usa Látigo Cepa con espinas " + espinas);
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return super.toString() +
                " | Clorofila: " + clorofila +
                " | Espinas: " + espinas;
    }
}