package blackjack

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import java.util.*
import kotlin.test.assertFails
import kotlin.test.assertTrue

/**
 * Created by xoma on 15/05/2017.
 */

class ShoeTests : Spek({
    describe("take") {
        it("takes a card and doesn't fail") {
            val shoe = Shoe()
            shoe.take()
        }

        it("cannot take more than 52 cards") {
            val shoe = Shoe()
            1.rangeTo(52).forEach { shoe.take() }
            assertFails { shoe.take() }
        }
    }
})
