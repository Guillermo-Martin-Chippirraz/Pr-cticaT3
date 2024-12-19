/**
 * Clase Continente: Esta clase recoge los datos sobre un continente, entre ellos el nombre, los océanos asociados y
 * el número de países que contiene. Es una clase de datos.
 *
 * @author Guillermo Martín Chippirraz
 * @version 1.5 19/12/2024
 */

public class Continente {
    /**
     * Atributos
     * nombre: Atributo privado de tipo String que almacena el nombre del continente.
     * oceano_asociado: Atributo privado de tipo String que almacena el océano asociado al continente.
     * numero_paises: Atributo privado de tipo entero que almacena el número de países que contiene el continente.
     */
    private String nombre;
    private String oceano_asociado;
    private int numero_paises;

    /**
     * Constructor por defecto: Inicializa los atributos de tipo String a cadena vacía
     * y el atributo de tipo entero a 0.
     */
    public Continente() {
        this.nombre = this.oceano_asociado = "";
        this.numero_paises = 0;
    }

    /**
     * Constructor por parámetros: Inicializa los atributos según los parámetros introducidos.
     * Se llama al setter del atributo numero_paises para evitar incoherencias y duplicidad de código.
     * @param nombre String que asigna el valor del atributo nombre.
     * @param oceano_asociado String que asigna el valor del atributo oceano_asociado.
     * @param numero_paises Entero que asigna el valor del atributo numero_paises
     */
    public Continente(String nombre, String oceano_asociado, int numero_paises) {
        this.nombre = nombre;
        this.oceano_asociado = oceano_asociado;
        this.setNumero_paises(numero_paises);
    }

    /**
     * Constructor de copia: Inicializa los atributos copiando los valores de los atributos del objeto introducido.
     * @param copia Objeto de la clase continente a introducir.
     */
    public Continente(Continente copia){
        this.nombre = copia.nombre;
        this.oceano_asociado = copia.nombre;
        this.numero_paises = copia.numero_paises;
    }

    /**
     * Getter del atributo nombre
     * @return Devuelve el valor del atributo nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del atributo nombre
     * @param nombre String que asigna el valor del atributo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del atributo oceano_asociado
     * @return Devuelve el valor del atributo oceano_asociado.
     */
    public String getOceano_asociado() {
        return oceano_asociado;
    }

    /**
     * Setter del atributo nombre
     * @param oceano_asociado String que asigna el valor del atributo oceano_asociado.
     */
    public void setOceano_asociado(String oceano_asociado) {
        this.oceano_asociado = oceano_asociado;
    }

    /**
     * Getter del atributo numero_paises
     * @return Devuelve el valor del atributo numero_paises.
     */
    public int getNumero_paises() {
        return numero_paises;
    }

    /**
     * Setter del atributo numero_paises.
     * Asigna el valor del parámetro si este es mayor que 0.
     * Envía un mensaje de error y asignao el valor 0 al atributo
     * numero_paises si el parámetro es menor o igual a cero.
     * @param numero_paises Entero que asigna el valor del atributo numero_paises según se explica
     *                      en la funcionalidad del método.
     */
    public void setNumero_paises(int numero_paises) {
        if(numero_paises > 0)
            this.numero_paises = numero_paises;
        else{
            System.err.println("ERROR. EL NÚMERO DE PAÍSES DE UN CONTINENTE DEBE SER POSITIVO.");
            this.numero_paises = 0;
        }
    }
}
