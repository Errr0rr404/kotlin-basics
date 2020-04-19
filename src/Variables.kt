//top level/local variables
var company: String = "world-of-automation"

var year: String? = "2020"
//types in kotlin is never null
// providing ? after type makes the variable as nullable

fun main() {
    // var can be mutated
    // val can not be mutated
    val id: Int = 1
    var name: String = "Zan"
    println(name)
    name = "Naim"
    println(name)
    println(id)
    println(company)

    println(year)
    year = null
    println(year)
    year = "2011"
    println(year)

    val laptop = "Mac"
    //pl --> println
    println(laptop)

    var laptopCompany: String? = null
    if (laptopCompany != null) {
        println(laptop)
    } else {
        laptopCompany = "apple"
        println(laptopCompany)
    }

}
