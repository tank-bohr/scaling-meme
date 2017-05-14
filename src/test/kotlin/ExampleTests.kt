import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class ExampleTests: Spek({
    describe("dummy test") {
        it("is true") {
            assertEquals(6, 3 + 3)
        }
    }
})
