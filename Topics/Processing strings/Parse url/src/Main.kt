fun main() {
    val input = readln()
    gracefulPotato(input)

}

fun gracefulPotato(string: String) {
    val normas = string.substringAfter('?')
    val list = normas.split('&')
    var password = ""
    for (i in list) {
        val pair = i.split('=')
        val value = if (pair[1].isEmpty()) {
            "not found"
        } else {
            pair[1]
        }
        println("${pair[0]} : $value")
        if (pair[0] == "pass") {
            password = "password : ${pair[1]}"
        }
    }
    if (string.contains("pass")) {
        println(password)
    }

}
