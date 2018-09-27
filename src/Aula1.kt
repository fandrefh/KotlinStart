fun main(args: Array<String>) {
    var myList: List<String> = listOf()
    myList += "American 1"
    myList += "American 2"
    myList += "American 3"
    myList += "American 4"
    myList += "america Francisco André"

    val newList = myList.asSequence().mapIndexed { index, obj ->
        if (obj.contains("American 1")) {
            "American 666"
        } else {
            obj
        }
    }.toList()

    myList.map { println(it) }

    println()

    newList.map { println(it) }

    println()

    val listAmericans3 = myList.filter { it.contains("3") }

    listAmericans3.map { println(it) }

    println()

    val listAmericans = myList.filter { it.contains("A") && it.contains("2") || it.contains("3")}

    listAmericans.map { println(it) }
}