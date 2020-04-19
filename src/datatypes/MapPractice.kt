package datatypes

fun main() {
    val mapOfCity = mapOf(1 to "NY", 2 to "NJ", 3 to "VA")
    println(mapOfCity.get(1))
    println(mapOfCity[2])
    println("****")
    mapOfCity.forEach { key, value ->

        println("$key $value")
    }

}