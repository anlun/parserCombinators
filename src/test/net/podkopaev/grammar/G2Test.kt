package net.podkopaev.grammar

import net.podkopaev.grammar.Example2.*
import java.util.*
import org.junit.Assert
import org.junit.Test

class G2Test {
    // {w c w | |w| = n = 1}
    @Test fun test0() {
        val n = 1
        val p = grParser
        val str = getRandomString(n)
        Assert.assertEquals(n, p.get(str))
    }
    // {w c w | |w| = n = 5}
    @Test fun test1() {
        val n = 5
        val p = grParser
        val str = getRandomString(n)
        Assert.assertEquals(n, p.get(str))
    }
    // {w c w | |w| = n = 150}
    @Test fun test2() {
        val n = 150
        val p = grParser
        val str = getRandomString(n)
        Assert.assertEquals(n, p.get(str))
    }
    // {w c w | |w| = n = 87}
    @Test fun test3() {
        val n = 87
        val p = grParser
        val str = getRandomString(n)
        Assert.assertEquals(n, p.get(str))
    }
    // {w c w | |w| = n = 111}
    @Test fun test4() {
        val n = 111
        val p = grParser
        val str = getRandomString(n)
        Assert.assertEquals(n, p.get(str))
    }
    // {w c w | |w| = n = 207}
    @Test fun test5() {
        val n = 207
        val p = grParser
        val str = getRandomString(n)
        Assert.assertEquals(n, p.get(str))
    }
    // {w c w | |w| = n = 250}
    @Test fun test6() {
        val n = 250
        val p = grParser
        val str = getRandomString(n)
        Assert.assertEquals(n, p.get(str))
    }
    fun getRandomString(n: Int): String {
        val r = Random()
        val sb = StringBuilder()
        for (j in 0..n - 1) {
            if (r.nextBoolean()) {
                sb.append("a")
            } else {
                sb.append("b")
            }
        }
        return(sb.toString() + "c" + sb.toString())
    }
}