package ProdutosLanche

import Interface.Produtos

open class XBurger(
    override var produto: String = "X-Burguer",
    override var preco: Double = 10.00,
    override var precoTotal: Double = 0.0,
    override var quantidadeProduto: Int = 0,
) : Produtos {



}