fun main() {
    val pessoa: Pessoa = Pessoa(
        "Gabriel",
        16,
        false
    )

    println("Pessoa: ${pessoa.nome} / ${pessoa.idade} / ${pessoa.isCasado}")
}