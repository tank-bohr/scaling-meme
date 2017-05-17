package blackjack

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class RankTests : Spek({
    describe("value") {
        it("returns value") {
            val ace = Rank.ACE
            val king = Rank.KING
            assertEquals(11, ace.value)
            assertEquals(10, king.value)
        }
    }
})
