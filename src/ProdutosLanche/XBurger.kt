package ProdutosLanche

import Classes.Utilitaria
import Classes.Utilitaria.Utilitaria.codigo
import Interface.Produtos


open class XBurger(
    override var produto: String = "X-Burguer",
    override var preco: Double = 10.00,
    override var precoTotal: Double = 0.0,
    override var quantidadeProduto: Int = 0,
) : Produtos {

    override fun adicionarProdutos(produtos: ArrayList<Produtos>) {
        codigo += 1
        Utilitaria.listaqtdItens[Utilitaria.codigo] = produtos
        val listaXb = XBurger()
        listaXb.quantidadeProduto = quantidadeProduto
        listaXb.preco = preco
        listaXb.precoTotal = precoTotal
        produtos.add(listaXb)
    }
}