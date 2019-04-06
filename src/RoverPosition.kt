class RoverPosition(var xPosition: Int, var yPosition: Int, var cardinalDirection: CardinalDirection) {
    fun move(direction: Char):RoverPosition{
        when(direction) {
            'L' ->
                cardinalDirection = cardinalDirection.left()
            'R' ->
                cardinalDirection = cardinalDirection.right()
            'M' ->
                when(cardinalDirection.cardinalDirection) {
                    'N' -> yPosition +=1
                    'E' -> xPosition +=1
                    'S' -> yPosition -= 1
                    'W' -> xPosition -=1
                }
        }
        return RoverPosition(xPosition, yPosition, cardinalDirection)
    }

    fun getPosition():String{
        return "$xPosition $yPosition ${cardinalDirection.cardinalDirection}"
    }
}