/**
 * La clase Libero representa a un jugador de tipo Libero.
 * Hereda de la clase Jugadorr e incluye atributos y métodos específicos para jugadores de este tipo.
 */
public class Libero extends Jugadorr {

    // Atributo específico de un Libero
    private int recibos_efectivos; // Número de recibos efectivos realizados por el Libero
    
    /**
     * Constructor de la clase Libero.
     *
     * @param nombre El nombre del Libero.
     * @param pais El país de origen del Libero.
     * @param errores Número de errores cometidos por el Libero.
     * @param aces Número de aces realizados por el Libero.
     * @param total_servicios Total de servicios realizados por el Libero.
     * @param recibos_efectivos Número de recibos efectivos realizados por el Libero.
     */
    public Libero(String nombre, String pais, int errores, int aces, int total_servicios, int recibos_efectivos) {
        super(nombre, pais, errores, aces, total_servicios);
        this.recibos_efectivos = recibos_efectivos;
    }

    /**
     * Obtiene el número de recibos efectivos realizados por el Libero.
     *
     * @return Número de recibos efectivos realizados por el Libero.
     */
    public int getRecib() {
        return this.recibos_efectivos;
    }

    /**
     * Calcula la efectividad del Libero.
     *
     * @return El valor de la efectividad calculada.
     */
    //@Override
    public double Efectividad() {
        return ((recibos_efectivos - errores) * 100 / (recibos_efectivos + errores)) + (aces * 100 / total_servicios);
    }
}

    

