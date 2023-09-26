/**
 * La clase Jugadorr_ representa a un jugador de un equipo.
 * Es una clase base que puede ser extendida por jugadores de tipos específicos (como Portero o Extremo).
 */
public class Jugadorr_  {

    // Atributos protegidos que describen las características del jugador
    protected String nombre;          // El nombre del jugador
    protected String pais;            // El país de origen del jugador
    protected int  faltas ;           // Número de faltas cometidas por el jugador
    protected int goles_directos;     // Número de goles anotados directamente por el jugador
    protected int total_lanzamientos; // Total de lanzamientos realizados por el jugador

    /**
     * Constructor de la clase Jugadorr_.
     *
     * @param nombre El nombre del jugador.
     * @param pais El país de origen del jugador.
     * @param faltas Número de faltas cometidas por el jugador.
     * @param goles_directos Número de goles anotados directamente por el jugador.
     * @param total_lanzamientos Total de lanzamientos realizados por el jugador.
     */
    public Jugadorr_(String nombre, String pais, int faltas,int goles_directos, int total_lanzamientos){
        this.nombre=nombre;
        this.pais=pais;
        this.faltas=faltas;
        this.goles_directos=goles_directos;
        this.total_lanzamientos=total_lanzamientos;
    }

    /**
     * Obtiene el nombre del jugador.
     *
     * @return El nombre del jugador.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene el país de origen del jugador.
     *
     * @return El país de origen del jugador.
     */
    public String getPais(){
        return this.pais;
    }

    /**
     * Obtiene el número de faltas cometidas por el jugador.
     *
     * @return Número de faltas cometidas por el jugador.
     */
    public int getFaltas(){
        return this.faltas;
    }

    /**
     * Obtiene el número de goles anotados directamente por el jugador.
     *
     * @return Número de goles anotados directamente por el jugador.
     */
    public int getGoles(){
        return this.goles_directos;
    }

    /**
     * Obtiene el total de lanzamientos realizados por el jugador.
     *
     * @return Total de lanzamientos realizados por el jugador.
     */
    public int getLanz(){
        return total_lanzamientos;
    }
}
