package blackjack

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class RankTests : Spek({
    describe("value") {
        it("returns value of rank") {
            val ace = Rank.ACE
            val king = Rank.KING
            val seven = Rank.SEVEN
            assertEquals(11, ace.value())
            assertEquals(10, king.value())
            assertEquals(7, seven.value())
        }
    }
})
