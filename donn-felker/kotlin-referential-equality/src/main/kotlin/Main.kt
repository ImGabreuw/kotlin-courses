fun main() {
    example1()
    example2()
    example3()
}

fun example1() {
    val a = 12
    val b = 12

    println(a === b)
    println(a == b)
}

fun example2() {
    val person1 = Person("Donn")
    val person2 = Person("Donn")

    println(person1 === person2)
}

fun example3() {
    val person1 = Person("Donn")
    val person2 = Person("Donn")

    println(person1 !== person2)
}

class Person(val name: String)