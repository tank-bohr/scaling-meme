package blackjack

data class Card(val rank: Rank, val suit: Suit) {
    val value = rank.value()
}
