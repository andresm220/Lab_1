/**
 * La clase Portero representa a un jugador de tipo Portero.
 * Extiende la clase Jugadorr_ e incluye atributos y métodos específicos para jugadores de este tipo.
 */
public class Portero extends Jugadorr_ {

    // Atributos específicos de un portero
    private int goles_recibidos;        // Número de goles recibidos por el portero
    private int paradas_efectivas;      // Número de paradas efectivas realizadas por el portero
    private int efectividad_P;          // Efectividad del portero

    /**
     * Constructor de la clase Portero.
     *
     * @param nombre El nombre del portero.
     * @param pais El país de origen del portero.
     * @param faltas Número de faltas cometidas por el portero.
     * @param goles_directos Número de goles anotados directamente por el portero.
     * @param total_lanzamientos Total de lanzamientos realizados por el portero.
     * @param goles_recibidos Número de goles recibidos por el portero.
     * @param paradas_efectivas Número de paradas efectivas realizadas por el portero.
     */
    public Portero(String nombre, String pais, int faltas,int goles_directos, int total_lanzamientos,int goles_recibidos,int paradas_efectivas){
        super(nombre,pais,faltas,goles_directos,total_lanzamientos);
        this.goles_recibidos=goles_recibidos;
        this.paradas_efectivas=paradas_efectivas;
    }

    /**
     * Obtiene el número de goles recibidos por el portero.
     *
     * @return Número de goles recibidos por el portero.
     */
    public int getGolesRecib(){
        return this.goles_recibidos;
    }

    /**
     * Obtiene el número de paradas efectivas realizadas por el portero.
     *
     * @return Número de paradas efectivas realizadas por el portero.
     */
    public int getParadas(){
        return this.paradas_efectivas;
    }

    /**
     * Calcula y asigna la efectividad del portero.
     * La fórmula utilizada para calcular la efectividad se describe detalladamente.
     */
    public void setEfectividad(){
        this.efectividad_P=((this.paradas_efectivas - this.goles_recibidos) * 100 / (this.paradas_efectivas + this.goles_recibidos)) + this.goles_directos * 100 / this.total_lanzamientos;
    }

    /**
     * Obtiene la efectividad del portero.
     *
     * @return La efectividad del portero.
     */
    public int getEfectividad(){
        return this.efectividad_P;
    }
}

