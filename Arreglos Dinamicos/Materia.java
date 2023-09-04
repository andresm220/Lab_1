import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;

public class Materia {

    private String Nombre;
    private int nota;
    
    public void setNombre(String Nombre){
        this.Nombre=Nombre;

    }
    public String getNombre(){
        return this.Nombre;
    }
    public void setNota(int nota){
        this.nota= nota;
    }
    public int getNota(){
        return this.nota;
    }

    //Metodo para la media 
    public static double calcularMediaSede(ArrayList<Materia> sede, String nombreMateria) {
    int totalNotas = 0;
    int cantidadMaterias = 0;

    for (Materia materia : sede) {
        if (materia.getNombre().equalsIgnoreCase(nombreMateria)) {
            totalNotas += materia.getNota();
            cantidadMaterias++;
        }
    }

    if (cantidadMaterias > 0) {
        double media=  totalNotas / cantidadMaterias;
        System.out.println("La media para " + nombreMateria + " en esta sede es  " + media);
        return media;
        

    } else {
        System.out.println("Nadie realizó el examen de " + nombreMateria + " en esta sede.");
        return 0.0; // Devuelve 0.0 si no hay notas para la materia en la sede.
    }
    
}
public static void calcularModaSede(ArrayList<Materia> sede, String nombreMateria) {
    if (sede.isEmpty()) {
        System.out.println("No hay notas para sacar la moda de " + nombreMateria + " en esta sede.");
        return;
    }

    Map<Integer, Integer> contadorNotas = new HashMap<>();

    // Contar la frecuencia de cada nota para la materia especificada
    for (Materia materia : sede) {
        if (nombreMateria.equalsIgnoreCase(materia.getNombre())) {
            int nota = materia.getNota();
            contadorNotas.put(nota, contadorNotas.getOrDefault(nota, 0) + 1);
        }
    }

    int moda = -1; // Valor para almacenar la moda
    int maxFrecuencia = 0;

    // Encontrar la nota con mayor moda para la materia especificada
    for (Map.Entry<Integer, Integer> entry : contadorNotas.entrySet()) {
        int nota = entry.getKey();
        int frecuencia = entry.getValue();

        if (frecuencia > maxFrecuencia) {
            moda = nota;
            maxFrecuencia = frecuencia;
        }
    }

    // Verificar si no hay una moda clara
    int frecuenciaMaxima = Collections.frequency(new ArrayList<>(contadorNotas.values()), maxFrecuencia);

    if (frecuenciaMaxima == 1) {
        System.out.println("No hay una moda clara para " + nombreMateria + " en esta sede.");
    } else {
        System.out.println("La moda de las notas de " + nombreMateria + " en esta sede es: " + moda);
    }
}



    
    //Metodo para maximo y minimo 
    public static void calcularMaxyMin(ArrayList<Materia> sede, String nombreMateria) {
    // Crear un ArrayList para almacenar las notas de la materia seleccionada
    ArrayList<Integer> notasMat = new ArrayList<>();

    // Recorrer las materias en la sede y agregar las notas de la materia seleccionada al ArrayList
    for (Materia materia : sede) {
        if (nombreMateria.equalsIgnoreCase(materia.getNombre())) {
            notasMat.add(materia.getNota());
        }
    }

    // Verificar si hay notas en la materia seleccionada
    if (notasMat.isEmpty()) {
        System.out.println("No se puede sacar ni el maximo ni el minimo  " + nombreMateria + " en esta sede porque no hay notas ");
    } else {
        // Calcular el máximo y el mínimo usando Collections.max y Collections.min
        int maximo = Collections.max(notasMat);
        int minimo = Collections.min(notasMat);

        // Imprimir los resultados
        System.out.println("El máximo para " + nombreMateria + " en esta sede es " + maximo);
        System.out.println("El mínimo para " + nombreMateria + " en esta sede es " + minimo);
    }
}
public double calcularDesviacionEstandar(ArrayList<Materia> materias, String nombreMateria, double media) {
    // Calcular la suma de las diferencias al cuadrado entre cada nota y la media
    double sumaDiferenciasCuadrado = 0.0;
    int cantidadNotas = 0;
    
    for (Materia materia : materias) {
        if (materia.getNombre().equalsIgnoreCase(nombreMateria)) {
            double diferencia = materia.getNota() - media;
            sumaDiferenciasCuadrado += diferencia * diferencia;
            cantidadNotas++;
        }
    }
    
    // Calcular la varianza (promedio de las diferencias al cuadrado)
    double varianza = sumaDiferenciasCuadrado / cantidadNotas;
    
    // Calcular la desviación estándar (raíz cuadrada de la varianza)
    double desviacionEstandar = Math.sqrt(varianza);
    if(media==0){
        System.out.println("No hay desviacion estandar por que no hay datos para la media");
        desviacionEstandar=-1.00;

    }else{

        System.out.println("La desviacion estandar para " + nombreMateria + " es  " + desviacionEstandar);
    
    

    }
    return desviacionEstandar;

    
}
//Metodo para sacar la mediana 


public static double calcularMediana(ArrayList<Materia> sede, String nombreMateria) {
    ArrayList<Integer> notasMateria = new ArrayList<>();

    for (Materia materia : sede) {
        if (nombreMateria.equalsIgnoreCase(materia.getNombre())) {
            notasMateria.add(materia.getNota());
        }
    }
    //El tamaño del arraylist que se creo
    // Ordenar las notas en orden ascendente
    Collections.sort(notasMateria); 

    int n = notasMateria.size();

    if (n == 0) {
        System.out.println("No se puede calcular la mediana de " + nombreMateria + " en la sede Sur porque no hay notas.");
        return 0; 
    }

    

    if (n % 2 == 0) {
        // Si hay un número par de notas, la mediana es el promedio de las dos notas centrales
        int nota1 = notasMateria.get(n / 2 - 1);
        int nota2 = notasMateria.get(n / 2);
        System.out.println("La mediana para " + nombreMateria + " es " + (nota1 + nota2) / 2.0);
        return (nota1 + nota2) / 2.0;
    } else {
        // Si hay un número impar de notas, la mediana es la nota central
        System.out.println("La mediana para " + nombreMateria + " es " + notasMateria.get(n / 2) );
        return notasMateria.get(n / 2);
    }
}
}









