/**
 * Actividad 2, 3, 5, 6
 */

public class Pais {
    private String nombre;
    private int numero_de_habitantes;
    private String idioma_oficial;
    private double extension_geografica;
    private String continente;
    private boolean democracia;
    private static int numPaises = 0;

    public Pais(){
        nombre = "";
        numero_de_habitantes=0;
        idioma_oficial="";
        extension_geografica=0;
        continente="";
        democracia=false;
        numPaises++;
    }
    public Pais(String n){
        nombre = n;
        numero_de_habitantes=0;
        idioma_oficial="";
        extension_geografica=0;
        continente="";
        democracia=false;
        numPaises++;
    }

    public Pais(String n, String io, String c){
        nombre = n;
        numero_de_habitantes=0;
        idioma_oficial=io;
        extension_geografica=0;
        continente=c;
        democracia=false;
        numPaises++;
    }

    public Pais(String n, int ndh, String io, double ec,
                     String c, boolean d){
        nombre = n;
        numero_de_habitantes=ndh;
        idioma_oficial=io;
        extension_geografica=ec;
        continente=c;
        democracia=d;
        numPaises++;
    }

    public String getNombre(){
        return(nombre);
    }

    public int getNumero_de_habitantes(){
        return numero_de_habitantes;
    }

    public String getIdioma_oficial(){
        return idioma_oficial;
    }

    public double getExtension_geografica(){
        return extension_geografica;
    }

    public String getContinente(){
        return continente;
    }

    public boolean getDemocracia(){
        return democracia;
    }

    public void setNombre(String n){
        nombre=n;
    }

    public void setNumero_de_habitantes(int n){
        numero_de_habitantes=n;
    }

    public void setIdioma_oficial(String i){
        idioma_oficial=i;
    }

    public void setExtension_geografica(double eg){
        extension_geografica=eg;
    }

    public void setContinente(String c){
        continente=c;
    }

    public void setDemocracia(boolean d){
        democracia=d;
    }

    public boolean compruebaHabitantes(int n){
        numero_de_habitantes = n;
        if(numero_de_habitantes > 10000){
            return true;
        }
        return false;
    }

    public void printContinenteYExtension(){
        System.out.println("El continente del pais es " + continente + " y la " +
                "extensión geográfica del país es " + extension_geografica + ".");
    }

    public boolean compruebaNombre(String n, String c){
        nombre = n;
        continente = c;
        if(nombre.contains(continente)){
            return true;
        }
        return false;
    }
}
