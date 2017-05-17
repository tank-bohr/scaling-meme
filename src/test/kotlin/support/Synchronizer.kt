package support

import java.util.concurrent.locks.ReentrantLock

/**
 * Created by xoma on 15/05/2017.
 */

class Synchronizer {

    val lock = ReentrantLock()
    val cond = lock.newCondition()

    fun pass() {
        try {
            lock.lock()
            cond.signal()
        } finally {
            lock.unlock()
        }
    }

    fun waitHere() {
        try {
            lock.lock()
            cond.await()
        } finally {
            lock.unlock()
        }
    }

}
