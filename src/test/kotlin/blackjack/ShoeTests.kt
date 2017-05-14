package blackjack

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertFails

class ShoeTests : Spek({
    describe("checkout") {
        it("checkouts a card") {
            val shoe = Shoe()
            1.rangeTo(52).forEach { shoe.checkout() }
            assertFails { shoe.checkout() }
        }
    }
})
