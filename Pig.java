public class Pig {
    public static void main(String[] args){
        System.out.print("Bienvenidos a PIG");
        Dado dado1,dado2;
        dado1= new Dado();
        dado2= new Dado();
        Jugador jugador1,jugador2;
        System.out.println("Turno del jugador 1");
        dado1.setValor();
        dado2.setValor();
        int valor= dado1.getValor();
        int valor2 =dado2.getValor();

    }
}
