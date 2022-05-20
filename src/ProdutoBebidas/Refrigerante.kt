package ProdutoBebidas

import Interface.Produtos

class Refrigerante(
    override var produto: String = "Refrigerante",
    override var preco: Double = 8.00,
    override var precoTotal: Double = 0.0,
    override var quantidadeProduto: Int = 0,
) : Produtos {


}