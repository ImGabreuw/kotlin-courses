import java.lang.IllegalArgumentException

interface Expressao

class Numero(val valor: Int) : Expressao

class Soma(val equerdo: Expressao, val direito: Expressao): Expressao

fun avaliacao(expressao: Expressao): Int =
    when(expressao) {
        is Numero -> { // Início da ramificação
            println("Expressão com número: ${expressao.valor}")
            expressao.valor // Retorno (sempre a última expressão)
        } // Fim da ramificação

        is Soma -> {
            avaliacao(expressao.direito) + avaliacao(expressao.equerdo)
        }

        else -> throw IllegalArgumentException("Expressão é desconhecida")
    }

fun main() {
    // ((1 + 2) + 4)
    val avaliacao = avaliacao(
        Soma(
            Soma(
                Numero(1),
                Numero(2)
            ),
            Numero(4)
        )
    )
    println(avaliacao)
}