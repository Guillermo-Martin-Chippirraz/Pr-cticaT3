public class Continente {
    private String nombre;
    private String oceano_asociado;
    private int numero_paises;

    public Continente() {
        this.nombre = this.oceano_asociado = "";
        this.numero_paises = 0;
    }

    public Continente(String nombre, String oceano_asociado, int numero_paises) {
        this.nombre = nombre;
        this.oceano_asociado = oceano_asociado;
        this.numero_paises = numero_paises;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOceano_asociado() {
        return oceano_asociado;
    }

    public void setOceano_asociado(String oceano_asociado) {
        this.oceano_asociado = oceano_asociado;
    }

    public int getNumero_paises() {
        return numero_paises;
    }

    public void setNumero_paises(int numero_paises) {
        this.numero_paises = numero_paises;
    }
}
