fun main(){
    try{
        println("введите первый член прогрессии")
        var a = readln()!!.toInt() //первый член прогрессии
        println("введите второй член прогрессии")
        var b = readln()!!.toInt() //второй член прогрессии
        println("введите номер искомого члена прогрессии")
        var n = readln()!!.toInt() // номер искомого члена прогрессии
        var d = b - a
        var an = a + (n-1)*d
        var sn = (n/2)*(2*a+(n-1)*d)
        println ("Член прогрессии с номером ${n}: ${an}")
        println ("Сумма ${n} членов прогрессии: ${sn}")
    } catch (e:Exception){println("неверный формат")}
}