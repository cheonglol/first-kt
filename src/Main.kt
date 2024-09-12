import kotlin.random.Random
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val name: String = try {
        args[0]
    } catch (e: Exception) {
        println(e)
        println("did not find args[0] - exiting program with exitcode 1")
        exitProcess(1)

    }
    println("Hello, " + name + "!")

    for (i: Int in 1..5) {
        val randomInt: Double = Random.nextDouble(from = 1.0, until = 100.0)
        val product: Double = i * randomInt
        println("i = $i | (Random Value)$randomInt * $i, \ngives product of $product\n")
    }
    println("\n")

    print("Creating a mutableList<String>... Add the first item\n")
    val input: String = readln()
    if (input.equals("")) println("no input received, skipping this part of the code")
    else {
        appendMutableListOfString(input)
    }
}

fun appendMutableListOfString(initialValue: String): MutableList<String> {
    val stringStore: MutableList<String> = mutableListOf(initialValue)
    printLineOfMutableListOfString(stringStore)
    while (true) {
        val input: String = getStringFromReadline(null)
        if (input.equals("")) {
            break
        }
        stringStore.add(input)
        printLineOfMutableListOfString(stringStore)
    }
    printLineOfMutableListOfString(stringStore)
    return stringStore
}

fun getStringFromReadline(lineMessage: String?): String {
    println("(Enter with an empty line to stop adding)")
    if (lineMessage != null) println(lineMessage + "\n")
    val input = readLine() ?: ""
    return input
}

fun printLineOfMutableListOfString(stringStore: MutableList<String>): Unit {
    println("[")
    for (s: String in stringStore) println("\t\"$s\",")
    println("]")
}