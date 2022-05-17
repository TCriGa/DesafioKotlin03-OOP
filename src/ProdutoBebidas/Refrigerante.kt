package ProdutoBebidas

import Classes.Produtos
import Classes.Utilitaria

class Refrigerante(
) : Utilitaria("Refrigerante", 8.00, 0.0, 0), Produtos {
    fun informarQuantidadeRefri(mensagem: String, produto: Produtos) {
        println(mensagem)
        quantidadeProduto = validarItem()
        calcularPreco()
    }

    private fun calcularPreco(): Double {
        precoTotal = preco * quantidadeProduto
        return precoTotal

    }
}