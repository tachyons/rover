class CardinalDirection(val cardinalDirection: Char) {
    companion object {
        var directions = listOf('N','E','S','W')
    }
    fun left():CardinalDirection{
        return if (cardinalDirection == directions.first()) {
            CardinalDirection(directions.last())
        }else {
            CardinalDirection(directions[directions.indexOf(cardinalDirection) - 1])
        }
    }

    fun right():CardinalDirection{
        return if (cardinalDirection == directions.last()) {
            CardinalDirection(directions.first())
        }else {
            CardinalDirection(directions[directions.indexOf(cardinalDirection) + 1])
        }
    }
}