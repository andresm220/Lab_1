fun main(args: Array<String>) {
    // Función para convertir un número decimal a binario
    fun decimalToBinary(decimal: Int): String {
        var num = decimal // Guarda el número decimal original en una variable mutable num
        var binary = ""    // Inicializa una cadena vacía para almacenar el número binario resultante

        // Manejo del caso especial cuando el número decimal es 0
        if (num == 0) {
            return "0"     // Si el número es 0, retorna directamente "0" como binario
        }

        // Ciclo para calcular el binario mediante divisiones sucesivas por 2
        while (num > 0) {
            val residuo = num % 2         // Calcula el residuo de dividir num entre 2
            binary = residuo.toString() + binary  // Concatena el residuo al inicio de la cadena binaria
            num /= 2                        // Actualiza num dividiéndolo por 2 para la siguiente iteración
        }

        return binary   // Retorna la cadena binaria resultante
    }

        val decimal = 23                        // Número decimal que se va a convertir a binario
        val binary = decimalToBinary(decimal)   // Llama a la función para convertir decimal a binario
        println("El número $decimal en binario es: $binary")  // Imprime el resultado


}