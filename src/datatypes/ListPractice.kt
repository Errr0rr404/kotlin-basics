package datatypes

fun main() {
    val laptopBrands = listOf("Apple", "Asus", "HP")
    println(laptopBrands.get(0))
    println(laptopBrands[1])

    laptopBrands.forEach { laptopBrand ->
        println(laptopBrand)

    }

}