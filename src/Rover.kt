class Rover(var roverPosition: RoverPosition) {
    fun move(sequence: String) {
        roverPosition = sequence.fold(roverPosition) {acc: RoverPosition, c: Char -> acc.move(c) }
    }

    fun getPosition():String{
        return roverPosition.getPosition()
    }
}