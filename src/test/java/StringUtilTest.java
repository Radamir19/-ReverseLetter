import org.example.util.StringUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StringUtilTest {
    private final StringUtil stringUtil = new StringUtil();

    @Test
    public void testOrdinaryReverse() {
        String input = "J@va the be$t!123";
        Assertions.assertEquals("t@eb eht av$J!123", stringUtil.reverseString(input));
    }

    @Test
    public void returnsEmptyForEmptyInput() {
        Assertions.assertEquals("", stringUtil.reverseString(""));
    }

    @Test
    public void testOneLetterReverse() {
        Assertions.assertEquals("a", stringUtil.reverseString("a"));
    }

    @Test
    public void testWithoutLettersReverse() {
        Assertions.assertEquals("123 !@#", stringUtil.reverseString("123 !@#"));
    }

    @Test
    public void reversesOnlyLetters() {
        Assertions.assertEquals("dcba", stringUtil.reverseString("abcd"));
    }

    @Test
    public void keepsNonLettersInPlace() {
        Assertions.assertEquals("!dc#ba$", stringUtil.reverseString("!ab#cd$"));
    }

    @Test
    public void testRegisterReverse() {
        Assertions.assertEquals("dCbA", stringUtil.reverseString("AbCd"));
    }

    @Test
    public void testNull() {
        Assertions.assertNull(stringUtil.reverseString(null));
    }
}
