fun main() {
    val input = readln()
    var sumOfFirst = 0
    var sumOfLast = 0
    for (i in input.indices) {
        when (i) {
            in 0..2 -> sumOfFirst += input[i].toString().toInt()
            in 3..5 -> sumOfLast += input[i].toString().toInt()
        }
    }
    println(if (sumOfFirst == sumOfLast) "Lucky" else "Regular")
}