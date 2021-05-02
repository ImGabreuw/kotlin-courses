fun main() {
    sayHi1()
    println(sayHi2())
    println(sayHi3())
    println(sayHi4())
    println(sayHi5())
}

// Por padrão toda função retorna Unit
fun sayHi1() {
    println("Hello World")
}

fun sayHi2(): String {
   return "Hello World"
}

fun sayHi3(): Int {
    return 32
}

fun sayHi4(): String {
    return 32.toString()
}

fun sayHi5(): Boolean {
    return true
}