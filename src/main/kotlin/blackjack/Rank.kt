package blackjack

enum class Rank {
    ACE, KING, QUEEN, JACK,
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN;

    fun value(): Int = when(this) {
        ACE -> 11
        KING, QUEEN, JACK, TEN -> 10
        TWO -> 2
        THREE -> 3
        FOUR -> 4
        FIVE -> 5
        SIX -> 6
        SEVEN -> 7
        EIGHT -> 8
        NINE -> 9
    }
}
