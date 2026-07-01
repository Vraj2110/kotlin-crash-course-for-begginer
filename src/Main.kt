//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
println("Enter a number:")
    val input = readln()
    val inputasInteger = input.toIntOrNull()

    if (inputasInteger != null){
        val IsEven = inputasInteger % 2 == 0

        if (IsEven){
            println("The Number Is Even")
        }else{
            println("The Number is Odd")
        }
    }else{
        println("Invalid Input Enter a Integer")
    }
}