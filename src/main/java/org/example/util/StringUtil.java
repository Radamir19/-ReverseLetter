package org.example.util;

public class StringUtil {
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        char[] charactersOfReversedString = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (Character.isLetter(charactersOfReversedString[right]) && Character.isLetter(charactersOfReversedString[left])) {
                char temp = charactersOfReversedString[left];
                charactersOfReversedString[left] = charactersOfReversedString[right];
                charactersOfReversedString[right] = temp;
                left++;
                right--;
            } else if (!Character.isLetter(charactersOfReversedString[left])) {
                left++;
            } else {
                right--;
            }
        }
        String result = new String(charactersOfReversedString);
        System.out.println(result);
        return result;
    }
}
