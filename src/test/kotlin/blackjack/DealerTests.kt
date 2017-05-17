package blackjack

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import support.MockPlayer
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DealerTests : Spek({
    describe("dealTo") {
        it("deals cards for player") {
            val dealer = Dealer(shoe = Shoe())
            val player = MockPlayer()
            dealer.dealTo(player)
            assertTrue(player.wasReceived())
        }
    }

    describe("total") {
        it("is 0 at the beginning") {
            val dealer = Dealer(shoe = Shoe())
            assertEquals(0, dealer.total)
        }
    }

    describe("dealSelf") {
        it("deals cards for himself") {
            val dealer = Dealer(shoe = Shoe())
            dealer.dealSelf()
            assertTrue { dealer.total > 0 }
        }
    }
})
