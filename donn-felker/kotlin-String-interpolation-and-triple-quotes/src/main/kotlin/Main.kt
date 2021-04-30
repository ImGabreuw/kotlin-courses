fun main() {
    var message: String = "Hello, \nMy name is Donn Felker. \nHow are you?"
    println(message)

    message = """
        Hello,
        My name is Donn Felker.
        How are you?
    """.trimIndent()
    println(message)

    message = """
        Hello,
        My name is Donn Felker.
        How are you?
    """.replaceIndent()
    println(message)

    message = """
        Hello,
        My name is Donn Felker.
        How are you?
    """.replaceIndent("->")
    println(message)

    message = """
        ->Hello,
        ->My name is Donn Felker.
        ->How are you?
    """.trimMargin("->")
    println(message)

    message = """
        |Hello,
        |My name is Donn Felker.
        |How are you?
    """.trimMargin()
    println(message)

    // String manipulation
    var name: String = "Donn"
    var age: Int = 32
    println("Hello " + name)
    println("Hello $name, you age is $age and your name is ${name.length} characters long.")
}