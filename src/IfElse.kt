var data: String? = null

fun main() {
    //data="Hello"
    val greetinToPrint = if (data != null) data else "HI"
    println(greetinToPrint)

    //using when
    val greetingToPrint = when (data) {
        null -> "Hey"
        else -> greeting
    }
    println(greetingToPrint)

}