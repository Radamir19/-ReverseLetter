package org.example;
public class Main {
    public static void main(String[] args) {
        String example = "@#%#^%@&&^%f";
        reverseString(example);
    }

    public static void reverseString(String str){
        char[] charactersOfReversedString = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(Character.isLetter(charactersOfReversedString[right]) && Character.isLetter(charactersOfReversedString[left])){
                char temp = charactersOfReversedString[left];
                charactersOfReversedString[left] = charactersOfReversedString[right];
                charactersOfReversedString[right] = temp;
                left++;
                right--;
            }else if(!Character.isLetter(charactersOfReversedString[left])){
                left++;
            }else{
                right--;
            }
        }
        String result = new String(charactersOfReversedString);
        System.out.println(result);
    }
}