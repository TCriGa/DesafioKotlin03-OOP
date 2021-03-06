package Menu

import Classes.Utilitaria
import MSG_CODIGO_PRODUTO
import MSG_OPCAOINVALIDA
import MSG_QUANTIDADE
import MSG_STRING_INVALIDA
import ProdutoBebidas.Refrigerante
import ProdutoBebidas.Suco
import ProdutosLanche.XBurger
import ProdutosLanche.XSalada
import kotlin.system.exitProcess

class Menu() {
    val utilitaria = Utilitaria("", 0.0, 0.0, 0)
    private val xBurger = XBurger()
    private val xSalada = XSalada()
    private val suco = Suco()
    private val refri = Refrigerante()

    init {
        println("|================= Bem vindo ao sistema de FastFood - SimCity ================|")
    }

    fun opcaoMenu() {

        println("|======* Digite a op??o, informando qual produto deseja comprar *==========|")
        println("|------------------- 1 - Lanches ------------------------------------------|")
        println("|------------------- 2 - Bebidas ------------------------------------------|")
        println("|------------------- 3 - Mostrar total de itens ---------------------------|")
        println("|------------------- 4 - Sair ---------------------------------------------|")


        try {

            do {
                when (readln().toInt()) {
                    1 -> opcaoLanches()
                    2 -> opcaoBebidas()
                    3 -> {
                        println("|=================Total de itens no Carricho ================|")
                        utilitaria.mostrarItens()
                        adicionairMaisItens()
                    }

                    4 -> {
                        println("Obrigada por utilizar nosso sistema! :D")
                        exitProcess(0)
                    }
                    else -> println(MSG_OPCAOINVALIDA)
                }

            } while (true)


        } catch (ex: NumberFormatException) {
            println(MSG_STRING_INVALIDA)
            opcaoMenu()

        }
    }


    private fun opcaoLanches() {

        println("|--------------------- Digite a op??o Desejada -------------------------------|")
        println("|---------------------  1 - X-Burguer R$ 10,00 -------------------------------|")
        println("|---------------------  2 - X-Salada  R$ 12,00 -------------------------------|")
        println("|---------------------  3 - Voltar ao Menu -----------------------------------|")



        try {

            when (readln().toInt()) {
                1 -> {

                    xBurger.informarQuantidadeXBurguer(MSG_QUANTIDADE, xBurger)
                    utilitaria.gerarCarrinhoProdutos(xBurger)
                    opcaoLanches()
                }

                2 -> {
                    xSalada.informarQuantidadeSalada(MSG_QUANTIDADE, xSalada)
                    utilitaria.gerarCarrinhoProdutos(xSalada)
                    opcaoLanches()
                }
                3 -> opcaoMenu()


                else -> println(MSG_OPCAOINVALIDA)
            }

        } catch (ex: NumberFormatException) {
            println(MSG_STRING_INVALIDA)
            opcaoLanches()
        }
    }

    private fun opcaoBebidas() {

        println("|--------------------- Digite a op??o Desejada  ------------------------------|")
        println("|---------------------  1- Refrigerante R$ 10,00 -----------------------------|")
        println("|---------------------  2 - Suco        R$ 12,00 -----------------------------|")
        println("|---------------------  3 - Voltar ao Menu -----------------------------------|")
        try {

            when (readln().toInt()) {
                1 -> {
                    refri.informarQuantidadeRefri(MSG_QUANTIDADE, refri)
                    utilitaria.gerarCarrinhoProdutos(refri)
                    opcaoBebidas()
                }

                2 -> {
                    suco.informarQuantidadeSuco(MSG_QUANTIDADE, suco)
                    utilitaria.gerarCarrinhoProdutos(suco)
                    opcaoBebidas()
                }
                3 -> opcaoMenu()


                else -> println(MSG_OPCAOINVALIDA)
            }

        } catch (ex: NumberFormatException) {
            println(MSG_STRING_INVALIDA)
        }
    }

    private fun adicionairMaisItens() {

        println(" ---------------  1 - Incluir mais itens -----------------------------------|")
        println(" ---------------  2 - Remover itens ----------------------------------------|")
        println(" ---------------  3 - Voltar ao menu ---------------------------------------|")
        try {
            do {
                when (readln().toInt()) {
                    1 -> {
                        opcaoMenu()
                    }

                    2 -> {
                        utilitaria.removerItens(MSG_CODIGO_PRODUTO)
                        utilitaria.mostrarItens()
                        adicionairMaisItens()
                    }

                    3 -> opcaoMenu()

                    else -> println(MSG_OPCAOINVALIDA)
                }
            }while (true)


        } catch (ex: NumberFormatException) {
            println(MSG_STRING_INVALIDA)
        }
    }

}





