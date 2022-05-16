package ProdutosLanche

import MSG_STRING_INVALIDA

interface Lanches {
    var produto: String
    var preco: Double
    var quantidadeProduto: Int
    var numeroProduto: Int


    fun informarQuantidade(mensagem: String): Int {

        try {
            println(mensagem)
            quantidadeProduto = readln().toInt()

        } catch (ex: NumberFormatException) {
            println(MSG_STRING_INVALIDA)
        }

        return quantidadeProduto
    }

    fun calcularPreco(): Double {

        return preco * quantidadeProduto
    }



}
