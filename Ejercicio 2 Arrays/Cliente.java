public class Cliente {
    String nombre;
    int visitas;
    int acompañantes;
    boolean asignado= true;
    public void setDatos(String nombre,int visitas, int acompañantes){
        this.nombre=nombre;
        this.visitas= visitas;
        this.acompañantes= acompañantes;

    }
    public int getVisitas(){
        return this.visitas;

    }
    public int getAcompañantes(){
        return this.acompañantes + 1;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void  setasignado(boolean asignado){
        this.asignado= asignado;

    }
    public boolean getasigando(){
        return this.asignado;
    }
    

}
