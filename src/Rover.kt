fun main() {
    val x = 5
    val y = 5
    val rover1 = RoverPosition(1,2,'N')
    val rover2 = RoverPosition(3,3,'E')

    println(getCurrentPosition(rover1,"LMLMLMLMM"))
    println(getCurrentPosition(rover2,"MMRMMRMRRM"))
}

fun getCurrentPosition(rover: RoverPosition, sequence: String):String{
    return sequence.fold(rover) {acc: RoverPosition, c: Char -> acc.move(c) }.getPosition()
}
