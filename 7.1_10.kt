import kotlin.math.*
fun main(){
try {
    println("введите R")
    var R = readln()!!.toDouble()
    println("введите r")
    var r = readln()!!.toDouble()
    println("введите h")
    var h = readln()!!.toDouble()
    if(R>r){
        var v = (1/3) * PI * (R.pow(2) + r.pow(2) + R * r) * h
        var l = sqrt(h.pow(2) + (R - r).pow(2))
        var s = PI * (R + r) * l + PI * R.pow(2) + PI * r.pow(2)
        println("S = ${String.format("%.2f",s)}; V = ${String.format("%.2f",v)}; l = ${String.format("%.2f",l)}")
    }
    else println("радиус нижнего основания (R) не может быть меньше радиуса верхнего основания (r)")
} catch (e:Exception){println("неверный формат")}
}