import java.util.*;
public class Driver {
    /*Modelacion con herencia
     * Andres Mazariegos 
     * 21749
     * Docente: Erick Marroquin
     * Programación Orientada a Objetos
     */
    
/**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este programa).
     */

    public static void main(String [] args){
        boolean seguir= true;
        ArrayList<Portero> porteros= new ArrayList<Portero>(); //lista de porteros
        ArrayList<Extremo> extremos= new ArrayList<Extremo>();//lista de extremos
        ArrayList<Integer> ordenar= new ArrayList<Integer>(); //lista donde se guarda la efectividad de los porteros 
       
        Portero[] arrayP = new Portero [2];//Array para guardar las 3 efectividades mas altas 
        Scanner sc= new Scanner(System.in);

        while(seguir){
            //Menu principal
            System.out.println("REGISTRO DE JUGADORES");
            System.out.println("-----------------");
            System.out.println("1.Registrar un jugador");
            System.out.println("2.Ver jugadores");
            System.out.println("3.Top 3 porteros");
            System.out.println("4.Cantidad de extremos más efectivos");
            System.out.println("5.Salir");

            String choice = sc.next();

            switch(choice){
                case "1":
                    System.out.println("¿Qué tipo de jugador va a registrar?");
                    System.out.println("1.Extremo");
                    System.out.println("2.Portero");
                    String tipo = sc.next();

                    switch(tipo){
                        //Se piden datos al usuario y se usa un try catch para tener errores amigables con el usuario
                        case "1":
                        try {
                            System.out.println("Ingrese el nombre");
                            String nombre_e = sc.next();
                            System.out.println("Ingrese el pais de origen");
                            String pais_e = sc.next();
                            System.out.println("Ingrese las faltas que cometió");
                            int faltas_e = Integer.parseInt(sc.next());
                            System.out.println("Ingrese los goles que anoto");
                            int goles_e = Integer.parseInt(sc.next());
                            System.out.println("Ingrese los lanzamientos que hizo");
                            int lanz_e = Integer.parseInt(sc.next());
                            System.out.println("Ingrese los pases que dio");
                            int pases_e = Integer.parseInt(sc.next());
                            System.out.println("Ingrese las asistencias que dio");
                            int asis_e = Integer.parseInt(sc.next());
                            //una vez se tienen los datos se crea el objeto y se añade a la lista que le corresponde
                            
                            Extremo extremo = new Extremo(nombre_e, pais_e, faltas_e, goles_e, lanz_e, pases_e, asis_e);
                            extremos.add(extremo);
                            //setteamos la efectividad 
                            extremo.setEfectividad_e();


                        } catch (InputMismatchException e) {
                            System.out.println("Error: Entrada inválida. Debe ingresar un número entero.");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: No se ha ingresado un número entero.");
                        } catch (ArithmeticException e) {
                            System.out.println("Error: División por cero.");
                        }

                        
                        
                        
                        
                        break;
                        case "2":
                        //Mismo funcionamiento que el codigo de arriba pero para el portero en vez de para el extremo 
                        try {
                            System.out.println("Ingrese el nombre");
                            String nombre_p = sc.next();
                            System.out.println("Ingrese el pais de origen");
                            String pais_p = sc.next();
                            System.out.println("Ingrese las faltas que cometió");
                            int faltas_p = Integer.parseInt(sc.next());
                            System.out.println("Ingrese los goles que anoto");
                            int goles_p = Integer.parseInt(sc.next());
                            System.out.println("Ingrese los lanzamientos que hizo");
                            int lanz_p = Integer.parseInt(sc.next());
                            System.out.println("Ingrese los goles que recibio ");
                            int goles_recib= Integer.parseInt(sc.next());
                            System.out.println("Ingrese las paradas que hizo ");
                            int paradas  = Integer.parseInt(sc.next());
                        
                            Portero portero = new Portero(nombre_p, pais_p, faltas_p, goles_p, lanz_p, goles_recib, paradas);
                            porteros.add(portero);
                        
                            portero.setEfectividad();
                        
                           
                        } catch (InputMismatchException e) {
                            System.out.println("Error: Entrada inválida. Debe ingresar un número entero.");
                        } catch (NumberFormatException e) {
                            System.out.println("Error: No se ha ingresado un número entero.");
                        } catch (ArithmeticException e) {
                            System.out.println("Error: División por cero.");
                        }
                        break;
                        default: 
                        System.out.println("Ingrese un numero entre 1 y 2 ");
                        break;
                    }
                    break;

                case "2":

                System.out.println("EXTREMOS");
                //Validamos que haya extremos registrados
                if(extremos.isEmpty()){
                    System.out.println("No hay extremos registrados aun");
                 

                }else{
                    //Si si hay imprimimos todos los datos de cada extremo con un for each
                    for(Extremo extremo : extremos){
                        System.out.println(" | Nombre: " + extremo.getNombre() + " | Pais de Origen: " + extremo.getPais() + " | Faltas Cometidas:  " + extremo.getFaltas() + " | Goles Anotados: " + extremo.getGoles() +  " | Lanzamientos Realizados: " + extremo.getLanz() +  " | Pases: " + extremo.getPases() + " |Asistencias: " + extremo.getAsis() + " |Efectividad: "+ extremo.getEfectividad_E() + "%");


                }
                }
                //Igual que el codigo para el extremo 
                if(porteros.isEmpty()){
                    System.out.println("No hay porteros registrados aun");
                }else{
                    System.out.println("PORTEROS");
                    for(Portero portero : porteros){
                    System.out.println(" | Nombre: " + portero.getNombre() + " | Pais de Origen: " + portero.getPais() + " | Faltas Cometidas:  " + portero.getFaltas() + " | Goles Anotados: " + portero.getGoles() +  " | Lanzamientos Realizados: " + portero.getLanz() +  " | Goles Recibidos: " + portero.getGolesRecib() + " | Paradas: " + portero.getParadas() + " |Efectividad: "+ portero.getEfectividad() + "%");


                }

                }
                
                


                



                    break;

                case "3":
                //Validamos de nuevgo 
                if (porteros.isEmpty()) {
                    System.out.println("No hay porteros registrados aún");
                } else {
                    // a cada portero se le saca la efectividad y se añade ese numero a ordenar 
                    for (Portero portero : porteros) {
                        ordenar.add(portero.getEfectividad());
                    }

                //usamos math min para chequear el tamaño de ordenar 
                    int cantidadElementos = Math.min(ordenar.size(), 3);
                //for para que si un valor de efectividad coincide con las 3 efectividades mas altas se añada a arrayP 
                    for (int i = 0; i < cantidadElementos; i++) {
                        int efectividad = ordenar.get(i);
                
                        for (Portero portero : porteros) {
                            if (portero.getEfectividad() == efectividad) {
                                arrayP[i] = portero;
                                break;
                            }
                        }
                    }
                //Validacion e impresion en consola de los datos requeridos 
                    for (int i = 0; i < cantidadElementos; i++) {
                        if (arrayP[i] != null) {
                            System.out.println("==================");
                            System.out.println(" | Nombre: " + arrayP[i].getNombre() + " | Pais: " + arrayP[i].getPais() + " | Efectividad: " + arrayP[i].getEfectividad() + "%");
                        }
                    }
                }


                    break;

                case "4":
                //Validamos que el artraylist no este vacio 
                
                if (extremos.isEmpty()) {
                    System.out.println("No hay extremos registrados aún");
                } else {
                    //si no esta vacio por cada efectividad que de un extremo mayor a 85% se le suma uno al contador 
                    int contador = 0;
            
                    for (Extremo extremo : extremos) {
                        if (extremo.getEfectividad_E() > 85) {
                            contador++;
                        }
                    }
            //Imprimimos 
                    System.out.println("La cantidad de extremos con más de un 85% de efectividad es " + contador);
                }
                break;

       
    
                    
                case "5":
                    seguir = false; // Termina el programa
                    System.out.println("Gracias por usar nuestro programa");
                    sc.close();
                    break;
//default por si el usuarion no selecciona una opcion valida 
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}