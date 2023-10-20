

/**
 * La clase Gomitas extiende la clase Producto y representa un tipo específico de producto, en este caso gomitas.
 */
public class Gomitas extends Producto {
    private String sabor;  // Sabor de las gomitas.

    /**
     * Constructor de la clase Gomitas.
     *
     * @param id Identificador único de las gomitas.
     * @param nombre Nombre de las gomitas.
     * @param cantidadDisp Cantidad disponible en inventario de las gomitas.
     * @param cantidadVen Cantidad vendida de las gomitas.
     * @param estado Estado actual de las gomitas.
     * @param precio Precio de las gomitas.
     * @param sabor Sabor de las gomitas (limon,fresa,blueberry)
     */
    public Gomitas(int id, String nombre, int cantidadDisp, int cantidadVen, String estado, double precio, String sabor){
        super(id, nombre, cantidadDisp, cantidadVen, estado, precio);
        this.sabor = sabor;
    }

    /**
     * Obtiene el sabor de las gomitas.
     *
     * @return El sabor de las gomitas.
     */
    public String getSabor(){
        return this.sabor;
    }
}

