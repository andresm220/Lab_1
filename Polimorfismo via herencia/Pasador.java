/**
 * La clase Pasador representa a un jugador de tipo Pasador.
 * Hereda de la clase Jugadorr e incluye atributos y métodos específicos para jugadores de este tipo.
 */
public class Pasador extends Jugadorr {
    private int pases;   // Número de pases realizados por el Pasador
    private int fintas;  // Número de fintas realizadas por el Pasador

    /**
     * Constructor de la clase Pasador.
     *
     * @param nombre El nombre del Pasador.
     * @param pais El país de origen del Pasador.
     * @param errores Número de errores cometidos por el Pasador.
     * @param aces Número de aces realizados por el Pasador.
     * @param total_servicios Total de servicios realizados por el Pasador.
     * @param pases Número de pases realizados por el Pasador.
     * @param fintas Número de fintas realizadas por el Pasador.
     */
    public Pasador(String nombre, String pais, int errores, int aces, int total_servicios, int pases, int fintas) {
        super(nombre, pais, errores, aces, total_servicios);
        this.pases = pases;
        this.fintas = fintas;
    }

    /**
     * Obtiene el número de pases realizados por el Pasador.
     *
     * @return Número de pases realizados por el Pasador.
     */
    public int getPases() {
        return this.pases;
    }

    /**
     * Obtiene el número de fintas realizadas por el Pasador.
     *
     * @return Número de fintas realizadas por el Pasador.
     */
    public int getFintas() {
        return this.fintas;
    }

    /**
     * Calcula la efectividad del Pasador.
     *
     * @return El valor de la efectividad calculada.
     */
    //@Override
    public double Efectividad() {
        return ((pases + fintas - errores) * 100 / (pases + fintas + errores)) + aces * 100 / total_servicios;
    }
}

