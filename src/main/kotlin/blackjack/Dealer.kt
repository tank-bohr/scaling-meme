package blackjack

class Dealer(private val shoe: Shoe) {
    val total: Int
        get() = hand.fold(0) { acc, card -> acc + card.value }

    private var hand: MutableList<Card> = emptyList<Card>().toMutableList()

    fun dealTo(player: Player) {
        val card1 = shoe.checkout()
        val card2 = shoe.checkout()
        player.receive(listOf(card1, card2))
    }

    fun dealSelf() {
        val card = shoe.checkout()
        hand.add(card)
    }
}
