/**
 * La clase Auxiliar representa a un jugador de tipo Auxiliar.
 * Hereda de la clase Jugadorr e incluye atributos y métodos específicos para jugadores de este tipo.
 */
public class Auxiliar extends Jugadorr {
    private int ataques;       // Número de ataques realizados por el Auxiliar
    private int bloqueos_e;    // Número de bloqueos efectivos realizados por el Auxiliar
    private int bloqueos_f;    // Número de bloqueos fallidos realizados por el Auxiliar

    /**
     * Constructor de la clase Auxiliar.
     *
     * @param nombre El nombre del Auxiliar.
     * @param pais El país de origen del Auxiliar.
     * @param errores Número de errores cometidos por el Auxiliar.
     * @param aces Número de aces realizados por el Auxiliar.
     * @param total_servicios Total de servicios realizados por el Auxiliar.
     * @param ataques Número de ataques realizados por el Auxiliar.
     * @param bloqueos_e Número de bloqueos efectivos realizados por el Auxiliar.
     * @param bloqueos_f Número de bloqueos fallidos realizados por el Auxiliar.
     */
    public Auxiliar(String nombre, String pais, int errores, int aces, int total_servicios, int ataques, int bloqueos_e, int bloqueos_f) {
        super(nombre, pais, errores, aces, total_servicios);
        this.ataques = ataques;
        this.bloqueos_e = bloqueos_e;
        this.bloqueos_f = bloqueos_f;
    }

    /**
     * Obtiene el número de ataques realizados por el Auxiliar.
     *
     * @return Número de ataques realizados por el Auxiliar.
     */
    public int getAtaques() {
        return this.ataques;
    }

    /**
     * Obtiene el número de bloqueos efectivos realizados por el Auxiliar.
     *
     * @return Número de bloqueos efectivos realizados por el Auxiliar.
     */
    public int getBloqueosE() {
        return this.bloqueos_e;
    }

    /**
     * Obtiene el número de bloqueos fallidos realizados por el Auxiliar.
     *
     * @return Número de bloqueos fallidos realizados por el Auxiliar.
     */
    public int getBloqueosF() {
        return this.bloqueos_f;
    }

    /**
     * Calcula la efectividad del Auxiliar.
     *
     * @return El valor de la efectividad calculada.
     */
    //@Override
    public double Efectividad() {
        return ((ataques + bloqueos_e - bloqueos_f - errores) * 100 / (ataques + bloqueos_e + bloqueos_f + errores)) + aces * 100 / total_servicios;
    }
}

