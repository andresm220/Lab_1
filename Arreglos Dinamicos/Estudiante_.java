import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Estudiante_ {
    private String nombre;
    private String apellido;
    private String fecha;
    private String sede;
    private String correo;
    private String carne;
    public void setDatos(String nombre,String apellido , String fecha, String sede, String correo, String carne   ){
        this.nombre= nombre;
        this.apellido= apellido;
        this.fecha=fecha;
        this.sede=sede;
        this.correo= correo;
        this.carne= carne;
    }
    public String getSede(){
        return this.sede;
    }
}
    
   