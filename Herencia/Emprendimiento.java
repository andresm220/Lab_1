
import java.util.*;



import java.io.*;
/*Andrés Alberto Mazariegos Escobar 
 * 21749
 * Laboratorio 3: Herencia
 * Docente: Erick Marroquín 
 */

public class Emprendimiento {
    public static void main(String [] args){
        ArrayList<Producto> productos= new ArrayList<Producto>();
        boolean seguir=true;
        Scanner sc= new Scanner(System.in);
        //Contadores
        double contador=0;
        double comision=0;
        int snac=0;
        int bebi=0;
        int gomi=0;
        //Sirve para validar 
        boolean encontrado=false;
      //Leemos el csv 
        try (BufferedReader reader = new BufferedReader(new FileReader("Inventario.csv"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {

            String[] datos = linea.split(",");
            int id = Integer.parseInt(datos[0]);
            String tipo_de_producto = datos[6];
            String nombre = datos[1];
            int cantidadDisp = Integer.parseInt(datos[2]);
            int cantidadVen = Integer.parseInt(datos[3]);
            double precio = Double.parseDouble(datos[5]);
            String estado= datos[4];

            Producto producto = null;
//identificamos los tipos de producto que hay en el csv 
            switch (tipo_de_producto) {
                case "Bebida":
                    int ml= Integer.parseInt(datos[7]);
                    String tipo=datos[8];
                    //creamos un producto para añadir al arraylist
                    producto  = new Bebida(id, nombre, cantidadDisp, cantidadVen, estado, precio,ml,tipo);
                    productos.add(producto);
                    break;
                case "Snack":
                    int gr = Integer.parseInt(datos[7]);
                    String sabor  = datos[8];
                    String tamaño = datos[9];
                
                    producto = new Snack(id, nombre, cantidadDisp, cantidadVen, estado, precio,gr,sabor,tamaño);
                    productos.add(producto);
                    break;
                case "Gomitas":
                    String saborg  = datos[7];
                  
                    producto = new Gomitas(id, nombre, cantidadDisp, cantidadVen, estado, precio,saborg);
                    productos.add(producto);
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de jugador desconocido: " + tipo_de_producto);
            }

        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    //Ciclo principal del programa 
        while(seguir){
            menu();
            String choice=sc.next();
            switch(choice){
                //Lo que pasa si el usuario elige la opcion 1 
                case "1":
                System.out.println();
                System.out.println("Ingrese el ID del producto que quiere buscar");
                int id= sc.nextInt();
                for(Producto producto:productos){
                    //Por cada producto en el arraylist identificamos instancia de que clase es 
                    if(producto.getId()==id){
                       if(producto instanceof Bebida){
                        //Si es una bebida creamos un objeto bebida y obtenemos todos sus atributos 
                            Bebida bebida = (Bebida) producto;
                         System.out.println(" Bebida encontrado: " + bebida.getNombre() + "| tipo de bebida: "  + bebida.getTipo() + "| cantidad disponible : " + bebida.getDisp() + " | estado: " + bebida.getEstado() + " | mililitros: " + bebida.getML() + " | precio c/u " + bebida.getPrecio()  );
                         encontrado=true;
                       }
                       else if (producto instanceof Snack){
                        //Si es un snack creamos un snack y llamamos todos sus atributos 
                        Snack snack = (Snack) producto;
                        System.out.println(" Snack encontrado: " + snack.getNombre() + "| sabor: "  + snack.getSabor() + "| cantidad disponible :  " + snack.getDisp() + " |estado:  " + snack.getEstado() + " | gramos: " + snack.getGR() +  " | tamaño " + snack.getTamaño() +" | precio c/u " + snack.getPrecio()  );
                        encontrado=true;

                       }
                       //Si son gomitas creaamos unas gomitas y llamamos todos sus atributos 
                       else if (producto instanceof Gomitas){
                        Gomitas gomitas= (Gomitas) producto;
                        System.out.println(" Gomitas encontradas: " + gomitas.getNombre() + "| sabor: "  + gomitas.getSabor() + "| cantidad disponible : " + gomitas.getDisp() + "| estado: " + gomitas.getEstado()  +" | precio c/u " + gomitas.getPrecio()  );
                        encontrado=true;
                       }
                    
                }
            }
            if(encontrado==false){
                System.out.println();
                System.out.println("No se encontro un producto con el ID ingresado");
            }

                break;
                //Lo que pasa si el usuario elige la opcion 2 
                case "2":
                System.out.println("CATEGORIA SNACK ");
                //Por cada producto verificamos si es instancia de Snack e imprimimos su nombre 
                for( Producto producto: productos){
                    if(producto instanceof Snack){
                       System.out.println("-" + producto.getNombre());
                }
            }
                System.out.println("===============");
                System.out.println();
                System.out.println("CATEGORIA BEBIDA");
                //Lo mismo pero con Bebida 
                for( Producto producto: productos){
                    if(producto instanceof Bebida){
                       System.out.println(" -"  +producto.getNombre());
                }
            }
                System.out.println("===============");
                System.out.println("CATEGORIA GOMITAS");
                //Lo mismo pero con las gomitas 
                for( Producto producto: productos){
                    if(producto instanceof Gomitas){
                       System.out.println(" -"  +producto.getNombre());
                }
            }




                break;
                case"3":
                //lo que pasa si eligen la opcion 3 
                System.out.println();
                //Por cada producto, multiplicamos la cantidad de vendidos por el precio y vamos sumando el resultado a un contador que se inicializa en 0 
                
                for(Producto producto:productos){
                    double result= (producto.getVen()* producto.getPrecio());
                    contador+= result;
                     

                }
                //Hacemos que el resultado solo tenga 2 decimales 
                String totalFormateado = String.format("%.2f", contador);
                System.out.println("Total de ventas: " + totalFormateado + " dolares ");
                break;
                //Lo mismo que en el codigo de arriba pero solo para la clase gomitas 
                case"4":
                
                for(Producto  producto : productos){
                    if(producto instanceof Gomitas){
                        double resultado= (producto.getVen() * producto.getPrecio());
                        comision=+ resultado;
                    }

                }
                //Le sacamos el 20% al resultado y hacemos que solo tenga dos decimales 
                String comisionFormateada = String.format("%.2f", comision * 0.2);
                System.out.println("Comision correspondiente por categoria nueva: " + comisionFormateada + " dolares ");
                break;
                //Recorremos el ArrayList y por cada Snack sumamos 1 a un contador, por cada Bebida lo mismo en otro contador y por cada Gomita lo mismo 
                case"5":
                for(Producto producto : productos){
                    if(producto instanceof Snack){
                        snac++;
                    }else if(producto instanceof Bebida){
                        bebi++;
                    }else{
                        gomi++;
                    }
                

                }
                //Imprimimos 
                System.out.println("1.Snacks: " + snac);
                System.out.println("2.Bebidas: " + bebi);
                System.out.println("3.Gomitas: " + gomi);
                
                
                break;
                //Lo que pasa si se elige la opcion 6 
                case"6":
                System.out.println("Hasta la proxima");
                seguir=false;
                sc.close();
                break;
                default:
                System.out.println("Opcion inválida, intente de nuevo");
                break;
            }


         }

       
    }







//Metodo para el menu 
     public static void menu(){
            System.out.println("BIENVENIDO");
            System.out.println("====================");
            System.out.println("1.Buscar producto por id ");
            System.out.println("2.Lista de producto de una categoria  ");
            System.out.println("3.Ventas actuales de la tienda ");
            System.out.println("4.Porcentaje de comision ");
            System.out.println("5.Cantidad de productos por categoria ");
            System.out.println("6.Salir");
            System.out.println("====================");
    
        }  
    
}
