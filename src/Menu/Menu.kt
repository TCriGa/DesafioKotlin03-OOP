package Menu

import Classes.Utilitaria.Utilitaria.calcularPreco
import Classes.Utilitaria.Utilitaria.informarQuantidade
import Classes.Utilitaria.Utilitaria.listaqtdItens
import Classes.Utilitaria.Utilitaria.mostrarItens
import Classes.Utilitaria.Utilitaria.removerItens
import Interface.Produtos
import MSG_CODIGO_PRODUTO
import MSG_OPCAOINVALIDA
import MSG_QUANTIDADE
import MSG_STRING_INVALIDA
import ProdutoBebidas.Refrigerante
import ProdutoBebidas.Suco
import ProdutosLanche.XBurger
import ProdutosLanche.XSalada
import kotlin.system.exitProcess

class Menu {
    companion object menu {
        private var xBurger = XBurger()
        private var xSalada = XSalada()
        private var refri = Refrigerante()
        private var suco = Suco()

        init {
            println("|================= Bem vindo ao sistema de FastFood - SimCity ================|")
        }


        fun opcaoMenu() {

            println("|======* Digite a opção, informando qual produto deseja comprar *==========|")
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
                            mostrarItens()
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

            println("|--------------------- Digite a opção Desejada -------------------------------|")
            println("|---------------------  1 - X-Burguer R$ 10,00 -------------------------------|")
            println("|---------------------  2 - X-Salada  R$ 12,00 -------------------------------|")
            println("|---------------------  3 - Voltar ao Menu -----------------------------------|")



            try {

                when (readln().toInt()) {
                    1 -> {

                        informarQuantidade(MSG_QUANTIDADE, xBurger)
                        calcularPreco(xBurger)
                        opcaoLanches()
                    }

                    2 -> {
                        informarQuantidade(MSG_QUANTIDADE, xSalada)
                        calcularPreco(xSalada)
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

            println("|--------------------- Digite a opção Desejada  ------------------------------|")
            println("|---------------------  1- Refrigerante R$ 10,00 -----------------------------|")
            println("|---------------------  2 - Suco        R$ 12,00 -----------------------------|")
            println("|---------------------  3 - Voltar ao Menu -----------------------------------|")
            try {

                when (readln().toInt()) {
                    1 -> {
                        informarQuantidade(MSG_QUANTIDADE, refri)
                        calcularPreco(refri)
                        opcaoBebidas()
                    }

                    2 -> {
                        informarQuantidade(MSG_QUANTIDADE, suco)
                        calcularPreco(suco)
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
                            removerItens(MSG_CODIGO_PRODUTO)
                            mostrarItens()
                            adicionairMaisItens()
                        }

                        3 -> opcaoMenu()

                        else -> println(MSG_OPCAOINVALIDA)
                    }
                } while (true)


            } catch (ex: NumberFormatException) {
                println(MSG_STRING_INVALIDA)
            }
        }


    }
}





