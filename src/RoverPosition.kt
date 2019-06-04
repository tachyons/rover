class RoverPosition(var xPosition: Int, var yPosition: Int, var cardinalDirection: CardinalDirection) {
    fun move(direction: Char):RoverPosition{
        when(direction) {
            'L' ->
                cardinalDirection = cardinalDirection.left()
            'R' ->
                cardinalDirection = cardinalDirection.right()
            'M' ->
                updateCoordinates()

        }
        return RoverPosition(xPosition, yPosition, cardinalDirection)
    }

    fun getPosition():String{
        return "$xPosition $yPosition ${cardinalDirection.cardinalDirection}"
    }

    private fun updateCoordinates(){
        when(cardinalDirection.cardinalDirection) {
            'N' -> yPosition +=1
            'E' -> xPosition +=1
            'S' -> yPosition -= 1
            'W' -> xPosition -=1
        }
    }
}