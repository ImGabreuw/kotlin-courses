fun main() {
    val frutas1 = ArrayList<String>()
    frutas1.add("Maça")
    frutas1.add("Banana")
    frutas1.add("Morango")
    println(frutas1)

    val frutas2 = arrayListOf("Maça", "Banana", "Morango")
    println(frutas2)

    // Pegar o último elemento
    println(frutas2.last())

    val numeros1 = HashSet<Int>()
    numeros1.add(1)
    numeros1.add(2)
    numeros1.add(3)
    println(frutas1)

    val numeros2 = setOf(1, 2, 3)
    println(frutas1)

    // Pegar o maior valor
    println(numeros2.max())
}