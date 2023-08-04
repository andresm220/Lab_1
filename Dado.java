import java.util.Random;
public class Dado {
    Random random = new Random();
    int valor;
    
    
    public void setValor(){
        this.valor= this.random.nextInt(6)+1;
        

    }
    public int getValor(){
        return this.valor;
        

    }

    
    
}
