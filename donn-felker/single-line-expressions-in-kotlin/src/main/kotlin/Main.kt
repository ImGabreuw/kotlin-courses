fun main() {
    sayHi()

    val age = 20

    fun doWork() = if (age < 21) println("less than 21") else println("eligible")

    doWork()
}

fun sayHi() = println("Hi")