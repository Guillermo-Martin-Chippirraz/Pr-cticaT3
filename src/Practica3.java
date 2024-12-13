/**
 * Actividad 1, 4
 */

class Practica3{
    //Inicio atributos
    private boolean actividades_entregadas;
    private double nota_practica;
    private double nota_examen;
    //Fin atributos
    public void Practica3(boolean ae, double np, double ne){
        actividades_entregadas=ae;
        nota_practica=np;
        nota_examen=ne;
    }
    //Inicio métodos
    public void imprimirNotas(){
        /*
        Este método imprime si se han entregado las notas comprobando el
        valor de verdad del atributo <<actividades_entregadas>> y luego
        imprime el valor de las notas con el valor de los atributos
        <<nota_practica>> y <<nota_examen>>.
         */
        System.out.println("La nota de clase es la siguiente: ");
        if(actividades_entregadas){
            System.out.println("Se han entregado las actividades del tema.");
        }
        System.out.println("Nota de prácticas: " + nota_practica);
        System.out.println("Nota de examen: " + nota_examen);
    }

    public double calculoMedia(){
        /*Este método declara la variable <<media>>, le asigna el valor
        medio ponderado respecto de los atributos <<nota_practica>> y
        <<nota_examen>> y devuelve el valor calculado de la media.
         */
        double media;
        media = ((nota_practica*0.6)+(nota_examen*0.4));
        return media;
    }

    public boolean aprobarExamen(){
        /*Este método declara las variables booleanas <<nota_minima>>
        y <<media_aprobada>> y les asigna el valor de verdad tras comprobar
        si tanto el atributo <<nota_practica>> como <<nota_examen>> son
        mayores o iguales que cinco, y tras comprobar que el valor que
        devuelve el método <<calculoMedia>> es mayot o igual que cinco,
        respectivamente. Tras ello, comprueba el valor de verdad de <<nota_minima>>
        y de <<media_aprobada>>, y, si ambas son verdaderas, devuelve el valor <<true>>,
        en caso contrario, devuelve el valor <<false>>.
         */
        boolean nota_minima = ((nota_practica>=5) && (nota_examen>=5));
        boolean media_aprobada = (calculoMedia()>=5);
        if(nota_minima && media_aprobada){
            return true;
        }
        return false;
    }
    //Fin métodos
    /* No es necesario añadir un destructor, ya que aunque no se añada, éste
    viene por defecto, y cuando se cierra el compilador, este interpreta también la
    finalización de la clase.
     */
}