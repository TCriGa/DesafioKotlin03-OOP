package ProdutosLanche

import Interface.Produtos
import Classes.Utilitaria



open class XBurger(
) : Utilitaria("X-Burguer",10.00,0.0,0), Produtos {

    fun informarQuantidadeXBurguer(mensagem: String, produto: Produtos) {
        println(mensagem)
        quantidadeProduto = validarItem()
        calcularPreco()
    }

    private fun calcularPreco(): Double {
        precoTotal = preco * quantidadeProduto
        return precoTotal

    }


}