/**
 * La clase Jugadorr representa a un jugador de voleibol.
 * Contiene información básica sobre el jugador, como nombre, país y estadísticas de juego.
 */
public class Jugadorr {
    protected String nombre;          // Nombre del jugador
    protected String pais;            // País de origen del jugador
    protected int errores;            // Número de errores cometidos por el jugador
    protected int aces;               // Número de aces realizados por el jugador
    protected int total_servicios;    // Total de servicios realizados por el jugador

    /**
     * Constructor de la clase Jugadorr.
     *
     * @param nombre El nombre del jugador.
     * @param pais El país de origen del jugador.
     * @param errores Número de errores cometidos por el jugador.
     * @param aces Número de aces realizados por el jugador.
     * @param total_servicios Total de servicios realizados por el jugador.
     */
    public Jugadorr(String nombre, String pais, int errores, int aces, int total_servicios) {
        this.nombre = nombre;
        this.pais = pais;
        this.errores = errores;
        this.aces = aces;
        this.total_servicios = total_servicios;
    }

    /**
     * Obtiene el nombre del jugador.
     *
     * @return El nombre del jugador.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene el país de origen del jugador.
     *
     * @return El país de origen del jugador.
     */
    public String getPais() {
        return this.pais;
    }

    /**
     * Obtiene el número de errores cometidos por el jugador.
     *
     * @return Número de errores cometidos por el jugador.
     */
    public int getErrores() {
        return this.errores;
    }

    /**
     * Obtiene el número de aces realizados por el jugador.
     *
     * @return Número de aces realizados por el jugador.
     */
    public int getAces() {
        return this.aces;
    }

    /**
     * Obtiene el total de servicios realizados por el jugador.
     *
     * @return Total de servicios realizados por el jugador.
     */
    public int getServ() {
        return this.total_servicios;
    }

    /**
     * Método para calcular la efectividad del jugador (debe ser sobrescrito por las subclases).
     *
     * @return La efectividad del jugador.
     */
    public double Efectividadj() {
        return 0;
    }
}
