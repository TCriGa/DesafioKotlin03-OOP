package ProdutosLanche

class XSalada(override var produto: String = "X - Salada",
              override var preco: Double = 12.00,
              var quantidade: Int, override var quantidadeProduto: Int,
              override var numeroProduto: Int = 1
) : Lanches {
}