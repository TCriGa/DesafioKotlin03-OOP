package Classes

import Interface.Produtos
import MSG_CODIGO_INVALIDO
import MSG_ITEM_VAZIO
import MSG_MENOR_ZERO



open class Utilitaria() {

    companion object Utilitaria {
        val listaqtdItens: MutableMap<Int, ArrayList<Produtos>> = mutableMapOf()
        private var quantidadeProduto = 0

        var codigo: Int = 1

        fun informarQuantidade(mensagem: String, produtos: Produtos): Int {
            println(mensagem)
           produtos.quantidadeProduto = validarItem()
            calcularPreco(produtos)
            println("Produto adicionado com sucesso")

            return quantidadeProduto
        }

        fun calcularPreco(produtos: Produtos): Double {
            produtos.precoTotal = produtos.preco * produtos.quantidadeProduto

            return produtos.precoTotal
        }


        private fun validarItem(): Int {
            quantidadeProduto = readln().toInt()
            while (quantidadeProduto < 0) {
                println(MSG_MENOR_ZERO)
                quantidadeProduto = validarItem()
            }

            return quantidadeProduto
        }


        fun mostrarItens() {
            var precoCarrinho = 0.0
            if (listaqtdItens.isEmpty()) {
                println(MSG_ITEM_VAZIO)

            } else {
                listaqtdItens.forEach { (cont, produto) ->
                    produto.forEachIndexed { _, produtos ->
                        println(" $cont - Quantidade: ${produtos.quantidadeProduto} ${produtos.produto} R$= ${produtos.precoTotal}")
                        precoCarrinho += produtos.precoTotal
                    }
                }


            }
            println("Preço total da Compra R$ $precoCarrinho")
        }

        fun removerItens(mensagem: String) {
            println(mensagem)
            codigo = readln().toIntOrNull() ?: throw NumberFormatException(MSG_MENOR_ZERO)

            if (codigo in listaqtdItens) {
                listaqtdItens.remove(codigo)
            } else {
                println(MSG_CODIGO_INVALIDO)
                codigo = readln().toIntOrNull() ?: throw NumberFormatException(MSG_MENOR_ZERO)

            }
        }


    }


}




























