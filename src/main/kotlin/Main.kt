import java.util.Scanner

fun somar(numero: Int, onumero: Int) : Int{
    var resultado = numero + onumero
    return(resultado)
}

fun subtrair(numero: Int, onumero: Int) : Int{
    var resultado = numero - onumero
    return(resultado)
}

fun dividir(numero: Int, onumero: Int) : Int{
    var resultado = 0

    if(onumero != 0){
        var resultado = numero / onumero
    }else{
        println("Nao e possivel dividir por zero")
    }
    return(resultado)
}

fun multiplicar(numero: Int, onumero: Int) : Int{
    var resultado = numero * onumero
    return(resultado)
}

fun main() {
    var continuar = "S"

    while(continuar == "S"){
        println("Escolha a operacao desejada\n")
        println("SO = SOMAR\nSU = SUBTRAIR\nDI = DIVIDIR\nMU = MULTIPLICAR\n")
        var operacao = readln().uppercase()
        val scanner = Scanner(System.`in`)

        println("Digite o primeiro numero")
        var numeroUm:Int = scanner.nextInt()

        println("Digite o segundo numero")
        var numeroDois:Int = scanner.nextInt()

        if(operacao == "SO"){
            var x = somar(numeroUm,numeroDois)
            println(x)
        } else if(operacao == "SU"){
            var x = subtrair(numeroUm,numeroDois)
            println(x)
        } else if(operacao == "DI"){
            var x = dividir(numeroUm,numeroDois)
            println(x)
        } else if(operacao == "MU"){
            var x = multiplicar(numeroUm,numeroDois)
            println(x)
        } else{
            println("Operacao invalida")
        }

        println("Deseja continuar? Digite S ou N")
        continuar = readln().uppercase()
    }

    println("Finalizando calculadora")
}