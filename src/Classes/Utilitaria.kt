package Classes

import Interface.Produtos
import MSG_CODIGO_INVALIDO
import MSG_ITEM_VAZIO
import MSG_MENOR_ZERO

open class Utilitaria() {

    companion object Utilitaria {
        val listaqtdItens: MutableMap<Int, Produtos> = mutableMapOf()
        private var quantidadeProduto = 0
        private var preco = 0.0
        private var precoTotal = 0.0

        private var codigo: Int = 1

        fun informarQuantidade(mensagem: String, produto: Produtos): Int {
            println(mensagem)
            quantidadeProduto = validarItem()
            adicionarQuantidade(produto)
            println("Produto adicionado com sucesso")


            return quantidadeProduto
        }

        fun calcularPreco(produto: Produtos): Double {

           produto.precoTotal = produto.preco * produto.quantidadeProduto

            return produto.precoTotal
        }


        private fun adicionarItens(produto: Produtos): Int {
            listaqtdItens[codigo] = produto
            codigo += 1
            return codigo
        }

        private fun adicionarQuantidade(produtos: Produtos) {
            produtos.quantidadeProduto = quantidadeProduto
            adicionarItens(produtos)
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

                    println(" $cont - Quantidade: ${produto.quantidadeProduto} ${produto.produto} R$= ${produto.precoTotal}")
                    precoCarrinho += produto.precoTotal
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

























