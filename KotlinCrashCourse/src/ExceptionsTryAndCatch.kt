fun main() {
    val number = readLine() ?: "0"
    val parsedNumber = try {
        number.toInt()
    } catch(e: Exception) { // make sure to select Kotlin the first time or undo
        0
    }
    println(parsedNumber)
}