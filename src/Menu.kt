import kotlin.system.exitProcess

class Menu {

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

        println("|--------------------- Digite a opção Desejada  ------------------------------|")
        println("|--------------------- 01 - X-Burguer R$ 10,00  ------------------------------|")
        println("|--------------------- 02 - X-Salada  R$ 12,00  ------------------------------|")

    }

    fun opcaoBebidas() {

        println("|--------------------- Digite a opção Desejada  ------------------------------|")
        println("|--------------------- 01-Refrige R$ 10,00  ------------------------------|")
        println("|--------------------- 02 -Salada  R$ 12,00  ------------------------------|")
    }

    fun adicionairMaisItens(){
        println(" ---------------Deseja Adicionar mais itens? ------------------------------|")
    }


    fun OpcaoMenu() {

        try {

            do {

                when (readln().toInt()) {
                    1 -> {
                        opcaoBebidas()
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