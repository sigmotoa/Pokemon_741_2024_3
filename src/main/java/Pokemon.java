public class Pokemon {
    private String nombre;
    private Tipo tipo;
    private int vida;

    public Pokemon(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        vida = 100;
    }

    @Override
    public String toString() {
        return "Pokemon{"+
            "nombre="+nombre+
            "vida="+vida+
            "}";
    }
}
