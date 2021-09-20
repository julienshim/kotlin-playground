fun main() {
    var wholeNumber: Int = 3 // val cannot be reassigned
    // val bigNumber = 3L // Long (64-bit) vs Integer (32-bit)
    // val preciseDecimal = 3.33 // Double (More precise and therefore more memory than Float
    // val decimal = 3.33f // Float
    // val iLoveVegetables = false // Boolean
    // val iLovePizza = true
    // val iAmALetter = 'a'
    // Don't need to declare Int
    println("The value of x is $wholeNumber")
    wholeNumber = 4
    println("The value of x is now $wholeNumber")
}