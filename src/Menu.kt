import ProdutoBebidas.Refrigerante
import ProdutoBebidas.Suco
import ProdutosLanche.XBurger
import ProdutosLanche.XSalada
import kotlin.system.exitProcess

class Menu {

    private val xBurger = XBurger()
    private val xSalada = XSalada()
    private val suco = Suco()
    private val refri = Refrigerante()

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
                    1 ->  opcaoLanches()
                    2 -> opcaoBebidas()
                    3 ->{
                        xBurger.mostrarItens()
                        xSalada.mostrarItens()
                        refri.mostrarItens()
                        suco.mostrarItens()
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


    fun opcaoLanches() {

        println("|--------------------- Digite a opção Desejada -------------------------------|")
        println("|---------------------  1 - X-Burguer R$ 10,00 -------------------------------|")
        println("|---------------------  2 - X-Salada  R$ 12,00 -------------------------------|")
        println("|---------------------  3 - Voltar ao Menu -----------------------------------|")



        try {

            when (readln().toInt()) {
                1 -> {

                    xBurger.informarQuantidade(MSG_QUANTIDADE)
                    opcaoLanches()
                }

                2 -> {
                    xSalada.informarQuantidade(MSG_QUANTIDADE)
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

    fun opcaoBebidas() {

        println("|--------------------- Digite a opção Desejada  ------------------------------|")
        println("|---------------------  1- Refrigerante R$ 10,00 -----------------------------|")
        println("|---------------------  2 - Suco        R$ 12,00 -----------------------------|")
        println("|---------------------  3 - Voltar ao Menu -----------------------------------|")
        try {

            when (readln().toInt()) {
                1 -> {

                    refri.informarQuantidade(MSG_QUANTIDADE)
                    opcaoBebidas()
                }

                2 -> {
                    suco.informarQuantidade(MSG_QUANTIDADE)
                    opcaoBebidas()
                }
                3 -> opcaoMenu()


                else -> println(MSG_OPCAOINVALIDA)
            }

        } catch (ex: NumberFormatException) {
            println(MSG_STRING_INVALIDA)
        }
    }

    fun adicionairMaisItens() {

        println(" ---------------  1 - Incluir mais itens -----------------------------------|")
        println(" ---------------  2 - Editar um item ---------------------------------------|")
        println(" ---------------  3 - Remover itens ----------------------------------------|")
        try {

            when (readln().toInt()) {
                1 -> {
                    opcaoMenu()
                }

                2 -> {

                }

                3 -> {

                }

                else -> println(MSG_OPCAOINVALIDA)
            }

        } catch (ex: NumberFormatException) {
            println(MSG_STRING_INVALIDA)
        }
    }



    }





