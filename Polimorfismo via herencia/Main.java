import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String [] args){
         boolean seguir=true;
         ArrayList<Jugadorr> jugadores= new ArrayList<Jugadorr>();
         ArrayList<Libero> liberos = new ArrayList<Libero>();
         ArrayList<Pasador> pasadores= new ArrayList<Pasador>();
         ArrayList<Auxiliar> auxiliares= new ArrayList<Auxiliar>();
         
        Scanner sc= new Scanner(System.in);
        //Cargamos los datos del csv al programa 
        try (BufferedReader reader = new BufferedReader(new FileReader("Jugadores.csv"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            String tipoJugador = datos[0];
            String nombre = datos[1];
            String pais = datos[2];
            int errores = Integer.parseInt(datos[3]);
            int aces = Integer.parseInt(datos[4]);
            int servicios = Integer.parseInt(datos[5]);

            Jugadorr jugador = null;

            switch (tipoJugador) {
                case "Libero":
                    int recibos = Integer.parseInt(datos[6]);
                    jugador = new Libero(nombre, pais, errores, aces, servicios, recibos);
                    liberos.add((Libero)jugador);
                    break;
                case "Pasador":
                    int pases = Integer.parseInt(datos[6]);
                    int fintas = Integer.parseInt(datos[7]);
                    jugador = new Pasador(nombre, pais, errores, aces, servicios, pases, fintas);
                    pasadores.add((Pasador)jugador);
                    break;
                case "Auxiliar":
                    int ataques = Integer.parseInt(datos[6]);
                    int bloqueos_e = Integer.parseInt(datos[7]);
                    int bloqueos_f = Integer.parseInt(datos[8]);
                    jugador = new Auxiliar(nombre, pais, errores, aces, servicios, ataques, bloqueos_e, bloqueos_f);
                    auxiliares.add((Auxiliar)jugador);
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de jugador desconocido: " + tipoJugador);
            }

            jugadores.add(jugador);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

        while(seguir){
            menu();
            String choice=sc.next();
            switch(choice){
                case "1":
                System.out.println("¿Qué tipo de jugador va a registrar?");
                System.out.println("1.Libero");
                System.out.println("2.Pasador");
                System.out.println("3.Auxiliar ");

                String tipo = sc.next();
                switch(tipo){
                    //Se piden datos al usuario y se usa un try catch para tener errores amigables con el usuario
                    case "1":
                   try {
                        System.out.println("Ingrese el nombre");
                        String nombre_l = sc.next();
                        System.out.println("Ingrese el pais de origen");
                        String pais_l = sc.next();
                        System.out.println("Ingrese los erroes que cometió");
                        int errores_l = Integer.parseInt(sc.next());
                        System.out.println("Ingrese los aces que hizo");
                        int aces_l = Integer.parseInt(sc.next());
                        System.out.println("Ingrese el total de servicios que hizo ");
                        int servicios_l = Integer.parseInt(sc.next());
                        System.out.println("Ingrese los recibos efectivos");
                        int recibos = Integer.parseInt(sc.next());
                        
                        //una vez se tienen los datos se crea el objeto y se añade a la lista que le corresponde
                        
                        Libero libero = new Libero(nombre_l, pais_l, errores_l, aces_l, servicios_l, recibos);
                        jugadores.add(libero);
                        liberos.add(libero);
                       


                        } catch (InputMismatchException e) {
                        System.out.println("Error: Entrada inválida. Debe ingresar un número entero.");
                        } catch (NumberFormatException e) {
                        System.out.println("Error: No se ha ingresado un número entero.");
                        } catch (ArithmeticException e) {
                        System.out.println("Error: División por cero.");
                        }

                    
                    
                    
                    
                    break;
                    case "2":
                    //Mismo funcionamiento que el codigo de arriba pero para el pasador en vez de para el libero 
                    try {
                        System.out.println("Ingrese el nombre");
                        String nombre_p = sc.next();
                        System.out.println("Ingrese el pais de origen");
                        String pais_p = sc.next();
                        System.out.println("Ingrese los erroes que cometió");
                        int errores_p = Integer.parseInt(sc.next());
                        System.out.println("Ingrese los aces que hizo");
                        int aces_p = Integer.parseInt(sc.next());
                        System.out.println("Ingrese el total de servicios que hizo ");
                        int servicios_p = Integer.parseInt(sc.next());
                        System.out.println("Ingrese los pases que hizo ");
                        int pases = Integer.parseInt(sc.next());
                        System.out.println("Ingrese las fintas que hizo ");
                        int fintas = Integer.parseInt(sc.next());
                        Pasador pasador = new Pasador(nombre_p, pais_p, errores_p, aces_p, servicios_p, pases, fintas);
                        jugadores.add(pasador);
                        pasadores.add(pasador);
                    
                 
                    
                       
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Entrada inválida. Debe ingresar un número entero.");
                    } catch (NumberFormatException e) {
                        System.out.println("Error: No se ha ingresado un número entero.");
                    } catch (ArithmeticException e) {
                        System.out.println("Error: División por cero.");
                    }
                    break;
                    case "3":
                    try {
                        System.out.println("Ingrese el nombre");
                        String nombre_a = sc.next();
                        System.out.println("Ingrese el pais de origen");
                        String pais_a = sc.next();
                        System.out.println("Ingrese los erroes que cometió");
                        int errores_a = Integer.parseInt(sc.next());
                        System.out.println("Ingrese los aces que hizo");
                        int aces_a = Integer.parseInt(sc.next());
                        System.out.println("Ingrese el total de servicios que hizo ");
                        int servicios_a = Integer.parseInt(sc.next());
                        System.out.println("Ingrese los ataques que hizo ");
                        int ataques = Integer.parseInt(sc.next());
                        System.out.println("Ingrese los bloqueos efectivos  que hizo ");
                        int bloqueos_e = Integer.parseInt(sc.next());
                        System.out.println("Ingrese los bloqueos fallidoss  que hizo ");
                        int bloqueos_f = Integer.parseInt(sc.next());

                        Auxiliar auxiliar= new Auxiliar(nombre_a, pais_a, errores_a, aces_a, servicios_a, ataques, bloqueos_e,bloqueos_f);
                        jugadores.add(auxiliar);
                
                 
                    
                       
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Entrada inválida. Debe ingresar un número entero.");
                    } catch (NumberFormatException e) {
                        System.out.println("Error: No se ha ingresado un número entero.");
                    } catch (ArithmeticException e) {
                        System.out.println("Error: División por cero.");
                    }
                    break;


                    default: 
                    System.out.println("Ingrese un numero entre 1 y 3 ");
                    break;
                }
                break;
                case "2":
                
                //Validamos que haya liberos registrados
                if(liberos.isEmpty()){
                    System.out.println("No hay liberos registrados aun ");
                 

                }else{
                    System.out.println("\u001B[31m" + "LIBEROS" + "\u001B[0m");
                    //Si si hay imprimimos todos los datos de cada libero con un for each
                    for(Libero libero: liberos){
                        System.out.println(" | Nombre: " + libero.getNombre() + " | Pais de Origen: " + libero.getPais() +  " |Efectividad: "+ libero.Efectividad() + "%");


                }
                }
                //Igual que el codigo para el libero 
                if(pasadores.isEmpty()){
                    System.out.println("No hay pasadores registrados aun");
                }else{
                    System.out.println("\u001B[31m" + "PASADORES" + "\u001B[0m");
                    for(Pasador pasador : pasadores){
                    System.out.println(" | Nombre: " + pasador.getNombre() + " | Pais de Origen: " + pasador.getPais() + " | Efectividad: " + pasador.Efectividad() + "%");


                }

                }
                if(auxiliares.isEmpty()){
                    System.out.println(  "No hay auxiliares registrados aún");


                }else{
                    System.out.println("\u001B[31m" +"AUXILIARES " + "\u001B[0m");
                    for(Auxiliar auxiliar : auxiliares){
                    System.out.println(" | Nombre: " + auxiliar.getNombre() + " | Pais de Origen: " + auxiliar.getPais() + " | Efectividad: " + auxiliar.Efectividad() + "%");

                    }
                    
                }
                
                
                


                



                break;
                case"3":
                if(liberos.isEmpty()){
                    System.out.println("No hay liberos registrados aún");
                }else{
                Collections.sort(liberos, new Comparator<Libero>() {
     
                    public int compare(Libero libero1, Libero libero2) {
                        return Double.compare(libero2.Efectividad(), libero1.Efectividad());
                    }
                });
                

                int cantidadLiberos = Math.min(3, liberos.size());
                for (int i = 0; i < cantidadLiberos; i++) {
                    Libero libero = liberos.get(i);
                    System.out.println("Nombre: " + libero.getNombre() + ", Efectividad: " + libero.Efectividad() + "%");
                }
            }
                break;
                case "4":
                if (pasadores.isEmpty()) {
                    System.out.println("No hay pasadores registrados aún");
                } else {
                    //si no esta vacio por cada efectividad que de un pasador mayor a 80% se le suma uno al contador 
                    int contador = 0;
            
                    for (Pasador pasador : pasadores) {
                        if (pasador.Efectividad() > 80) {
                            contador++;
                        }
                    }
            //Imprimimos 
                    System.out.println("La cantidad de pasadores con más de un 80% de efectividad es " + contador);
                }
                break;

         
                case"5":
                seguir=false;
                System.out.println("Hasta la proxima");
                try (PrintWriter writer = new PrintWriter(new FileWriter("Jugadores.csv"))) {
        for (Jugadorr jugador : jugadores) {
            String tipoJugador = jugador.getClass().getSimpleName();
            String jugadorStr = tipoJugador + "," + jugador.getNombre() + "," + jugador.getPais() + "," + jugador.getErrores() + "," + jugador.getAces() + "," + jugador.getServ();

            if (jugador instanceof Libero) {
                Libero libero = (Libero) jugador;
                jugadorStr += "," + libero.getRecib();
            } else if (jugador instanceof Pasador) {
                Pasador pasador = (Pasador) jugador;
                jugadorStr += "," + pasador.getPases() + "," + pasador.getFintas();
            } else if (jugador instanceof Auxiliar) {
                // Agregar atributos específicos de Auxiliar
            } 

            writer.println(jugadorStr);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    sc.close();
    break;
                default:
                System.out.println("Opción no válida");
                break;


            }
        }


    }
    



                        

















    public static void menu(){
        System.out.println("BIENVENIDO");
        System.out.println("====================");
        System.out.println("1.Registrar jugador ");
        System.out.println("2.Mostrar jugadores  ");
        System.out.println("3.Top 3 Liberos");
        System.out.println("4.Pasadores más efectivos");
        System.out.println("5.Salir");
        System.out.println("====================");

    }   
}







    


