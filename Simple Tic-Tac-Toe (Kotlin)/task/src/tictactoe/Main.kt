package tictactoe

val list = mutableListOf(mutableListOf(' ', ' ', ' '), mutableListOf(' ', ' ', ' '), mutableListOf(' ', ' ', ' '))
fun main() {

    showGrid()
    while (gameResult(winCondition(list.joinToString("") { it.joinToString("") }))) {
        addNewChar()
        showGrid()
    }
}

fun showGrid() {
    println("---------")
    println("| ${list[0][0]} ${list[0][1]} ${list[0][2]} |")
    println("| ${list[1][0]} ${list[1][1]} ${list[1][2]} |")
    println("| ${list[2][0]} ${list[2][1]} ${list[2][2]} |")
    println("---------")
}

fun addNewChar() {
    val x = readln()
    val symbolsOnGrid = (list.joinToString("") { it.joinToString("") }).count{it == ' '}
    try {
        if (x.length < 2) {
            throw Exception()
        }
        var coordinate = list[x.first().digitToInt() - 1][x.last().digitToInt() - 1]
        if (coordinate == ' ') {
            when {
                symbolsOnGrid % 2 == 0 -> list[x.first().digitToInt() - 1][x.last().digitToInt() - 1] = 'O'
                else -> list[x.first().digitToInt() - 1][x.last().digitToInt() - 1] = 'X'
            }
        } else {
            println("This cell is occupied! Choose another one!")
            addNewChar()
        }
    } catch (e: IndexOutOfBoundsException) {
        println("Coordinates should be from 1 to 3!")
        addNewChar()
    }
    catch (e: Exception) {
        println("You should enter numbers!")
        addNewChar()
    }
}

fun winCondition(string: String): Char {
    var x = ' '

    for (n in 0..2) {
        if (string[n] == string[n + 3] && string[n + 3] == string[n + 6]) {
            when {
                string[n] == 'X' -> x = 'X'
                string[n] == 'O' -> x == 'O'
            }
        }
    }

    val list = string.chunked(3)
    for (l in list) {
        when (l) {
            "XXX" -> x = 'X'
            "OOO" -> x = 'O'
        }
    }

    when {
        string[0] == string[4] && string[4] == string[8] && string[0] in "XO" -> return string[0]
        string[2] == string[4] && string[4] == string[6] && string[2] in "XO" -> return string[2]
    }

    if (x == 'X') return 'X'

    return if (string.contains(' ')) {
        'n'
    } else {
        'd'
    }
}

fun gameResult(c: Char): Boolean {
    when (c) {
        'X' -> println("X wins")
        'O' -> println("O wins")
        'd' -> println("Draw")
    }
    return c == 'n'
}
