package blackjack

import java.util.*

/**
 * Created by xoma on 15/05/2017.
 */

class Shoe() : Takable {
    override fun take(): Card {
        return deck.removeAt(0)
    }

    private val deck: MutableList<Card> = generate()

    private fun generate(): MutableList<Card> {
        return Suit.values()
                .flatMap { suit -> Rank.values().map { rank -> Card(rank, suit) } }
                .toMutableList()
                .also(Collections::shuffle)

    }
}
