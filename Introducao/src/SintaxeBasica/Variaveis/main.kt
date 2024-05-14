package SintaxeBasica.Variaveis

fun main(){
    //Uma vez que você atribui um valor a uma variável imutável, não pode atribuir outro valor a ela.
    val nome: String = "João"
    val idade: Int = 30

    //Você pode declarar variáveis que podem armazenar valores nulos usando o Operador ?
    var endereco: String? = null // Variável mutável anulável
    val telefone: Int? = null // Variável imutável anulável

    //Você pode atribuir valores diferentes a uma variável mutável ao longo do tempo.
    var saldo = 100.0
    saldo = 150.0 // Você pode reatribuir um novo valor a uma variável mutável

    //Em Kotlin, o compilador pode inferir automaticamente o tipo da variável se o tipo for óbvio a partir do contexto.
    val sobrenome = "Silva" // O tipo String é inferido automaticamente
    var altura = 1.75 // O tipo Double é inferido automaticamente

    println(nome)
    println(sobrenome)
    println(altura)
    println(idade)
    println(endereco)
    println(telefone)
    println(saldo)

}