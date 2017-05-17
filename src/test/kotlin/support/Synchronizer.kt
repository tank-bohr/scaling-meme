package support

import java.util.concurrent.locks.Condition
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

class Synchronizer() {
    private val lock: Lock = ReentrantLock()
    private val cond: Condition = lock.newCondition()

    fun waitHere() {
        try {
            lock.lock()
            cond.await()
        } finally {
            lock.unlock()
        }
    }

    fun pass() {
        try {
            lock.lock()
            cond.signal()
        } finally {
            lock.unlock()
        }

    }
}
