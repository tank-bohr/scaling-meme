package support

import blackjack.Card
import blackjack.Takable


/**
 * Created by xoma on 15/05/2017.
 */


class ShoeStub(val card: Card) : Takable{
    override fun take(): Card {
        return card
    }
}
