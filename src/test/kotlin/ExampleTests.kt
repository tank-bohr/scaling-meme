import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import support.Synchronizer
import java.lang.Thread.sleep
import kotlin.concurrent.thread
import kotlin.test.assertEquals

class ExampleTests : Spek({
    describe("dummy test") {
        it("is true") {
            assertEquals(6, 3 + 3)
        }
    }

    describe("async multiply") {
        it("syncs") {
            var result: Int? = null

            val sync: () -> Unit

//            val s = Synchronizer()

            result = Sync.sync {
                thread {
                    it(2 * 2)
                }
            }

//            thread {
//                result = 2 * 2
//                s.pass()
//            }
//            s.waitHere()

            assertEquals(4, result)
        }

    }
})

class Sync {
    companion object {
        fun <T> sync(action: ((t: T) -> Unit) -> Unit): T {
            val s = Synchronizer()
            var t: T? = null

            action {
                t = it
                s.pass()
            }

            s.waitHere()
            return t!!
        }
    }
}
