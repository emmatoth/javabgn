package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testGetOneMore() {
        Numbers numbers = new Numbers();
        assertEquals(3, numbers.getOneMore(2));
        assertEquals(5, numbers.getOneMore(4));
        assertEquals(7, numbers.getOneMore(7));
        assertEquals(11, numbers.getOneMore(11));
        assertEquals(11, numbers.getOneMore(10));
    }

}