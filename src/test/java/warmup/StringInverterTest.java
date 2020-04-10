package warmup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringInverterTest {

    private InvertString is;

    @BeforeEach
    void before() {
        is = new InvertString();
    }

    @Test
    void invert1() {
        assertEquals("abc", is.invert("ABC"));
    }

    @Test
    void invert2() {
        assertEquals("hELLOwORLD", is.invert("HelloWorld"));
    }

    @Test
    void invert3() {
        assertEquals("abcdef", is.invert("ABCDEF"));
    }

    @Test
    void invert4() {
        assertEquals("", is.invert(""));
    }
}