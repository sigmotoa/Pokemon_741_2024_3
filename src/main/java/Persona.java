public class Persona {

    private String nombre;
    private int nacimiento;
    private int edad;
    private int km;

    public Persona(String nombre, int nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.edad = 2024-nacimiento;
    }

    public int getKm() {
        return km;
    }

    public void setKm() {
        km++;
        this.km = km;
    }

    @Override
    public String toString() {
        return "Pesona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
