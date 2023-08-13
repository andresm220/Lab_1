import java.util.Random;
public class Localidad {
    //Atributos de la clase 

    Random random= new Random();
    int asignar;
    int espacio=20;
    int precio;
    int subtotal= 0;
    //metodo para restarle al contador espacio las entradas que se compren en el momento 
    public void setEspacio(int cantidad){
        this.espacio= this.espacio-cantidad;
    }
    //metodo para obtener el valor del contador espacio en ese momento 
    public int getEspacio(){
        return this.espacio;
    }
    //metodo para fijar el precio de las diferentes entradas 
    public void setPrecio(int precio_c ){
        this.precio =precio_c;
    }
    //metodo que devuelve el valor del precio en ese momento 
    public int getPrecio(){
        return this.precio;
    }
    //metodo para llevar la cuenta del subtotal de cada localidad
    public void setSubtotal(int cantidad, int precio_c){
        this.subtotal= this.subtotal + (cantidad*precio);
    }
    //devuelve el subtotal de la localidad en ese momento 
    public int getSubtotal(){
        return this.subtotal;
    }
    //Esto esta agregado porque prefiero hacer con un metodo para elegir la localidad de modo random que hacerlo en el main 
    public void setLocalidad(){
        this.asignar=this.random.nextInt(3)+1;
    }
    public int getLocalidad(){
        return this.asignar;
    }



}
