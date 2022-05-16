package Classes


abstract class Produto(
    private var produto: String,
    private var preco: Double,
    private var quantidadeProduto: Int,


    ) {
    private val listaqtdItens = mutableMapOf<Int, String>()
    private var contador = 0


    fun informarQuantidade(mensagem: String): Int {
        println(mensagem)
        quantidadeProduto = readln().toInt()

        return quantidadeProduto
    }


    private fun calcularPreco(): Double {

        return preco * quantidadeProduto

    }


    fun adicionarItens() {
        for (i in 1 until quantidadeProduto) {
            contador++
            listaqtdItens[contador] = produto
        }
    }

    fun mostrarItens() {
        listaqtdItens.forEach { (t, u) ->
            println("$t - $quantidadeProduto $u R$ = ${calcularPreco()}")
        }
    }


}

