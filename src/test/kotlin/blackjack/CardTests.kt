package blackjack

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class CardTests : Spek({
    describe("value") {
        it("is the same value as card's rank") {
            val card = Card(rank = Rank.SEVEN, suit = Suit.SPADES)
            assertEquals(7, card.value)
        }
    }
})
