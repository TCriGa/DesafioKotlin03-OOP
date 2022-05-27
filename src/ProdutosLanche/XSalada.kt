package ProdutosLanche

import Classes.Utilitaria
import Classes.Utilitaria.Utilitaria.codigo
import Interface.Produtos


class XSalada(
    override var produto: String = "X-Salada",
    override var preco: Double = 12.00,
    override var precoTotal: Double = 0.0,
    override var quantidadeProduto: Int = 0,

    ) : Produtos {
    override fun adicionarProdutos(produtos: ArrayList<Produtos>) {
        codigo += 1
        Utilitaria.listaqtdItens[Utilitaria.codigo] = produtos
        val listaXs = XSalada()
        listaXs.quantidadeProduto = quantidadeProduto
        listaXs.preco = preco
        listaXs.precoTotal = precoTotal
        produtos.add(listaXs)
    }


}