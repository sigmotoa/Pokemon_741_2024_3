public class Main {

    public static void main(String[] args) {

        Entrenador e1 = new Entrenador("sigmotoa", 1969);
        e1.setNivel(Nivel.sigmotoa);
        e1.setPreferencia(Tipo.Fuego);
        System.out.println(e1);

        for (int i = 0; i < 10; i++) {
         e1.setKm();
        }
        System.out.println(e1.getKm());

        LiderGimnasio l1 = new LiderGimnasio("Brok", 1999,Tipo.Tierra);
        Cuidador c1 = new Cuidador("Yeny",1990);

        Pokemon p1 = new Pokemon("Pikachu", Tipo.Electrico);
        System.out.println(p1);

    }




}
