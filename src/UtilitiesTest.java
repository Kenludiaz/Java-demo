import org.junit.Assert;
import org.junit.Before;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.TestCase.assertEquals;

public class UtilitiesTest {

    private Utilities utilities;

    @Before
    public void setup() {
        utilities = new Utilities();
    }

    @org.junit.Test
    public void testEveryNthChar() throws Exception {
        char[] expected = {'e', 'l'};
        Assert.assertArrayEquals(expected, utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2));

    }

    @org.junit.Test
    public void testEveryNthCharBigN() throws Exception {
        Assert.assertArrayEquals(new char[]{'h', 'o', 'h'}, utilities.everyNthChar(new char[]{'h', 'o', 'h'}, 5));
    }

    @org.junit.Test
    public void testRemovePairs() throws Exception {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEEF"));
        assertEquals("ABCABDEF", utilities.removePairs("AABCCABDDEEF"));
        assertEquals("I love weiners", utilities.removePairs("IIIII lovvee weinneeerssss"));
        assertEquals("aAb", utilities.removePairs("aAbbbb"));
    }

    @org.junit.Test
    public void testConverter() throws Exception {
        assertEquals(300, utilities.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void testConverterException() throws Exception {
        utilities.converter(10, 0);
    }

    @org.junit.Test

    public void testNullIfOddLength() throws Exception {
        assertNull(utilities.nullIfOddLength("hello"));
        assertNotNull("hell");
    }

}
