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

    for (i in 1..5) {
        println("i = $i")
    }
}
