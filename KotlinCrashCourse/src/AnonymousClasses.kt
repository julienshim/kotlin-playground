fun main() {
    var bear = object : Animal("Bear") {
        override fun makeSound() {
            println("RAWR!")
        }
    }
    bear.makeSound()
}