fun main() {
    val input = readln()
    for (char in input) {
        if (char.isDigit()) {
            println(char)
            break
        }
    }
}