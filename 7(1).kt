import kotlin.math.*

fun main(){
    try {
        println("введите x")
        var x = readln()!!.toDouble()
        println("введите y")
        var y = readln()!!.toDouble()
        var y1 = y.toDouble().pow(1/3.toDouble())
        println("введите z")
        var z = readln()!!.toDouble()
        var a = (sqrt((abs(x-1))- abs(y1))) / (1+(x.pow(2)/2)+(y.pow(2)/4))
        var b = x*(atan(z)+ E.pow(-(x+3)))
        println("a = ${a}; b = ${b}")
    }catch (e:Exception){println("неверный формат")}
}