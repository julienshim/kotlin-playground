fun main() {
    val shoppingList = mutableListOf("Lamborghini", "PentHouse", "Rolex")
    shoppingList.add("Ferrari")

    for(shoppingItem in shoppingList) {
        println(shoppingItem)
    }

    for(i in 1..100) {
        println(i)
    }
}