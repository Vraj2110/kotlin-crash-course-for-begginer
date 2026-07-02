fun main() {
    val input = readln()
    val userinput = input.toIntOrNull()
    val favNumbers = intArrayOf(1, 21, 22, 3, 4, 5)
    if (userinput != null) {

        println("Your Number iS ${favNumbers[userinput]}")

    }
}