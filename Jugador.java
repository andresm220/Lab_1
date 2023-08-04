public class Jugador {
    int puntuacion_gen;
    int puntuacion_ronda;
    public void setRonda(int puntuacion_ronda){
        this.puntuacion_ronda+=puntuacion_ronda;

    }
    public int getRonda(){
       return this.puntuacion_ronda;
    }


    public void setPuntuacion(int puntuacion_ronda){
        this.puntuacion_gen+=puntuacion_ronda;

    }
    public int getPuntuacion(){
        return this.puntuacion_gen;
    }
    
    public void resetear_jugador(){
        this.puntuacion_gen = 0;
    }
    public void felicitar(){
        System.out.println("Felicidades ganaste el juego ");
    }
}
