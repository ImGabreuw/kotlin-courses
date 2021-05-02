fun main() {
    sayHelloAndBye()

    // sayBye() Erro de compilação
}

fun sayHelloAndBye() {
    println("Hello")

    // sayBye() Erro de compilação

    fun sayBye() {
        println("Bye")

        fun moo() {
            println("Moo")
        }

        moo()
    }

    sayBye()
}