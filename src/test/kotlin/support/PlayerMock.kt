package support

import blackjack.Card
import blackjack.Player

/**
 * Created by xoma on 15/05/2017.
 */


class PlayerMock : Player {
    var receivedCard : Card? = null

    override fun receive(card: Card) {
        receivedCard = card
    }

    fun wasReceived(card: Card): Boolean {
        return receivedCard == card
    }
}
