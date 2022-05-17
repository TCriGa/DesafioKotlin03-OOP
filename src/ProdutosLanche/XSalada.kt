package ProdutosLanche

import Interface.Produtos
import Classes.Utilitaria

class XSalada(
) : Utilitaria("X-Salda", 12.0, 0.0, 0), Produtos {


    fun informarQuantidadeSalada(mensagem: String, produto: Produtos) {
        println(mensagem)

        quantidadeProduto = validarItem()
        calcularPreco()
    }

    private fun calcularPreco(): Double {
        precoTotal = preco * quantidadeProduto
        return precoTotal

    }
}