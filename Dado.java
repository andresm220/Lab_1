import java.util.Random;
//Creamos la clase dado 
public class Dado {
    //Declaramos variables 
    Random random = new Random();
    int valor;
    
    //Valor es un numero random entre 1 y 6 
    public void setValor(){
        this.valor= this.random.nextInt(6)+1;
        

    }
    //Getter del valor 
    public int getValor(){
        return this.valor;
        

    }

    
    
}
