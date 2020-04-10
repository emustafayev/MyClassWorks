package warmup;

import lesson24a6.warmup.IsPalindrome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    private IsPalindrome p;

    @BeforeEach
    void setUp() {
        this.p = new IsPalindrome();
    }

    @Test
    void check1() {
        assertTrue(p.check(1));
    }

    @Test
    void check2() {
        assertTrue(p.check(121));
    }

    @Test
    void check3() {
        assertTrue(p.check(123454321));
    }

    @Test
    void check4() {
        assertFalse(p.check(123));
    }

    @Test
    void check5() {
        assertFalse(p.check(123521));
    }

    @Test
    void check6() {
        assertTrue(p.check(99));
    }
}