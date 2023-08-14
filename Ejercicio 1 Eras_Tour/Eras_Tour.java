
import java.util.Scanner;
import java.util.Random;
/**
 * Clase principal que simula la gestión de venta de boletos para un evento.
 * Desarrollado por: Andres Mazariegos
 * Fecha de desarrollo: 13/08/2023
 * Versión: 2
 */
public class Eras_Tour {
    public static void main(String[] args){
        Random random;
        Boolean seguir= true;
        Scanner scanner= new Scanner(System.in);
        Localidad choice,localidad1,localidad2,localidad3;
        localidad1= new Localidad();
        localidad2= new Localidad();
        localidad3= new Localidad();
        Comprador comprador;
        comprador= new Comprador();
        random= new Random();
       
        Ticket ticket;
        ticket= new Ticket();
//Ciclo principal del programa
        while(seguir==true){
            //menu
            System.out.println("Bienvenido a la venta de entradas para el Eras Tour, elige lo que quieres hacer:");
            System.out.println("1. Ingresar mis datos");
            System.out.println("2. Solicitud de boletos(debes ingresar tus datos primero)");
            System.out.println("3. Consultar disponibilidad total");
            System.out.println("4. Consultar disponibilidad individual");
            System.out.println("5. Reporte de caja");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            //Ingresar datos 
            if (opcion==1){
                comprador= new Comprador();
                System.out.println("Ingresa tu nombre: ");
                String nombre= scanner.next();
                System.out.println(" Ingresa tu email:  ");
                String email= scanner.next();
                System.out.println("Ingresa la cantidad de boletos que compraras: ");
                int boletos= scanner.nextInt();
                System.out.println("Ingresa tu presupuesto: ");
                int dinero = scanner.nextInt();
                comprador.setDatos(nombre,email,boletos,dinero);
                seguir=true;            
            }
            //Consultar disponibilidad total 
            else if(opcion==3){
                int ventas1= (20-localidad1.getEspacio());
                int ventas2=(20-localidad2.getEspacio());
                int ventas3=(20-localidad3.getEspacio());
                System.out.println("Boletos vendidos Localidad 1 " + ventas1 + " Espacios disponible " + localidad1.getEspacio());
                System.out.println("Boletos vendidos Localidad 2 " + ventas2 + " Espacios disponible " + localidad2.getEspacio());
                System.out.println("Boletos vendidos Localidad 3 " + ventas3 + " Espacios disponible  " + localidad3.getEspacio());

            }
            //Consultar disponibilidad individual
            else if(opcion==4){
                System.out.println("Elige ver la disponibilidad de una localidad en especifico (ingresa el numero de la que quieres ver)");
                int eleccion= scanner.nextInt();
                if(eleccion==1){
                  System.out.println(" Localidad 1 " +  " Espacios disponible " + localidad1.getEspacio());  
                }
                else if(eleccion==2){
                    System.out.println(" Localidad 2 " +  " Espacios disponible " + localidad2.getEspacio());  
                }else{
                    System.out.println(" Localidad 3 " +  " Espacios  disponible " + localidad3.getEspacio());  
                }
                
            }
            //Ver la caja 
            else if(opcion==5){
                int subtotal1= ((20-localidad1.getEspacio())*100);
                int subtotal2=((20-localidad2.getEspacio())*500);
                int subtotal3=((20-localidad3.getEspacio())*1000);
                System.out.println("Ventas Localidad 1= " + subtotal1);
                System.out.println("Ventas Localidad 2=  " + subtotal2);
                System.out.println("Ventas Localidad 3=  " + subtotal3);
                System.out.println("Ventas Totales=  " + (subtotal1+ subtotal2+ subtotal2));
            }
            //Salir
            else if(opcion== 6){
                System.out.println("¡Hasta la próxima!");

                seguir=false;
            }
            //Todo el proceso para obtener el boleto
            //Puse esto de ultimo porque es el mas largo y se me dificultaba con la sintaxis de los demas  
            else if(opcion==2){
                //obtenemos el numero de ticket
                ticket.setNumero();
                int numero=ticket.getNumero();
            
                //obtenemos el rango en el que el ticket debe estar para ser apto 
                ticket.setRango_inicial();
                ticket.setRango_final();
                int rango1=ticket.getRango_inicial();
                int rango2= ticket.getRango_final();
                System.out.println("Para ser apto debe estar entre " + rango1 + " y " + rango2);
                System.out.println("Tu ticket " + numero );
                int algo= random.nextInt(3-1+1)+1;
                //si si es apto pasa todo esto 
                if( rango1<rango2 ){
                 if (numero>=rango1 && numero<= rango2){;
                        if(algo==1){
                            localidad1.setPrecio(100);
                            System.out.println("Fuiste asignado a la Localidad 1 (100 dolares por boleto)");

                            if((localidad1.getEspacio()-comprador.getCantidad())<0){
                                System.out.println("No hay espacio suficiente para el numero de boletos que quieres solo se te venderan" + localidad1.getEspacio()); 
                                localidad1.setEspacio(localidad1.getEspacio());
                                System.out.println("Tu total es de " + localidad1.getEspacio()*100);
                                if((localidad1.getEspacio()*100)> comprador.getPresupuesto()){
                                    System.out.println("Lo sentimos el total excede tu presupuesto");

                                    

                                }else{
                                    System.out.println("Fuiste asignado a la Localidad 1 (500 dolares por boleto)");
                                    System.out.println("Tu total es de " + (comprador.getCantidad()*100));
                                    localidad1.setEspacio(comprador.getCantidad());
                                    localidad1.setSubtotal(comprador.getCantidad(),100);
                                }
                            }else{


                                if((comprador.getCantidad()*100)> comprador.getPresupuesto()){
                                    System.out.println("Fuiste asignado a la Localidad 1 (100 dolares por boleto)");
                                    System.out.println("Lo sentimos el total excede tu presupuesto, no podemos asignarte");

                                }else{
                                    System.out.println("Fuiste asignado a la Localidad 1 (100 dolares por boleto)");
                                    System.out.println("Tu total es de " + (comprador.getCantidad()*100));
                                    localidad1.setEspacio(comprador.getCantidad());
                                    localidad1.setSubtotal(comprador.getCantidad(),100);

                                }
                            }

                        }
                        //es todo lo mismo pero con diferente objeto 
                        else if(algo==2){
                            localidad2.setPrecio(500);
                            System.out.println("Fuiste asignado a la Localidad 2 (500 dolares por boleto)");

                            if((localidad2.getEspacio()-comprador.getCantidad())<0){
                                System.out.println("No hay espacio suficiente para el numero de boletos que quieres solo se te venderan" + localidad2.getEspacio()); 
                                localidad2.setEspacio(localidad2.getEspacio());
                                System.out.println("Tu total es de " + localidad2.getEspacio()*500);
                                if((localidad2.getEspacio()*500)> comprador.getPresupuesto()){
                                    System.out.println("Lo sentimos el total excede tu presupuesto");
  
                                }else{
                                    System.out.println("Fuiste asignado a la Localidad 2 (500 dolares por boleto)");
                                    System.out.println("Tu total es de " + (comprador.getCantidad()*500));
                                    localidad2.setEspacio(comprador.getCantidad());
                                    localidad2.setSubtotal(comprador.getCantidad(),500);



                                }
                            }
                            else{
                                if((comprador.getCantidad()*500)> comprador.getPresupuesto()){

                                    System.out.println("Fuiste asignado a la Localidad 2 (500 dolares por boleto)");
                                    System.out.println("Lo sentimos el total excede tu presupuesto, no podemos asignarte");


                                }else{
                                    System.out.println("Fuiste asignado a la Localidad 2 (500 dolares por boleto)");
                                    System.out.println("Tu total es de " + (comprador.getCantidad()*500));
                                    localidad2.setEspacio(comprador.getCantidad());
                                    localidad2.setSubtotal(comprador.getCantidad(),500);



                                }
                            }
                            
                        }
                        else if(algo==3){
                            localidad3.setPrecio(1000);
                            System.out.println("Fuiste asignado a la Localidad 3 (1000 dolares por boleto)");

                            if((localidad3.getEspacio()-comprador.getCantidad())<0){
                                System.out.println("No hay espacio suficiente para el numero de boletos que quieres solo se te venderan" + localidad3.getEspacio()); 
                                localidad3.setEspacio(localidad3.getEspacio());
                                System.out.println("Tu total es de " + localidad3.getEspacio()*1000);
                                if((localidad3.getEspacio()*1000)> comprador.getPresupuesto()){
                                    System.out.println("Lo sentimos el total excede tu presupuesto");

                                }else{
                                    System.out.println("Fuiste asignado a la Localidad 3 (1000 dolares por boleto)");
                                    System.out.println("Tu total es de " + (comprador.getCantidad()*1000));
                                    localidad3.setEspacio(comprador.getCantidad());
                                    localidad3.setSubtotal(comprador.getCantidad(),1000);


                                }
                            }else{
                                if((comprador.getCantidad()*1000)> comprador.getPresupuesto()){
                                    System.out.println("Fuiste asignado a la Localidad 3 (1000 dolares por boleto)");
                                    System.out.println("Lo sentimos el total excede tu presupuesto, no podemos asignarte");



                                }else{
                                    System.out.println("Fuiste asignado a la Localidad 3 (1000 dolares por boleto)");
                                    System.out.println("Tu total es de " + (comprador.getCantidad()*1000));
                                    localidad2.setEspacio(comprador.getCantidad());
                                    localidad2.setSubtotal(comprador.getCantidad(),1000);

                                }
                            }
                        }
                    }else{
                        System.out.println("Lo sentimos tu ticket no es apto");
                        seguir=false;
                    }
                }
            }
        }
    }
}
                


                    
                            