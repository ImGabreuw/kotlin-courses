fun main() {
    val nome = "Gabriel"

    // Java
    println("Hello " + nome + "!")

    // Kotlin
    println("Hello $nome!")
    println("Hello \$nome!") // Escape

    println("Soma é: ${soma(10, 20)}")
}

fun soma(a: Int, b: Int) = a + b