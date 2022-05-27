package ProdutoBebidas

import Classes.Utilitaria
import Classes.Utilitaria.Utilitaria.codigo
import Interface.Produtos

class Suco(
    override var produto: String = "Suco",
    override var preco: Double = 6.00,
    override var precoTotal: Double = 0.0,
    override var quantidadeProduto: Int = 0,
) :Produtos {

    override fun adicionarProdutos(produtos: ArrayList<Produtos>) {
        codigo += 1
        Utilitaria.listaqtdItens[Utilitaria.codigo] = produtos
        val lista = Suco()
        lista.quantidadeProduto = quantidadeProduto
        lista.preco = preco
        lista.precoTotal = precoTotal
        produtos.add(lista)
    }
}