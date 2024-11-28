fun main() {
    val rows = (1..5).toMutableList()
    val columns = (1..5).toMutableList()
    for (i in 1..3) {
        val (x, y) = readln().split(" ")
        rows.remove(x.toInt())
        columns.remove(y.toInt())
    }

    println(rows.joinToString(" "))
    println(columns.joinToString(" "))
}

//_ _ _ x _
//x _ _ _ _
//_ x _ _ _
//_ _ _ _ _
//_ _ _ _ _