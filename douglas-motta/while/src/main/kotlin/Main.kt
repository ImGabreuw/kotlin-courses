fun main() {
    var temperatura = 0
    var somatoria = 0
    var quantidade = 0

    while (temperatura != 999) {
        println("Digite uma temperatura ou 999 para sair:")
        temperatura = readLine()!!.toInt() //"abc" Erro (NumberFormatException)

        if (temperatura != 999) {
            somatoria += temperatura // somatoria = somatoria + temperatura
            quantidade++ // quantidade = quantidade + 1
        }
    }

    println("A média das temperaturas é = ${somatoria / quantidade}")
}