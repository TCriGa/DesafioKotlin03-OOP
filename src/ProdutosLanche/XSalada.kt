package ProdutosLanche

import Interface.Produtos

class XSalada(
    override var produto: String = "X-Salada",
    override var preco: Double = 12.00,
    override var precoTotal: Double = 0.0,
    override var quantidadeProduto: Int = 0,

) : Produtos {



}