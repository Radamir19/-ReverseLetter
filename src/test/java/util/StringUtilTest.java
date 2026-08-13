package util;

import org.example.util.StringUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StringUtilTest {

    @Test
    public void testOrdinaryReverse() {
        String input = "J@va the be$t!123";
        Assertions.assertEquals("t@eb eht av$J!123", StringUtil.reverseString(input));
    }

    @Test
    public void returnsEmptyForEmptyInput() {
        Assertions.assertEquals("", StringUtil.reverseString(""));
    }

    @Test
    public void testOneLetterReverse() {
        Assertions.assertEquals("a", StringUtil.reverseString("a"));
    }

    @Test
    public void testWithoutLettersReverse() {
        Assertions.assertEquals("123 !@#", StringUtil.reverseString("123 !@#"));
    }

    @Test
    public void reversesOnlyLetters() {
        Assertions.assertEquals("dcba", StringUtil.reverseString("abcd"));
    }

    @Test
    public void keepsNonLettersInPlace() {
        Assertions.assertEquals("!dc#ba$", StringUtil.reverseString("!ab#cd$"));
    }

    @Test
    public void testRegisterReverse() {
        Assertions.assertEquals("dCbA", StringUtil.reverseString("AbCd"));
    }

    @Test
    public void testNull() {
        Assertions.assertNull(StringUtil.reverseString(null));
    }
}
