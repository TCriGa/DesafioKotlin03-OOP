package Classes

interface Produtos {
    var produto: String
    var preco: Double
    var precoTotal: Double
    var quantidadeProduto: Int


    fun informarQuantidade(mensagem: String, produto: Produtos): Int {
        println(mensagem)
       quantidadeProduto = readln().toInt()
        return quantidadeProduto

    }

    fun calcularPreco(quantidadeProduto: Int): Double {
        precoTotal = preco * quantidadeProduto
        return precoTotal

    }


}