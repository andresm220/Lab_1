import java.util.Scanner
fun main() {
    val palabras = ingresarPalabras()

    // Contadores para cada tipo de palabra
    var palindromas = 0
    var alMenosDosVocales = 0
    var inicianConConsonante = 0

    for (palabra in palabras) {
        if (esPalindroma(palabra)) {
            palindromas++
        }
        if (tieneAlMenosDosVocales(palabra)) {
            alMenosDosVocales++
        }
        if (iniciaConConsonante(palabra)) {
            inicianConConsonante++
        }
    }

    // Mostrar resultados
    println("Cantidad de palabras palíndromas: $palindromas")
    println("Cantidad de palabras con al menos 2 vocales distintas: $alMenosDosVocales")
    println("Cantidad de palabras que inician con consonante: $inicianConConsonante")
}

// Función para ingresar palabras desde la consola
fun ingresarPalabras(): List<String> {
    println("Ingresa varias palabras separadas por espacios:")
    val input = readLine()
    return input?.trim()?.split("\\s+".toRegex()) ?: emptyList()
}

// Función para verificar si una palabra es palíndroma
fun esPalindroma(palabra: String): Boolean {
    val reversed = palabra.reversed()
    return palabra.equals(reversed, ignoreCase = true)
}

// Función para verificar si una palabra tiene al menos 2 vocales distintas
fun tieneAlMenosDosVocales(palabra: String): Boolean {
    val vocalesDistintas = palabra.toLowerCase().toSet().filter { it in "aeiou" }.size
    return vocalesDistintas >= 2
}

// Función para verificar si una palabra inicia con consonante
fun iniciaConConsonante(palabra: String): Boolean {
    val primeraLetra = palabra.toLowerCase().firstOrNull()
    return primeraLetra != null && primeraLetra !in "aeiou"
}



