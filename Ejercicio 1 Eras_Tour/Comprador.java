public class Comprador {
    //atributos de la clase 
    String nombre;
    String email;
    int cantidad;
    int presupuesto;
    //metodo para settear los datos del usuario recibe como parametros cada dato que el usuario necesita ingresar
    public void setDatos(String nombre,String email, int cantidad , int presupuesto){
        this.nombre= nombre;
        this.email=email;
        this.cantidad=cantidad;
        this.presupuesto= presupuesto;


    }
    // devuelve la cantidad de boletos que el usuario 
    public int getCantidad(){
        return this.cantidad;
    }
    //devuelve el presupuesto del usuario 
    public int getPresupuesto(){
        return this.presupuesto;

    }
    // se elimino un metodo llamada setTotal porque no se consideraba necesario 
   

}
