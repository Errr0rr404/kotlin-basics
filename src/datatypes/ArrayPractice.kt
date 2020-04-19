package datatypes

fun main() {
    val languageNames = arrayOf("Kotlin", "Java", "Python")
    println(languageNames.size)
    println(languageNames.get(2))
    println(languageNames[2])

    // for loop
    println("***")
    for (languageName in languageNames) {
        println(languageName)
    }

// for each without index
    println("***")
    languageNames.forEach {
        println(it)
    }

    println("***")
    languageNames.forEach { languageNames ->
        println(languageNames)
    }


    // with index
    println("***")
    languageNames.forEachIndexed { index, languageName ->
        println("$languageName $index")

    }

}