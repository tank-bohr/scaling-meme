package blackjack

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

/**
 * Created by xoma on 15/05/2017.
 */
class CardTests: Spek({
    describe("value") {
        it("returns a value") {
            val card = Card(rank = Rank.SEVEN, suit = Suit.SPADES)
            assertEquals(7, card.value)
        }
    }
})
