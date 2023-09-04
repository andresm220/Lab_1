import java.util.Scanner;


import java.util.ArrayList;


public class Programa {


    
    public static void printMenu(){
        System.out.println("Control de Notas UVG");
        System.out.println("======================");
        System.out.println("1. Registrar alumno ");
        System.out.println("");
        System.out.println("2. Ver analisis estadisticos ");
        System.out.println("");
        System.out.println("3. Salir");
    }
        



    
    public static void main(String[] args){
    boolean seguir= true;
    Scanner sc= new Scanner(System.in);
    ArrayList<Estudiante_> listaDeEstudiantes = new ArrayList<Estudiante_>();
    ArrayList<Materia> Sede_Central= new ArrayList<Materia>();
    ArrayList<Materia> Sede_Sur= new ArrayList<Materia>();
    ArrayList<Materia> Sede_Alti= new ArrayList<Materia>();
    //Nombre de las materias
    String materia1="Matematica";
    String materia2="Fisica";
    String materia3="Quimica";
    String materia4="Lenguaje";
    String materia5="Estadistica";


    
    
   
    



    while(seguir){
        Materia mate= new Materia();
        Materia lengua= new Materia();
        Materia quimica= new Materia();
        Materia fisica= new Materia();
        Materia estadistica= new Materia();

    
        
        Estudiante_ Estudiante= new Estudiante_();
        printMenu();
        String choice= sc.nextLine();
        switch(choice){
            case "1":
            //Preguntamos los datos del usuario
            System.out.println("Nombre del Estudiante: ");
            String nombre= sc.nextLine();
            System.out.println("Apellido del Estudiante: ");
            String apellido= sc.nextLine();
            System.out.println("Fecha de nacimiento del Estudiante: ");
            String fecha= sc.nextLine();
            System.out.println("Correo del Estudiante: ");
            String correo= sc.nextLine();
            System.out.println("¿A que campus pertenece el estudiante?(Sur, Central o Altiplano)");
            String sede= sc.nextLine();
            System.out.println("Carné  del Estudiante: ");
            String carne= sc.nextLine();
            Estudiante.setDatos(nombre, apellido, fecha, sede, correo, carne);
            listaDeEstudiantes.add(Estudiante);
            System.out.println("=========================");
            System.out.println("¿Cuantas pruebas realizó?");
            int numprueb= sc.nextInt();
            //Ciclo para que le pregunte al usuario el nombre de la materia y nota dependiendo de cuantos examenes haya realizado
            for(int i=0;i<numprueb;i++){
                System.out.println("Ingrese el nombre de la materia");
                String name= sc.next();
                System.out.println("Ingrese la nota que obtuvo");
                int grade= sc.nextInt();
                if(name.trim().equalsIgnoreCase("mate") ||  name.trim().equalsIgnoreCase("Matematica")){
                    mate.setNombre(materia1);
                    mate.setNota(grade);
                    if(sede.equalsIgnoreCase("Sur")){
                        Sede_Sur.add(mate);
                    }
                    else if(sede.equalsIgnoreCase("Central")){
                        Sede_Central.add(mate);
                    }else {
                        Sede_Alti.add(mate);
                    }
                }
                else if (name.trim().equalsIgnoreCase("quimica")|| name.trim().equalsIgnoreCase("Quimica")){
                    quimica.setNombre(materia3);
                    quimica.setNota(grade);
                    if(sede.equalsIgnoreCase("Sur")){
                        Sede_Sur.add(quimica);
                    }
                    else if(sede.equalsIgnoreCase("Central")){
                        Sede_Central.add(quimica);
                    }else {
                        Sede_Alti.add(quimica);
                    }
                }
                else if (name.trim().equalsIgnoreCase("fisica")|| name.trim().equalsIgnoreCase("Fisica")){
                    fisica.setNombre(materia2);
                    fisica.setNota(grade);
                    if(sede.equalsIgnoreCase("Sur")){
                        Sede_Sur.add(fisica);
                    }
                    else if(sede.equalsIgnoreCase("Central")){
                        Sede_Central.add(fisica);
                    }else {
                        Sede_Alti.add(fisica);
                    }

                }
                else if(name.trim().equalsIgnoreCase("lenguaje") || name.trim().equalsIgnoreCase("Lenguaje")){
                    lengua.setNombre(materia4);
                    lengua.setNota(grade);
                    if(sede.equalsIgnoreCase("Sur")){
                        Sede_Sur.add(lengua);
                    }
                    else if(sede.equalsIgnoreCase("Central")){
                        Sede_Central.add(lengua);
                    }else {
                        Sede_Alti.add(lengua);
                    }
                }
                else if (name.trim().equalsIgnoreCase("estadistica")|| name.trim().equalsIgnoreCase("Estadistica")){
                    estadistica.setNombre(materia5);
                    estadistica.setNota(grade);
                    if(sede.equalsIgnoreCase("Sur")){
                        Sede_Sur.add(estadistica);
                    }
                    else if(sede.equalsIgnoreCase("Central")){
                        Sede_Central.add(estadistica);
                    }else {
                        Sede_Alti.add(estadistica);
                    }
                }
            }
            break;
            case "2":
            // Media Matematica para la Sede sur 
            System.out.println("=========================");
            System.out.println("");
            System.out.println("----MATEMATICA SEDE SUR--- ");

            mate.calcularMediaSede(Sede_Sur,materia1);

           
            //Moda para matematicas sede sur 

            mate.calcularModaSede(Sede_Sur, materia1) ;
            //Mediana sede sur
            mate.calcularMediana(Sede_Sur,materia1);

            //Desviacion Estandar
            mate.calcularDesviacionEstandar(Sede_Sur, materia1,mate.calcularMediaSede(Sede_Sur,materia1));
            //Maximo y Minimo Sede Sur
            mate.calcularMaxyMin(Sede_Sur, materia1);
            System.out.println("");


            System.out.println("=====================");
            System.out.println("");
            System.out.println("----MATEMATICA SEDE CENTRAL---- ");
            // Media Sede Central 
            
            mate.calcularMediaSede(Sede_Central,materia1);
            //Moda sede central 
            mate.calcularModaSede(Sede_Central,materia1);
            //Mediana sede central
            mate.calcularMediana(Sede_Central,materia1);
            //Maximo y minimo sede central
            mate.calcularMaxyMin(Sede_Central, materia1);
            //Desviacion Estandar
            mate.calcularDesviacionEstandar(Sede_Central, materia1,mate.calcularMediaSede(Sede_Central,materia1));

            
            System.out.println("==========================");
            System.out.println("");
            System.out.println("----MATEMATICA SEDE ALTIPLANO---- ");

           
            //Media sede altiplano
            mate.calcularMediaSede(Sede_Alti,materia1);
            //Moda Sede Altiplano
            mate.calcularModaSede(Sede_Alti,materia1);
            //Mediana Sede Altiplano
            mate.calcularMediana(Sede_Alti,materia1);
            
            //Maximo y minimo
            mate.calcularMaxyMin(Sede_Alti,materia1);
            //Desviacion estandar 
            mate.calcularDesviacionEstandar(Sede_Alti, materia1,mate.calcularMediaSede(Sede_Alti,materia1));

            System.out.println("==========================");
            System.out.println("");

            System.out.println("----FISICA SEDE SUR---- ");
         
            //FISICA SEDE SUR 
            fisica.calcularMediaSede(Sede_Sur,materia2);
            //Moda fisica Sede sur
            fisica.calcularModaSede(Sede_Sur,materia2);
            //Mediana Sede Sur
            fisica.calcularMediana(Sede_Sur,materia2);
            
            //Maximo y minimo
            fisica.calcularMaxyMin(Sede_Sur,materia2);
            //Desviacion estandar
            fisica.calcularDesviacionEstandar(Sede_Sur, materia2, fisica.calcularMediaSede(Sede_Sur,materia2));

            System.out.println("==========================");
            System.out.println("");

            System.out.println("----FISICA SEDE CENTRAL---- ");

            //Media Sede Central 
            fisica.calcularMediaSede(Sede_Central,materia2);
            
            //Moda sede central
            fisica.calcularModaSede(Sede_Central,materia2);
            //Mediana sede central 
            fisica.calcularMediana(Sede_Central,materia2);

            //Maximo y minimo
            fisica.calcularMaxyMin(Sede_Central,materia2);
            //Desviacion Estandar 
            fisica.calcularDesviacionEstandar(Sede_Central, materia2, fisica.calcularMediaSede(Sede_Central,materia2));

            System.out.println("==========================");
            System.out.println("");
            System.out.println("----FISICA SEDE ALTIPLANO----");
            
            //Media Sede Altiplano
            fisica.calcularMediaSede(Sede_Alti,materia2);
            
            //Moda sede Altiplano
            fisica.calcularModaSede(Sede_Alti,materia2);
            //Mediana sede Altiplano
            fisica.calcularMediana(Sede_Alti,materia2);

            //Maximo y minimo 
            fisica.calcularMaxyMin(Sede_Alti,materia2);
            //Desviacion Estandar
            fisica.calcularDesviacionEstandar(Sede_Alti, materia2, fisica.calcularMediaSede(Sede_Alti ,materia2));

            System.out.println("==========================");
            System.out.println("");
            System.out.println("----QUIMICA SEDE SUR---- ");
            //QUIMICA SEDE SUR  
            quimica.calcularMediaSede(Sede_Sur,materia3);
            //Moda sede sur 
            quimica.calcularModaSede(Sede_Sur,materia3);
            //Mediana sede sur
            quimica.calcularMediana(Sede_Sur,materia3);

            //Maximo y minimo
            quimica.calcularMaxyMin(Sede_Sur,materia3);
            //Desviacion Estandar 
            quimica.calcularDesviacionEstandar(Sede_Sur, materia3, fisica.calcularMediaSede(Sede_Sur,materia3));

            System.out.println("==========================");
            System.out.println("");
            System.out.println("----QUIMICA SEDE CENTRAL---- ");

            //Media sede central
            quimica.calcularMediaSede(Sede_Central,materia3);
            //Moda sede central 
            quimica.calcularModaSede(Sede_Central,materia3);
            //Mediana sede central
            quimica.calcularMediana(Sede_Central,materia3);

            //Maximo y minimo
            quimica.calcularMaxyMin(Sede_Central,materia3);
            //Desviacion Estandar
            quimica.calcularDesviacionEstandar(Sede_Central, materia3, fisica.calcularMediaSede(Sede_Central,materia3));

            System.out.println("==========================");
            System.out.println("");
            System.out.println("----QUIMICA SEDE ALTIPLANO----");


            //Media Sede Altiplano
            quimica.calcularMediaSede(Sede_Alti,materia3);
           
            //Moda sede Altiplano
            quimica.calcularModaSede(Sede_Alti,materia3);
            //Mediana sede Altiplano
            quimica.calcularMediana(Sede_Alti,materia3);

            //Maximo y minimo
            quimica.calcularMaxyMin(Sede_Alti,materia3);
            //Desviacion Estandar
            quimica.calcularDesviacionEstandar(Sede_Alti, materia3, fisica.calcularMediaSede(Sede_Alti,materia3));

            System.out.println("==========================");
            System.out.println("");
            System.out.println("----LENGUAJE SEDE SUR---- ");



            //LENGUAJE SEDE SUR 
            lengua.calcularMediaSede(Sede_Sur, materia4);
           
            //Moda sede sur 
            lengua.calcularModaSede(Sede_Sur,materia4);
            //Mediana sede sur
            lengua.calcularMediana(Sede_Sur,materia4);

            //Maximo y minimo
            lengua.calcularMaxyMin(Sede_Sur,materia4);
            //Desviacion Estandar
            lengua.calcularDesviacionEstandar(Sede_Sur, materia4, fisica.calcularMediaSede(Sede_Sur,materia4));

            System.out.println("==========================");
            System.out.println("");
            System.out.println("----LENGUAJE SEDE CENTRAL---- ");



            // Media Sede Central 
            lengua.calcularMediaSede(Sede_Central,materia4);
            
            //Moda sede central
            lengua.calcularModaSede(Sede_Central,materia4);
            //Mediana sede central
            lengua.calcularMediana(Sede_Central,materia4);

            //Maximo y minimo 
            lengua.calcularMaxyMin(Sede_Central,materia4);
            //Desviacion Estandar
            lengua.calcularDesviacionEstandar(Sede_Central, materia4, fisica.calcularMediaSede(Sede_Central,materia4));

            System.out.println("==========================");
            System.out.println("");
            System.out.println("----LENGUAJE SEDE ALTIPLANO----");


            //Media Sede Altiplano
            lengua.calcularMediaSede(Sede_Alti,materia4);
            
            //Moda sede altiplano 
            lengua.calcularModaSede(Sede_Alti,materia4);
            //Mediana sede altiplano
            lengua.calcularMediana(Sede_Alti,materia4);

            //Maximo y minimo
            lengua.calcularMaxyMin(Sede_Alti,materia4);
            //Desviacion Estandar
            lengua.calcularDesviacionEstandar(Sede_Alti, materia4, fisica.calcularMediaSede(Sede_Alti,materia4));

            System.out.println("==========================");
            System.out.println("");
            System.out.println("----ESTADISTICA SEDE SUR----");



            //ESTADISTICA SEDE SUR 
            //Media
            estadistica.calcularMediaSede(Sede_Sur,materia5);
            
            //Moda sede sur 
            estadistica.calcularModaSede(Sede_Sur,materia5);
            //Mediana sur 
            estadistica.calcularMediana(Sede_Sur, materia5);

            //Maximo y minimo
            estadistica.calcularMaxyMin(Sede_Sur,materia5);
            //Desviacion Estandar
            estadistica.calcularDesviacionEstandar(Sede_Sur, materia5, fisica.calcularMediaSede(Sede_Sur,materia5));

            System.out.println("==========================");
            System.out.println("");
            System.out.println("----ESTADISTICA SEDE CENTRAL----");

            //Media Sede Central
            estadistica.calcularMediaSede(Sede_Central,materia5); 
           
            //Moda sede central
            estadistica.calcularModaSede(Sede_Central,materia5);
            //Mediana sede central
            estadistica.calcularMediana(Sede_Central, materia5);

            //Maximo y minimo
            estadistica.calcularMaxyMin(Sede_Central,materia5);
            //Desviacion Estandar
            estadistica.calcularDesviacionEstandar(Sede_Central, materia5, fisica.calcularMediaSede(Sede_Central,materia5));


            System.out.println("==========================");
            System.out.println("");
            System.out.println("----ESTADISTICA SEDE ALTIPLANO----");

            //Media Sede Altiplano
            estadistica.calcularMediaSede(Sede_Alti,materia5);
            
            //Moda sede Altiplano
            estadistica.calcularModaSede(Sede_Alti,materia5);
            //Mediana sede Altiplano
            estadistica.calcularMediana(Sede_Alti, materia5);
            
            //Maximo y minimo
            estadistica.calcularMaxyMin(Sede_Alti,materia5);
            //Desviacion Estandar
            estadistica.calcularDesviacionEstandar(Sede_Alti, materia5, fisica.calcularMediaSede(Sede_Alti,materia5));

  
            System.out.println("==========================");



            

            break;
            case "3":
            System.out.println("¡Gracias por usar nuestro programa, hasta la proxima!");
            seguir=false;
            break;
            default:
            System.out.println("ERROR OPCION INVALIDA");
            



        }
    }
    

    }

}