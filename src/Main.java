/**
 * Actividad 8
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*3, 5
        Pais p1 = new Pais();
        p1.setNombre("Botswana");
        p1.setIdioma_oficial("Botswanés");
        p1.setContinente("África");

        System.out.println(p1.getNombre());
        System.out.println(p1.getIdioma_oficial());
        System.out.println(p1.getContinente());

        Pais p2 = new Pais("Murcia");
        System.out.println(p2.getNombre());

        Pais p3 = new Pais("Mordor", "Orco provinciano", "Tierra media");
        System.out.println(p3.getNombre());
        System.out.println(p3.getIdioma_oficial());
        System.out.println(p3.getContinente());

        Pais p4 = new Pais("Reino Champiñón", 1000, "Inglés, italiano, balbuceo",
                21553, "Nintendia", false );
        System.out.println(p4.getNombre());
        System.out.println(p4.getNumero_de_habitantes());
        System.out.println(p4.getIdioma_oficial());
        p4.printContinenteYExtension();
        System.out.println(p4.getDemocracia());

         */

        ArrayList a = new ArrayList();
        a.add(12);
        a.add(5);
        a.add(18);
        a.add(9);
        a.add(1);
        System.out.println(a.toString());
        System.out.println(a.contains(12));
        System.out.println(a.contains(13));
        System.out.println(a.contains(14));
        System.out.println(a.isEmpty());
        a.clear();


    }
}
