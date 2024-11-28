import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val customNumber = scanner.nextInt()
    val result = customNumber / 2
    println("The obtained value is $customNumber and its Int representation after division by 2 is $result")
}