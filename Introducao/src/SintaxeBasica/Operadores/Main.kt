package SintaxeBasica.Operadores

fun main() {
    //operadores : + - * / %  Aritméticos
    var a = 20
    var b = 30
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a.times(b)))
    println("a + b = " + (a.rem(b)))
    println("a + b = " + (a / b))

    //Operadores Relacionais
    println(a > b)
    println(a < b)
    println(a == b)
    println(a >= b)
    println(a <= b)
    println(a != b)

    //Operadores Lógicos
    var x = 100
    var y = 25
    var z = 10
    var result = false
    if (x > y && x > z)
        println(x)
    if (x < y || x > z)
        println(y)
    if (result.not())
        println("Logical operators")


}