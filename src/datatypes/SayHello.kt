package datatypes


fun sayHello(greeting: String, greetingTexts: List<String>) {
    greetingTexts.forEach { greetingText ->
        println("$greeting $greetingText")
    }
}


fun main() {
    sayHello("Hello", listOf("Kotlin", "Java"))


}