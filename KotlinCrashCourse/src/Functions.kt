fun main() {
//    print10Numbers()
//    val x = isEven(5)
//    val x = isEven()
    val x = isEven(number = 5)
    val y = 3
    println(x)
    println(y.isOdd())
}

fun Int.isOdd(): Boolean {
    return this % 2 === 1
}

fun isEven(number: Int = 10): Boolean { // default number 10
    return number % 2 == 0
}

fun print10Numbers() {
    for(i in 1..10) {
        println(i)
    }
}