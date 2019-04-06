fun main() {
    val plateau = Plateau(5, 5)
    val roverPostition1 = RoverPosition(1,2,CardinalDirection('N'))
    val roverPosition2 = RoverPosition(3,3,CardinalDirection('E'))

    val rover1 = Rover(roverPostition1)
    rover1.move("LMLMLMLMM")

    var rover2 = Rover(roverPosition2)
    rover2.move("MMRMMRMRRM")

    println(rover1.getPosition())
    println(rover2.getPosition())

}
