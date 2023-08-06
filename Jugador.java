//Creamos la clase Jugador 
public class Jugador {
    //Declaramos atributos 
    int puntuacion_gen;
    int puntuacion_ronda;
    String nombre;
    int contador;
    //Setter de la puntuacion por ronda
    public void setRonda(int puntuacion_ronda){
        this.puntuacion_ronda+=puntuacion_ronda;

    }
    //Getter de la puntuacion por ronda 
    public int getRonda(){
       return this.puntuacion_ronda;
    }

//Setter de la puntuacion general 
    public void setPuntuacion(int puntuacion_){
        this.puntuacion_gen+=puntuacion_ronda;

    }
    //Getter de la puntuacion general
    public int getPuntuacion(){
        return this.puntuacion_gen;
    }
    //Setter del reseteo de puntaje 
    public void setresetear_jugador(){
        this.puntuacion_ronda = 0;
    }
    //Getter del reseteo de puntaje 
    public int getresetear_jugador(){
        return this.puntuacion_ronda;
    }
    //Metodo para felicitar al jugador cuando gane 
    public void felicitar(String nombre){
        System.out.println("Felicidades ganaste el juego " + nombre );
    }
    //Setter del contador 
    public void setContador(){
        this.contador=+ puntuacion_ronda;
    }
    //Getter del contador 
    public int getContador(){
        return this.contador;
    }
    //Setter del reseteo del contador
    public void ResetearContador(){
        this.contador=0;
    }
    //Getter del reseteo del contador 
    public int getResetearContador(){
        return this.contador;
    }
}
