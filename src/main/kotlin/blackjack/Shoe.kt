package blackjack

class Shoe {

    private val cards = generate()

    fun checkout(): Card {
        return cards.removeAt(0)
    }

    private fun generate(): MutableList<Card> {
        return deck().toMutableList()
    }

    private fun deck(): List<Card> {
        return Suit.values()
                .flatMap { suit -> Rank.values().map { rank -> Card(rank, suit) } }
    }
}
