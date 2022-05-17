package Classes

import MSG_CODIGO_INVALIDO
import MSG_ITEM_VAZIO
import MSG_MENOR_ZERO

open class Utilitaria(
    override var produto: String,
    override var preco: Double,
    override var precoTotal: Double,
    override var quantidadeProduto: Int
) : Produtos {

    private val listaqtdItens = mutableMapOf<Int, Produtos>()
    private var codigo: Int = 1


    private fun adicionarItens(produto: Produtos):Int {
        listaqtdItens[codigo] = produto
        codigo+=1
        return codigo
    }

    fun gerarCarrinhoProdutos(produto: Produtos){
        adicionarItens(produto)
        validarItem()
        mostrarItens()

    }




    fun validarItem() {
        if (quantidadeProduto < 0) {
            println(MSG_MENOR_ZERO)
            quantidadeProduto = readln().toInt()
        } else {

        }
    }


    fun mostrarItens() {
        if (listaqtdItens.isEmpty()) {
            println(MSG_ITEM_VAZIO)

        } else {
            listaqtdItens.forEach { (cont, produto) ->
                println(" $cont - Quantidade: ${this.quantidadeProduto}  ${produto.produto} R$ = ${produto.calcularPreco(quantidadeProduto)}")
            }
        }
    }

    fun editarItens(mensagem: String, produto: Produtos) {
        println(mensagem)
        var newCodigo = readln().toInt()

        if (newCodigo == 0) {
            informarQuantidade(mensagem, produto)
        } else {
            println(MSG_CODIGO_INVALIDO)
            newCodigo = readln().toInt()
        }
    }

    fun removerItens(mensagem: String) {
        println(mensagem)
        var newCodigo = readln().toInt()

        if (newCodigo == 0) {
            listaqtdItens.remove(codigo)
        } else {
            println(MSG_CODIGO_INVALIDO)
            newCodigo = readln().toInt()
        }
    }
}




