fun main() {
    var name1: String = "Donn"
//    name = null

    var name2: String? = "Donn"
    name2 = null

    var age1: Int = 32
//    age1 = null

    var age2: Int? = 32
    age2 = null

    var person1: Person = Person("Donn")
//    person1 = null

    var person2: Person? = Person("Donn")
//    person2 = null
}

class Person(val name: String)