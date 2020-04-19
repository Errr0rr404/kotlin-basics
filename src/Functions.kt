fun calculator(): Int {
    return 11
}

// single expression function
// fun getGreeting(): String = "Hello Kotlin"
// return type can be removed as compiler picks up the datatype automatic based on the data injected
fun getGreeting() = "Hello Kotlin"


// Unit --> absence of anything --like void method
// we can also remove the unit
fun printCalculator(): Unit {
    println(calculator())
    println(getGreeting())
}


fun main() {
    printCalculator()

}