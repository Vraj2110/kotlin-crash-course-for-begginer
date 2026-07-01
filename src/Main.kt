//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
println("Enter a number:")
    val input = readln()
    val inputasInteger = input.toIntOrNull()

    if (inputasInteger != null){
        val output =  if(inputasInteger % 2 == 0){
            "The Number Is Even!"
        }else{
            "The Number Is Odd!"
        }
        println(output)
    }else{
        println("Invalid Input Enter a Integer")
    }
}