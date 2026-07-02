//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Enter a number:")
    val input = readln()
    throw Exception("Dude wtf did u pass there?")
    val inputasInteger = try {

        input.toInt()
    }catch (e:NumberFormatException){
        0
    }


        val output = when(inputasInteger){
            null -> "Enter The Valid Number"
            5 -> "this is a five!"
            3 -> "This is a three!"
            in 10..30 -> "This Number Is Between 10 to 30"
             1 -> "This Number Is Smallest"
            else -> "i dont know what to print"
            }
        println(output)
    }