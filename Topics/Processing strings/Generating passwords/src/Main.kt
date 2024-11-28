fun main() {
    val input = readln()
    val requirements = input.split(' ')
    val listOfA = mutableListOf<Char>()
    val listOfC = mutableListOf<Char>()
    val listOfAll = mutableListOf<Char>()
    val password = mutableListOf<Char>()
    for (i in 'a'..'z') {
        listOfA.add(i)
        listOfAll.add(i)
        listOfAll.add(i.uppercaseChar())
    }

    for (i in '0'..'9') {
        listOfC.add(i)
        listOfAll.add(i)
    }

    for (a in 1..requirements[0].toInt()) {
        var letter: Char

        while (true) {
            letter = listOfA.random().uppercaseChar()
            if (password.isEmpty() || letter != password.last()) {
                password.add(letter)
                break
            }
        }
    }
    for (b in 1..requirements[1].toInt()) {
        var letter: Char
        while (true) {
            letter = listOfA.random()
            if (password.isEmpty() || letter != password.last()) {
                password.add(letter)
                break
            }
        }
    }

    for (c in 1..requirements[2].toInt()) {
        var letter: Char
        while (true) {
            letter = listOfC.random()
            if (password.isEmpty() || letter != password.last()) {
                password.add(letter)
                break
            }
        }
    }

    while (password.size < requirements[3].toInt()) {
        var letter: Char
        while (true) {
            letter = listOfAll.random()
            if (password.isEmpty() || letter != password.last()) {
                password.add(letter)
                break
            }
        }
    }


    println(password.joinToString(""))


}