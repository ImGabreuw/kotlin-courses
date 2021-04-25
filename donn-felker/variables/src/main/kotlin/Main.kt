fun main() {
    var fullName = "Donn Falker"
    println(fullName)

    fullName = "John Falker"
    println(fullName)

    fullName = ""
    println(fullName)

    println(fullName.isEmpty())

    var age = 30
//    var age = 30 Não pode ter 2 variáveis, no mesmo escopo, com os mesmo nome
    age = 32
    println(age)

    // Tests
    var language = "Kotlin"
    println(language.isEmpty()) // false

    language = ""
    println(language.isEmpty()) // true
}
