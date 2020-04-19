var greeting: String? = null
fun main() {
    greeting = "hello"
    when (greeting) {
        null -> println("hi")
        else -> println(greeting)
        // else works like defaults block of enum
    }


}