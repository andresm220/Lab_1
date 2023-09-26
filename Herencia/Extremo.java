/**
 * La clase Extremo representa a un jugador de tipo Extremo.
 * Hereda de la clase Jugadorr_ e incluye atributos y métodos específicos para jugadores de este tipo.
 */
public class Extremo extends Jugadorr_ {
    
    // Atributos específicos de un extremo
    private int pases;                    // Número de pases realizados por el extremo
    private int asistencias_efectivas;    // Número de asistencias efectivas realizadas por el extremo
    private int efectividad_E;            // Efectividad del extremo

    /**
     * Constructor de la clase Extremo.
     *
     * @param nombre El nombre del extremo.
     * @param pais El país de origen del extremo.
     * @param faltas Número de faltas cometidas por el extremo.
     * @param goles_directos Número de goles anotados directamente por el extremo.
     * @param total_lanzamientos Total de lanzamientos realizados por el extremo.
     * @param pases Número de pases realizados por el extremo.
     * @param asistencias_efectivas Número de asistencias efectivas realizadas por el extremo.
     */
    public Extremo(String nombre, String pais, int faltas,int goles_directos, int total_lanzamientos,int pases,int asistencias_efectivas){
        super(nombre,pais,faltas,goles_directos,total_lanzamientos);
        this.pases=pases;
        this.asistencias_efectivas=asistencias_efectivas;
    }

    /**
     * Obtiene el número de pases realizados por el extremo.
     *
     * @return Número de pases realizados por el extremo.
     */
    public int getPases(){
        return this.pases;
    }

    /**
     * Obtiene el número de asistencias efectivas realizadas por el extremo.
     *
     * @return Número de asistencias efectivas realizadas por el extremo.
     */
    public int getAsis(){
        return this.asistencias_efectivas;
    }

    /**
     * Calcula y asigna la efectividad del extremo.
     * La fórmula utilizada para calcular la efectividad se describe detalladamente.
     */
    public void setEfectividad_e(){
        this.efectividad_E=((this.pases + this.asistencias_efectivas - this.faltas) * 100 / (this.pases + this.asistencias_efectivas + this.faltas)) + this.goles_directos * 100 / this.total_lanzamientos;
    }

    /**
     * Obtiene la efectividad del extremo.
     *
     * @return La efectividad del extremo.
     */
    public int getEfectividad_E(){
        return this.efectividad_E;
    }
}
