fun main() {
    val alphabet = 'a'..'z'
    val input = readln().first()
    for (letter in alphabet) {
        if (letter == input) {
            return
        }
        print(letter)

    }
}