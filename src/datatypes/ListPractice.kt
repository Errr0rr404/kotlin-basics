package datatypes

fun main() {
    val laptopBrands = listOf("Apple", "Asus", "HP")
    println(laptopBrands.get(0))
    println(laptopBrands[1])

    laptopBrands.forEach { laptopBrand ->
        println(laptopBrand)

    }


    //mutable list
    val guitarBrands = mutableListOf("Fender", "Charvel")
    guitarBrands.add("Jackson")
    println(guitarBrands.get(2))

}