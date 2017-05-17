package blackjack

/**
 * Created by xoma on 15/05/2017.
 */
data class Card(val rank: Rank, val suit: Suit) {
    val value = rank.value
}
