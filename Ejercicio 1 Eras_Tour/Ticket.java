import java.util.Random;
public class Ticket {
    //atributos de la clase 
    Random random = new Random();;
    int numero_ticket;
    int rango_inicial;
    int rango_final;
   //metodo para elegir de manera random el numero del ticket
    public void setNumero(){
        random=new Random();
        this.numero_ticket=this.random.nextInt(15000)+1;

    }
    //devuelve el numero de ticket
    public int getNumero(){
        return this.numero_ticket;

    }
    //metodo para dar un valor random del rango inicial
    public void setRango_inicial(){
        this.rango_inicial=this.random.nextInt(15000)+1;

    }
    //devuelve el rango inicial
    public int getRango_inicial(){
        return this.rango_inicial;

    }
    //metodo para settera el rango final siempre segurandonos que sea mayor al rango inicial
    public void setRango_final(){
        random=new Random();
        this.rango_final= (this.random.nextInt(15000 - this.rango_inicial))+this.rango_inicial + 1;

    }
    //devuelve el valor del rango final 
    public int getRango_final(){
        return this.rango_final;
    }
    // se elimino un metodo porque no se considera necesario se llamaba Ticekt_Apto 
   
    
}
