//Creamos la clase Jugador 
public class Jugador {
    //Declaramos atributos 
    private int puntuacion_gen;
    private int puntuacion_ronda;
    private String nombre;
    //Setter de la puntuacion por ronda
    public void setRonda(int puntuacion_ronda){
        this.puntuacion_ronda+=puntuacion_ronda;

    }
    //Getter de la puntuacion por ronda 
    public int getRonda(){
       return this.puntuacion_ronda;
    }

//Setter de la puntuacion general 
    public void setPuntuacion(int puntuacion_ronda){
        this.puntuacion_gen+=puntuacion_ronda;

    }
    //Getter de la puntuacion general
    public int getPuntuacion(){
        return this.puntuacion_gen;
    }
    //Setter del reseteo de puntaje 
    public void SetResetearJugador(){
        this.puntuacion_ronda = 0;
    }
    //Getter del reseteo de puntaje 
    public int GetResetearJugador(){
        return this.puntuacion_ronda;
    }
    //Metodo para felicitar al jugador cuando gane 
    public void felicitar(String nombre){
        System.out.println("Felicidades ganaste el juego " + nombre );
    }
   
    
}
