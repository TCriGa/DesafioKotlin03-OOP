import ProdutosLanche.XBurger
import ProdutosLanche.XSalada
import kotlin.system.exitProcess

class Menu {

    val xBurger = XBurger()
    val xSalada = XSalada()

    init {
        println("|================= Bem vindo ao sistema de FastFood - SimCity ================|")
    }

    private fun menu() {

        println("|======* Digite a opção, informando qual produto deseja comprar *==========|")
        println("|------------------- 1 - Lanches ------------------------------------------|")
        println("|------------------- 2 - Bebidas ------------------------------------------|")
        println("|------------------- 3 - Sair ---------------------------------------------|")


    }


    fun opcaoLanches() {

        println("|--------------------- Digite a opção Desejada -------------------------------|")
        println("|--------------------- 01 - X-Burguer R$ 10,00 -------------------------------|")
        println("|--------------------- 02 - X-Salada  R$ 12,00 -------------------------------|")
        println("|--------------------- 03 - Quantidade Lanche  -------------------------------|")


        val opcao = readln().toInt()

        try {

                when (opcao) {
                    1 -> {
                        xBurger.informarQuantidade(MSG_Quantidade)
                        xBurger.adicionarItens()
                        opcaoLanches()


                    }

                    2 -> {
                        xSalada.informarQuantidade(MSG_Quantidade)
                        xSalada.adicionarItens()
                        opcaoLanches()


                    }

                    3 -> {
                        xBurger.mostrarItens()
                        xSalada.mostrarItens()
                    }

                    else -> println(MSG_OPCAOINVALIDA)




                }

        }catch (ex:NumberFormatException){
            println(MSG_STRING_INVALIDA)
        }
    }

    fun opcaoBebidas() {

        println("|--------------------- Digite a opção Desejada  ------------------------------|")
        println("|--------------------- 01-Refrige R$ 10,00  ------------------------------|")
        println("|--------------------- 02 -Salada  R$ 12,00  ------------------------------|")
    }

    fun adicionairMaisItens() {

        println(" --------------- 01 - Incluir mais itens ------------------------------|")
        println(" --------------- 02 - Editar um item ---------------------------------------|")
        println(" --------------- 03 - Remover itens ---------------------------------------|")


    }


    fun OpcaoMenu() {

        try {

            do {
                menu()
                when (readln().toInt()) {
                    1 -> {
                        opcaoLanches()
                    }
                    2 -> {
                        opcaoBebidas()
                    }

                    3 -> {
                        println("Obrigada por utilizar nosso sistema! :D")
                        exitProcess(0)
                    }
                }

            } while (true)


        } catch (ex: NumberFormatException) {
            println(MSG_STRING_INVALIDA)

        }
    }


}