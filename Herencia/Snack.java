

/**
 * La clase Snack extiende la clase Producto y representa un tipo específico de producto, en este caso un snack.
 */
public class Snack extends Producto {
    private int gr;        // Peso del snack en gramos.
    private String sabor;  // Sabor del snack(barbacoa,picante, natural)
    private String tamaño; // Tamaño del snack (individual, familiar)

    /**
     * Constructor de la clase Snack.
     *
     * @param id Identificador único del snack.
     * @param nombre Nombre del snack.
     * @param cantidadDisp Cantidad disponible en inventario del snack.
     * @param cantidadVen Cantidad vendida del snack.
     * @param estado Estado actual del snack.
     * @param precio Precio del snack.
     * @param gr Peso del snack en gramos.
     * @param sabor Sabor del snack.
     * @param tamaño Tamaño del snack.
     */
    public Snack(int id, String nombre, int cantidadDisp, int cantidadVen, String estado, double precio, int gr, String sabor, String tamaño){
        super(id, nombre, cantidadDisp, cantidadVen, estado, precio);
        this.gr = gr;
        this.sabor = sabor;
        this.tamaño = tamaño;
    }

    /**
     * Obtiene el peso del snack en gramos.
     *
     * @return El peso del snack en gramos.
     */
    public int getGR(){
        return this.gr;
    }

    /**
     * Obtiene el sabor del snack.
     *
     * @return El sabor del snack.
     */
    public String getSabor(){
        return this.sabor;
    }

    /**
     * Obtiene el tamaño del snack.
     *
     * @return El tamaño del snack.
     */
    public String getTamaño(){
        return this.tamaño;
    }
}

