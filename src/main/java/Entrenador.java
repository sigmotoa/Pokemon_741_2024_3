public class Entrenador extends Persona {

        public Entrenador(String nombre, int nacimiento) {
        super(nombre, nacimiento);
    }
    private Nivel nivel;
    private Tipo preferencia;

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public void setPreferencia(Tipo preferencia) {
        this.preferencia = preferencia;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nivel=" + nivel +
                ", preferencia=" + preferencia +
                "} " + super.toString();
    }

    public Entrenador(String nombre, int nacimiento, Tipo preferencia) {
        super(nombre, nacimiento);
        this.preferencia = preferencia;
    }
}
