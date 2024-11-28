fun main() {
    val input = readln()
    for (i in 'a'..'z') {
        if (input.contains(i)) {
            continue
        }
        print(i)
    }
}