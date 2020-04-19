/*fun sayHello(itemToGreet:String){
   // println("Hello "+itemToGreet)
    println("Hello $itemToGreet")
    // works the same
}*/

fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")


fun main() {
    sayHello("Hello", "World")
    sayHello("Hello", "Kotlin")
}