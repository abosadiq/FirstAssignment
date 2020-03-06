package FirstAssignment;

import org.junit.Assert;
import org.junit.Test;

import static FirstAssignment.StringArrayUtils.contains;


public class ContainsTest {



    @Test
    public void testContains() {
        final String[] array = { "the", "man", "of", "steel", "fights", "a", "never-ending", "battle", "for", "truth" };
        for (final String s : array) {
            final boolean outcome = contains(array, s);
            Assert.assertTrue(outcome);
        }
    }
}
