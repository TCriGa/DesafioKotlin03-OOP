package ProdutoBebidas

import Classes.Produtos
import Classes.Utilitaria

class Suco() : Utilitaria("Suco", 6.00, 0.0, 0), Produtos {

    fun informarQuantidadeSuco(mensagem: String, produto: Produtos) {
        println(mensagem)
        quantidadeProduto = validarItem()
        calcularPreco()
    }

    private fun calcularPreco(): Double {
        precoTotal = preco * quantidadeProduto
        return precoTotal

    }
}