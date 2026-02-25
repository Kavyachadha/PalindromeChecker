public class PalindromeChecker {
    public static void main(String[] agrs){

        String input = "nitin";
        String reversed = "";

        // Reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        if (input.equals(reversed)) {
            System.out.println("Input text: " + input);
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Input text: " + input);
            System.out.println("It is NOT a Palindrome");
        }
    }
}
