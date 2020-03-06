package FirstAssignment;

import org.junit.Assert;
import org.junit.Test;

import static FirstAssignment.StringArrayUtils.getFirstElement;
public class GetFirstElementTest {

    @Test
    public void testGetFirstElement1() {
        String[] array = { "the", "man", "of", "steel", "fights", "a", "never-ending", "battle", "for", "truth" };
        String expected = "the";
        String actual = StringArrayUtils.getFirstElement(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFirstElement2() {
        String[] array = { "steel", "fights", "a", "never-ending", "battle", "for", "truth" };
        String expected = "steel";
        String actual = StringArrayUtils.getFirstElement(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFirstElement3() {
        String[] array = { "fights", "a", "never-ending", "battle", "for", "truth" };
        String expected = "fights";
        String actual = StringArrayUtils.getFirstElement(array);
        Assert.assertEquals(expected, actual);
    }
}
