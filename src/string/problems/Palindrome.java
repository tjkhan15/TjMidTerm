package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String originalString = "MADAM";
        String reversedString ="";

        int length = originalString.length();
        for (int a = length -1; a >= 0; a--) {
            reversedString = reversedString + originalString.charAt(a);
        }
        if (originalString.equals(reversedString)) {
            System.out.println(originalString + " is a palindrome");
        }else {
            System.out.println(originalString + " is not a palindrome");
        }
    }
}
