package ProdutoBebidas

import Interface.Produtos

class Suco(
    override var produto: String = "Suco",
    override var preco: Double = 6.00,
    override var precoTotal: Double = 0.0,
    override var quantidadeProduto: Int = 0,
) :Produtos {

}