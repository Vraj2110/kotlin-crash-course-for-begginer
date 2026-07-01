//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Enter a number:")
    val input = readln()
    val inputasInteger = input.toIntOrNull()

    if (inputasInteger != null) {
        val output = when{
            inputasInteger % 2 == 0 -> "The Number Is Even\n"
            else -> "The Number Is Odd\n"
            }
        println(output)
        }else{
            println("Enter The Valid Value")
    }
    }