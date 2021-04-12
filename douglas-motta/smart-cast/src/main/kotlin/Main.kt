import java.lang.IllegalArgumentException

interface Expressao

class Numero(val valor: Int) : Expressao

class Soma(val equerdo: Expressao, val direito: Expressao): Expressao

fun avaliacao(expressao: Expressao): Int {
    if (expressao is Numero) {
//        val numero = expressao as Numero // Cast explícito
        return expressao.valor
    }

    if (expressao is Soma) {
        return avaliacao(expressao.equerdo) + avaliacao(expressao.direito)
    }

    throw IllegalArgumentException("Expressão é desconhecida")
}

fun main() {
    // ((1 + 2) + 4)
    val avaliacao = avaliacao(
        Soma(
            Soma(Numero(1), Numero(2)),
            Numero(4)
        )
    )
    println(avaliacao)
}