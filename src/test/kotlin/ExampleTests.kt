import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import support.Synchronizer
import kotlin.concurrent.thread
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class ExampleTests: Spek({
    describe("dummy test") {
        it("is true") {
            assertEquals(6, 3 + 3)
        }
    }

    describe("test async") {
        it("tests async") {
            var result: Int? = null
            val s = Synchronizer()
            thread {
                result = 1024 * 1024
                s.pass()
            }
            s.waitHere()
            assertNotNull(result)
        }
    }
})
