fun main() {
    val list = listOf("Kotlin", "is", "fun")
//    val count = list.count { currentString ->
//        currentString.length == 3
//    }
    val count = list.customCount { currentString ->
        currentString.length >= 3
    }
    println(count)
}

fun <T> List<T>.customCount(function: (T) -> Boolean): Int { // T = any type
    var counter = 0
    for(string in this) {
        if(function(string)) {
            counter++
        }
    }
    return counter
}