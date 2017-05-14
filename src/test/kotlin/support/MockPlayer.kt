package support

import blackjack.Card
import blackjack.Player

class MockPlayer : Player {
    private var received = false

    override fun receive(cards: List<Card>) {
        received = true
    }

    fun wasReceived(): Boolean {
        return received
    }
}
