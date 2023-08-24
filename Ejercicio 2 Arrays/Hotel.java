/**
 * Clase principal que simula la gestión de habitaciones en un hotel 
 * Desarrollado por: Andres Mazariegos
 * Fecha de desarrollo: 23/08/2023
 * Versión: 1
 */
import java.util.Scanner;
public class Hotel {
    public static void main(String[] args){
        //Inicializamos las variables necesarias 
        Scanner scanner = new Scanner(System.in);
        boolean seguir= true;
        Cliente cliente= new Cliente();
        Habitacion Estandar= new Habitacion();
        Habitacion Deluxe= new Habitacion();
        Habitacion Suite= new Habitacion();
        //Array para ver disponibilidad de habitaciones true= si esta disponible 
        Boolean[] disponibilidad= {true,true,true};
        //Array para la lista de espera 
        Cliente[] espera= new Cliente[3];
        //Setteamos el espacio y el precio de cada habitacion
        Estandar.setEspacio(2);
        Estandar.setPrecio(25);
        Deluxe.setEspacio(5);
        Deluxe.setPrecio(50);
        Suite.setEspacio(7);
        Suite.setPrecio(100);
        //Ciclo principal del programa

        while(seguir){
            //menu para que el usuario elija que quiere hacer

            System.out.println("Bienvenido elija una opcion");
            System.out.println("1.Ingresar datos");
            System.out.println("2.Reservar habitacion");
            System.out.println("3.Sacar cliente de lista de espera");
            System.out.println("4.Check out");
            System.out.println("5.Salir del menu");
            int choice= scanner.nextInt();
            //Todo lo que pasa al elegir ingresar datos 
            if (choice==1){
                System.out.println("Ingrese su nombre");
                String nombre= scanner.next();
                System.out.println("Ingrese el numero de personas que viene con usted ( sin incluirse)");
                int acompañantes= scanner.nextInt();
                System.out.println("¿Contando esta vez, cuantas veces nos ha visitado anteriormente?");
                int visitas = scanner.nextInt();
                cliente.setDatos( nombre,  visitas, acompañantes);
                

            }
            //Todo lo que pasa al elegir reservar 
            else if (choice==2){
                System.out.println("En que habitacion desea hacer su reserva");
                System.out.println("1.Habitacion Estandar");
                System.out.println("2.Habitacion Deluxe");
                System.out.println("3.Habitacion Suite ");
                int hab= scanner.nextInt();
                if(hab==1){
                    //Validamos que el numero de huespedes no sea mayor al espacio de la habitacion 
                    if(Estandar.getEspacio()< cliente.getAcompañantes()){
                        System.out.println("Lo sentimos la habitacion estandar solo tiene espacio para dos huespedes( puedes reservar una con más capacidad)");
                    }
                    //Verificamos que la habitacion es disponible 
                    else if (disponibilidad[0]==false){
                        System.out.println("Lo sentimos esta habitacion no esta disponible en este momento, te colocaremos en lista de espera ");
                        //Si no esta disponible se pone al cliente en lista de espera
                        //Verificamos que la lista de espera no este llena
                        if (espera[0]!= null && espera[1]!= null && espera[2] != null ){
                            System.out.println("Lo sentimos la lista de espera esta llena ");

                        }
                        //Si no esta llena, se pone al cliente en el espacio que este libre 
                        if(espera[0]== null){
                            espera[0]= cliente;
                            System.out.println("Has sido asignado a la lista de espera " + espera[0].getNombre());
                        }
                        else if (espera[1]== null){
                            espera[1]= cliente;
                            System.out.println("Has sido asignado a la lista de espera " + espera[1].getNombre());

                        }
                        else if (espera[2]== null){
                            espera[2]= cliente;
                            System.out.println("Has sido asignado a la lista de espera " + espera[2].getNombre());
                        }

                            
                        
                        


                        
                    }else{
                        System.out.println(cliente.getNombre() + " has reservado una habitacion estandar para " + cliente.getAcompañantes() + " personas");
                        System.out.println("Tu total será "+ cliente.getAcompañantes()* Estandar.getPrecio() + " por noche" );
                        disponibilidad[0]=false;
                    }
                    

                }
                //lo mismo pero con la habitacion deluxe
                else if(hab==2){
                    if(Deluxe.getEspacio()< cliente.getAcompañantes()){
                        System.out.println("Lo sentimos la habitacion estandar solo tiene espacio para 5 huespedes (puedes reservar una con mas capacidad)");

                    }
                    else if (disponibilidad[1]==false){
                        System.out.println("Lo sentimos esta habitacion no esta disponible en este momento, te colocaremos en lista de espera ");
                        if (espera[0]!= null && espera[1]!= null && espera[2] != null ){
                            System.out.println("Lo sentimos la lista de espera esta llena ");

                        }
                        if(espera[0]== null){
                            espera[0]= cliente;
                            System.out.println("Has sido asignado a la lista de espera " + espera[0].getNombre());
                        }
                        else if (espera[1]== null){
                            espera[1]= cliente;
                            System.out.println("Has sido asignado a la lista de espera " + espera[1].getNombre());

                        }
                        else if (espera[2]== null){
                            espera[2]= cliente;
                            System.out.println("Has sido asignado a la lista de espera " + espera[2].getNombre());
                        }


                    }
                    else if(cliente.getVisitas()< 5){
                        System.out.println("Lo sentimos necesitas ser un cliente frecuente para reservar una habitacion Deluxe");

                    }else{
                        System.out.println(cliente.getNombre() + " has reservado una habitacion Deluxe para " + cliente.getAcompañantes() + " personas");
                        System.out.println("Tu total será "+ cliente.getAcompañantes()* Deluxe.getPrecio() + " por noche" );
                        disponibilidad[1]=false;


                    }
                     
                }
                //lo mismo pero con la Suite
                else if(hab==3){
                    if(Suite.getEspacio()< cliente.getAcompañantes()){
                        System.out.println("Lo sentimos la habitacion estandar solo tiene espacio para 7 huespedes (puedes reservar una con mas capacidad)");
                    }
                    else if (disponibilidad[2]== false){
                        System.out.println("Lo sentimos esta habitacion no esta disponible en este momento, te colocaremos en lista de espera ");
                        if (espera[0]!= null && espera[1]!= null && espera[2] != null ){
                            System.out.println("Lo sentimos la lista de espera esta llena ");

                        }
                        if(espera[0]== null){
                            espera[0]= cliente;
                            System.out.println("Has sido asignado a la lista de espera " + espera[0].getNombre());
                        }
                        else if (espera[1]== null){
                            espera[1]= cliente;
                            System.out.println("Has sido asignado a la lista de espera " + espera[1].getNombre());

                        }
                        else if (espera[2]== null){
                            espera[2]= cliente;
                            System.out.println("Has sido asignado a la lista de espera " + espera[2].getNombre());
                        }


                    }
                    else if(cliente.getVisitas()<10){
                        System.out.println("Lo sentimos se necesita ser un cliente VIP para reservar una Suite");


                    }else{
                        System.out.println(cliente.getNombre() + " has reservado una habitacion Deluxe para " + cliente.getAcompañantes() + " personas");
                        System.out.println("Tu total será "+ cliente.getAcompañantes()* Suite.getPrecio() + " por noche" );
                        disponibilidad[2]=false;


                        
                    }
                }

            }
            //Todo lo que pasa cuando elegimos sacar un cliente de la lista 
            else if(choice==3){
                //Ingresamos el nombre del cliente que queremos sacar 
                System.out.println("ingrese el nombre del cliente al que quiere sacar de la lista ");
                String sacar=scanner.next();
                //Chequeamos que la lista no este vacia 
                if(espera[0]== null && espera[1]== null && espera[2]== null){
                    System.out.println("No se puede sacar al cliente de la lista de espera porque la lista de espera esta vacia ");

                }
                //Buscamos en que posicion se encuentra el cliente 
                else if(sacar == espera[0].getNombre() || espera[0] == null ||espera[1]== null || espera[2]== null){
                    System.out.println("¿Que habitacion se reservara?");
                    System.out.println("1. Estandar");
                    System.out.println("2.Deluxe");
                    System.out.println("3. Suite");
                    int new_r= scanner.nextInt();
                    if (new_r == 1){
                        //Hacemos las validaciones correspondientes 
                        if(espera[0].getAcompañantes()< Estandar.getEspacio() || espera[0].getAcompañantes() > 2 || disponibilidad[0]== false){
                            System.out.println("No se puede sacar a este cliente de la lista de espera");
                            System.out.println("Puede ser porque esta habitacion no esta disponible o el numero de acompañantes es mayor a la capacidad de la habitacion");
                        }
                        //asignamos al cliente, cambiamos la disponiblidad y dejamos el espacio en donde el cliente estaba en la lista de espera vacío.
                        else{
                            System.out.println(espera[0].getNombre() + " ha reservado la habitacion Estandar por un precio de  " + espera[0].getAcompañantes()*Estandar.getPrecio() + " por noche " );
                            disponibilidad[0]=false;
                            espera [0] = null;
                        }
                    }
                    //lo mismo
                    else if(new_r==2){
                        if(espera[0].getAcompañantes()< Deluxe.getEspacio() || espera[0].getAcompañantes() > 5 || espera[0].getVisitas() < 5 || disponibilidad[0]==false){
                            System.out.println("No se puede sacar a este cliente de la lista de espera");
                            System.out.println("Puede ser porque esta habitacion no esta disponible, el numero de acompañantes es mayor a la capacidad de la habitacion o porque no es un cliente frecuente");
                        }
                        else{
                            System.out.println(espera[0].getNombre() + " ha reservado la habitacion Estandar por un precio de  " + espera[0].getAcompañantes()*Estandar.getPrecio() + " por noche " );
                            disponibilidad[0]=false;
                            espera[0]=null;
                        }
                    }else{
                        if(espera[0].getAcompañantes()< Suite.getEspacio() || espera[0].getAcompañantes() > 2 || espera[0].getVisitas()<10 || disponibilidad[0]== false ){
                            System.out.println("No se puede sacar a este cliente de la lista de espera");
                            System.out.println("Puede ser porque esta habitacion no esta disponible, el numero de acompañantes es mayor a la capacidad de la habitacion o no es un cliente VIP");
                        }
                        else{
                            System.out.println(espera[0].getNombre() + " ha reservado la habitacion Estandar por un precio de  " + espera[0].getAcompañantes()*Estandar.getPrecio() + " por noche " );
                            disponibilidad[0]=false;
                            espera[0]= null;
                        }
                    }
                    
                }
                else if(sacar== espera[1].getNombre()|| espera[0] == null ||espera[1]== null || espera[2]== null){
                    System.out.println("¿Que habitacion se reservara?");
                    System.out.println("1. Estandar");
                    System.out.println("2.Deluxe");
                    System.out.println("3. Suite");
                    int new_r= scanner.nextInt();

                    if (new_r == 1){
                        if(espera[1].getAcompañantes()< Estandar.getEspacio() || espera[1].getAcompañantes() >  5|| disponibilidad[1]== false){
                            System.out.println("No se puede sacar a este cliente de la lista de espera");
                            System.out.println("Puede ser porque esta habitacion no esta disponible o el numero de acompañantes es mayor a la capacidad de la habitacion");
                        }
                        else{
                            System.out.println(espera[1].getNombre() + " ha reservado la habitacion Estandar por un precio de  " + espera[1].getAcompañantes()*Estandar.getPrecio() + " por noche " );
                            disponibilidad[1]=false;
                            espera[1]= null;
                        }
                    }
                    else if(new_r==2){
                        if(espera[1].getAcompañantes()< Deluxe.getEspacio() || espera[1].getAcompañantes() > 5 || espera[1].getVisitas() < 5 || disponibilidad[1]==false){
                            System.out.println("No se puede sacar a este cliente de la lista de espera");
                            System.out.println("Puede ser porque esta habitacion no esta disponible, el numero de acompañantes es mayor a la capacidad de la habitacion o porque no es un cliente frecuente");
                        }
                        else{
                            System.out.println(espera[1].getNombre() + " ha reservado la habitacion Estandar por un precio de  " + espera[1].getAcompañantes()*Deluxe.getPrecio() + " por noche " );
                            disponibilidad[1]=false;
                            espera[1]= null;
                        }
                    }else{
                        if(espera[1].getAcompañantes()< Suite.getEspacio() || espera[1].getAcompañantes() > 2 || espera[1].getVisitas()<10 || disponibilidad[1]== false ){
                            System.out.println("No se puede sacar a este cliente de la lista de espera");
                            System.out.println("Puede ser porque esta habitacion no esta disponible, el numero de acompañantes es mayor a la capacidad de la habitacion o no es un cliente VIP");
                        }
                        else{
                            System.out.println(espera[1].getNombre() + " ha reservado la habitacion Deluxe por un precio de  " + espera[1].getAcompañantes()*Suite.getPrecio() + " por noche " );
                            disponibilidad[1]=false;
                            espera[1]= null;
                        }
                    }

                    

                }
                else if( sacar== espera[2].getNombre() || espera[0] == null ||espera[1]== null || espera[2]== null){
                    System.out.println("¿Que habitacion se reservara?");
                    System.out.println("1. Estandar");
                    System.out.println("2.Deluxe");
                    System.out.println("3. Suite");
                    int new_r= scanner.nextInt();

                    if (new_r == 1){
                        if(espera[2].getAcompañantes()< Estandar.getEspacio() || espera[2].getAcompañantes() > 2 || disponibilidad[2]== false){
                            System.out.println("No se puede sacar a este cliente de la lista de espera");
                            System.out.println("Puede ser porque esta habitacion no esta disponible o el numero de acompañantes es mayor a la capacidad de la habitacion");
                        }
                        else{
                            System.out.println(espera[2].getNombre() + " ha reservado la habitacion Estandar por un precio de  " + espera[2].getAcompañantes()*Estandar.getPrecio() + " por noche " );
                            disponibilidad[2]=false;
                            espera[2]= null;
                        }
                    }
                    else if(new_r==2){
                        if(espera[2].getAcompañantes()< Deluxe.getEspacio() || espera[2].getAcompañantes() > 5 || espera[2].getVisitas() < 5 || disponibilidad[2]==false){
                            System.out.println("No se puede sacar a este cliente de la lista de espera");
                            System.out.println("Puede ser porque esta habitacion no esta disponible, el numero de acompañantes es mayor a la capacidad de la habitacion o porque no es un cliente frecuente");
                        }
                        else{
                            System.out.println(espera[2].getNombre() + " ha reservado la habitacion Estandar por un precio de  " + espera[2].getAcompañantes()*Deluxe.getPrecio() + " por noche " );
                            disponibilidad[2]=false;
                            espera[2]= null;
                        }
                    }else{
                        if(espera[2].getAcompañantes()< Suite.getEspacio() || espera[2].getAcompañantes() > 2 || espera[1].getVisitas()<10 || disponibilidad[2]== false ){
                            System.out.println("No se puede sacar a este cliente de la lista de espera");
                            System.out.println("Puede ser porque esta habitacion no esta disponible, el numero de acompañantes es mayor a la capacidad de la habitacion o no es un cliente VIP");
                        }
                        else{
                            System.out.println(espera[2].getNombre() + " ha reservado la habitacion Deluxe por un precio de  " + espera[2].getAcompañantes()*Suite.getPrecio() + " por noche " );
                            disponibilidad[2]=false;
                            espera[2]= null;
                        }
                    }

                }else{
                    System.out.println("Este cliente no esta en la lista de espera");
                }
                

            }
            //Lo que pasa al hacer el check out
            else if(choice ==4){
                //Preguntamos al cliente en que habitación se hospedo
                System.out.println("Para realizar el check out, elige en que habitacion te quedaste");
                System.out.println("1.Estandar");
                System.out.println("2.Deluxe");
                System.out.println("3.Suite");
                int check_out= scanner.nextInt();
                //cambiamos la disponiblidad a true 
                if(check_out==1){
                    System.out.println("Gracias por preferirnos, feliz viaje");
                    disponibilidad[0]= true;
                }
                else if(check_out==2){
                    System.out.println("Gracias por preferirnos, feliz viaje");
                    disponibilidad[1]= true;
                    
                }
                else{
                    System.out.println("Gracias por preferirnos, feliz viaje");
                    disponibilidad[2]= true;
                }
                
            }
            //rompemos el ciclo 
            else if (choice == 5){
                System.out.println("Hasta la proxima");
                seguir=false;
            }
        }
        
    }
}
