package Classes

import Interface.Produtos
import MSG_CODIGO_INVALIDO
import MSG_ITEM_VAZIO
import MSG_MENOR_ZERO

open class Utilitaria(
    override var produto: String,
    override var preco: Double,
    override var precoTotal: Double,
    override var quantidadeProduto: Int,
) : Produtos {

    private val listaqtdItens = mutableMapOf<Int, Produtos>()
    private var codigo: Int = 1


    private fun adicionarItens(produto: Produtos): Int {
        listaqtdItens[codigo] = produto
        codigo += 1
        return codigo
    }

    fun gerarCarrinhoProdutos(produto: Produtos) {
        adicionarItens(produto)
        mostrarItens()

    }

    fun validarItem(): Int {
        quantidadeProduto = readln().toInt()
        while (quantidadeProduto < 0) {
            println(MSG_MENOR_ZERO)
            quantidadeProduto = readln().toInt()
        }

        return quantidadeProduto
    }


    fun mostrarItens() {
        if (listaqtdItens.isEmpty()) {
            println(MSG_ITEM_VAZIO)

        } else {
            listaqtdItens.forEach { (cont, produto) ->
                println(" $cont - Quantidade: ${produto.quantidadeProduto}  ${produto.produto} " +
                        "R$ = ${produto.precoTotal}")
            }
        }
    }


    fun removerItens(mensagem: String) {
        println(mensagem)
        codigo = readln().toIntOrNull()?: throw NumberFormatException(MSG_MENOR_ZERO)

        if (codigo in listaqtdItens) {
            listaqtdItens.remove(codigo)
        } else {
            println(MSG_CODIGO_INVALIDO)
            codigo = readln().toIntOrNull()?:throw NumberFormatException(MSG_MENOR_ZERO)

        }
    }

}




