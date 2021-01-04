import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class UtilitiesTest {

    Utilities utilities = new Utilities();

    @org.junit.Test
    public void testEveryNthChar() throws Exception {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void testRemovePairs() throws Exception {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEEF"));
        assertEquals("ABCABDEF", utilities.removePairs("AABCCABDDEEF"));

    }

    @org.junit.Test
    public void testConverter() throws Exception {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void testNullIfOddLength() throws Exception {
        fail("This test has not been implemented");
    }

}
