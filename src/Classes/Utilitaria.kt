package Classes

import MSG_ITEM_VAZIO
import MSG_MENOR_ZERO

abstract class Utilitaria(
    private var produto: String,
    private var preco: Double,
    private var quantidadeProduto: Int,


    ) {
    private val listaqtdItens = mutableMapOf<Int, String>()
    private var contador = hashCode()


    fun informarQuantidade(mensagem: String): Int {
        adicionarItens()
        println(mensagem)
        quantidadeProduto = readln().toInt()
        validarItem(mensagem)
        contador++
        return contador
    }


    private fun calcularPreco(): Double {
        return preco * quantidadeProduto

    }


    private fun adicionarItens() {
        listaqtdItens[contador] = produto
    }

    private fun validarItem(mensagem: String) {
        if (quantidadeProduto < 0) {
            println(MSG_MENOR_ZERO)
            quantidadeProduto = readln().toInt()
        } else {
            adicionarItens()

        }
    }

    fun mostrarItens() {
        if (listaqtdItens.isEmpty()) {
            println(MSG_ITEM_VAZIO)

        } else {
            listaqtdItens.forEach { (codigo, produto) ->
                println(" ${codigo.hashCode()} - Quantidade: $quantidadeProduto $produto R$ = ${calcularPreco()}")
            }
        }
    }
}




