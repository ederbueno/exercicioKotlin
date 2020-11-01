package br.com.edma

import javax.swing.text.StyledEditorKit

fun main() {

   /* val frase = "Hello World"
    println(frase)

    val num1 = 4
    val num2 = 5

     if(num1 > num2)
         println("é maior")
     else
         println("é menor")

    when {
        num1 > num2 -> print("é maior")
        else -> println("não é maior")
    }

    for (num in 1..10)
        println("contador: $num")


    var x = 2
    while(x > 0) {
        println("contador: $x")
        x--
    } */

    println(meuNome("Ederson", "Bueno"))
    println(numeroMaior(1,2,3))
    println(cadeiaTexto("eddy", "eddy"))
    numeroImpar(100)
    println(numeroPar(2))
    println(numerosInteiros(2,3,0, 2) )
    numeroPositivo(100)

}

//função nome
fun meuNome(nome:String, sobreNome:String) : String {
       return "$nome $sobreNome"
}

//função retornar número maior
fun numeroMaior(numero1:Int, numero2:Int, numero3:Int) : Int{
    return maxOf(numero1,numero2, numero3)
}

//função texto retorna true ou false
fun cadeiaTexto(texto1:String, texto2:String) : Boolean{

    if(texto1.equals(texto2))
        return false
    else
        return true
}

//Função preencha os 100 primeiros números impares
fun numeroImpar(numero : Int) {
     var i = 0
     while(i < numero){
      println(2*i + 1)
      i++
    }
}

//Função retorna verdadeiro se for par
fun numeroPar(numero : Int) : Boolean{

    if(numero % 2 != 0)
        return true
    else
        return false
}
//Função analisar números inteiros com condicional A maior que c e D && B maior que C ou D.
fun numerosInteiros(a:Int, b:Int, c:Int, d:Int) : Boolean{
    if(a>c && a>d || b > c && b> d)
        return true
    else
        return false
}
//Função imprime os 100 primeiros números positivos.
fun numeroPositivo(numero: Int) {
    var i = 1
    while(i <= numero){
        println(i++)
    }
}



