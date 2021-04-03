fun main() {
    println(max(10, 5))
}

// Corpo de bloco
//fun max(a: Int, b: Int): Int {
//    return if (a > b) a else b;
//}

// Corpo de expressão + Tipo de retorno explícito
//fun max(a: Int, b: Int): Int = if (a > b) a else b

// Corpo de expressão + Tipo de retorno implícito
fun max(a: Int, b: Int) = if (a > b) a else b