class RoverPosition(var xPosition: Int, var yPosition: Int, var cardinalDirection: Char) {
     companion object {
         var directions = listOf('N','E','S','W')

     }
    fun move(direction: Char):RoverPosition{
        when(direction) {
            'L' ->
                cardinalDirection = leftDirection()
            'R' ->
                cardinalDirection = rightDirection()
            'M' ->
                when(cardinalDirection) {
                    'N' -> yPosition +=1
                    'E' -> xPosition +=1
                    'S' -> yPosition -= 1
                    'W' -> xPosition -=1
                }
        }
        return RoverPosition(xPosition, yPosition, cardinalDirection)
    }

    fun getPosition():String{
        return "$xPosition $yPosition $cardinalDirection"
    }

    private fun leftDirection(): Char {
        if (cardinalDirection == directions.first()) {
            return directions.last()
        }else {
            return directions[directions.indexOf(cardinalDirection) - 1]
        }
    }

    private fun rightDirection(): Char {
        if (cardinalDirection == directions.last()) {
            return directions.first()
        }else {
            return directions[directions.indexOf(cardinalDirection) + 1]
        }
    }
}