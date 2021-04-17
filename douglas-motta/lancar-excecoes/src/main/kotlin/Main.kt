fun main() {
//    val porcentagem = porcentagem(50)
//    println(porcentagem)

//    val porcentagem = porcentagem(101)
//    println(porcentagem)
}

fun porcentagem(numero: Int): String {
    return if (numero in 1..100) {
        "$numero%"
    } else {
        throw IllegalArgumentException("Número deve estar entre 1 e 100")
    }
}