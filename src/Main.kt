//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
println("Enter a number:")
    val input = readln()
    val inputasInteger = input.toIntOrNull()?.rem(2)?.equals(0)


    println("Is Number Even  $inputasInteger")

}