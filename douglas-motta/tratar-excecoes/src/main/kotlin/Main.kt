import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun main() {
    val idade = lerIdade()
    println(idade)
}

fun lerIdade(): Int? {
    val reader = BufferedReader(
        FileReader(
            File("src/main/resources/idades.txt")
        )
    )

    return try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    } finally {
        reader.close()
    }
}