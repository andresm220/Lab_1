

/**
 * La clase Bebida extiende la clase Producto y representa un tipo específico de producto, en este caso una bebida.
 */
public class Bebida extends Producto {
    private int ml;      // Volumen de la bebida en mililitros.
    private String tipo; // Tipo de bebida (energética, con licor, natural, agua pura)

    /**
     * Constructor de la clase Bebida.
     *
     * @param id Identificador único de la bebida.
     * @param nombre Nombre de la bebida.
     * @param cantidadDisp Cantidad disponible en inventario de la bebida.
     * @param cantidadVen Cantidad vendida de la bebida.
     * @param estado Estado actual de la bebida.
     * @param precio Precio de la bebida.
     * @param ml Volumen de la bebida en mililitros.
     * @param tipo Tipo de bebida.
     */
    public Bebida(int id, String nombre, int cantidadDisp, int cantidadVen, String estado, double precio, int ml, String tipo){
        super(id, nombre, cantidadDisp, cantidadVen, estado, precio);
        this.ml = ml;
        this.tipo = tipo;
    }

    /**
     * Obtiene el volumen de la bebida en mililitros.
     *
     * @return El volumen de la bebida en mililitros.
     */
    public int getML(){
        return this.ml;
    }

    /**
     * Obtiene el tipo de bebida.
     *
     * @return El tipo de bebida.
     */
    public String getTipo(){
        return this.tipo;
    }
}

