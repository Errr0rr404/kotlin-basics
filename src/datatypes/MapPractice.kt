package datatypes

fun main() {
    val mapOfCity = mapOf(1 to "NY", 2 to "NJ", 3 to "VA")
    println(mapOfCity.get(1))
    println(mapOfCity[2])
    println("****")
    mapOfCity.forEach { key, value ->
        println("$key $value")
    }


    // by defaults a collection type in kotlin is immutable
    //mutable map-->allows you to modify


    val mapOfZip = mutableMapOf(11374 to "Rego Park", 33245 to "Alexandria")
    mapOfZip.put(22342, "California")
    println(mapOfZip)
}