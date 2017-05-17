package blackjack

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import support.PlayerMock
import support.ShoeStub
import kotlin.test.assertTrue

/**
 * Created by xoma on 15/05/2017.
 */


class DealerTests : Spek({
    describe("deal") {
        it("deals") {
            val card = Card(Rank.ACE, Suit.SPADES)
            val shoe = ShoeStub(card)
            val dealer = Dealer(shoe)
            val player = PlayerMock()
            dealer.deal(player)
            assertTrue { player.wasReceived(card) }
        }
    }
})
