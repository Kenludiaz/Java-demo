import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class RemovePairsTests {

    private Utilities utilities;

    private String input;
    private String output;

    public RemovePairsTests(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public static Collection<Object> testConditions() {
            return Arrays.asList(new Object [][]
            {{"ABCDEFF", "ABCDEF"},
            {"AB88EFFG", "AB8EFG"},
            {"112233445566", "123456"},
            {"ZYZQQB", "ZYZQB"},
            {"A", "A"}
            });

    }

    @org.junit.Before
    public void setup() {
        utilities = new Utilities();
    }

    @org.junit.Test
    public void testRemovePairsArray() throws Exception {
        assertEquals()
    }

}
