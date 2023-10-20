

/**
 * La clase Producto representa un artículo en un inventario.
 */
public class Producto {
    protected  int id;             // Identificador único del producto.
    protected String nombre;      // Nombre del producto.
    protected int cantidadDisp;   // Cantidad disponible en inventario.
    protected int cantidadVen;    // Cantidad vendida del producto.
    protected String estado;      // Estado actual del producto (disponible o no disponible ).
    protected double precio;      // Precio del producto.

    /**
     * Constructor de la clase Producto.
     *
     * @param id Identificador único del producto.
     * @param nombre Nombre del producto.
     * @param cantidadDisp Cantidad disponible en inventario.
     * @param cantidadVen Cantidad vendida del producto.
     * @param estado Estado actual del producto.
     * @param precio Precio del producto.
     */
    public Producto(int id, String nombre, int cantidadDisp, int cantidadVen, String estado, double precio){
        this.id = id;
        this.nombre = nombre;
        this.cantidadDisp = cantidadDisp;
        this.cantidadVen = cantidadVen;
        this.estado = estado;
        this.precio = precio;
    }

    /**
     * Obtiene el identificador del producto.
     *
     * @return El identificador del producto.
     */
    public int getId(){
        return this.id;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Obtiene la cantidad disponible en inventario.
     *
     * @return La cantidad disponible en inventario.
     */
    public int getDisp(){
        return this.cantidadDisp;
    }

    /**
     * Obtiene la cantidad vendida del producto.
     *
     * @return La cantidad vendida del producto.
     */
    public int getVen(){
        return this.cantidadVen;
    }

    /**
     * Obtiene el estado actual del producto.
     *
     * @return El estado actual del producto.
     */
    public String getEstado(){
        return this.estado;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrecio(){
        return this.precio;
    }
}
