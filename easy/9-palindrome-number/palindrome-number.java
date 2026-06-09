class Solution {
    public boolean isPalindrome(int x) {
        
        // checks if the input is valid. If not, then return false and statement
        if((x > 0 && x % 10 == 0) || x < 0){
            System.out.println("The inputted number is " + x + "; thus, it cannot be a palindrome");

            return false;
        }

        // Call a self-made method called reverse and return integer into int called palindromed
        int palindromed = reverse(x);

        // Print
        System.out.println("The new integer after reversing it is: " + palindromed);

        // Check if palindrome
        if (palindromed == x)
            return true;
        else
            return false;

    }


    // Create a method to reverse the integer
    public static int reverse(int x){
        
        // Initialize variables
        int reversed = 0;
        int condition = x;

        // Create a for loop that will run for any length of integer
        for(int pow = 1; condition > 0; pow++){
            // Multiply the reversed by 10
            reversed *= 10;
            // Add the remainder to reversed number (Starts from single digit)
            reversed += condition % 10;
            // Subtract the remainder from the conditional number
            condition -= condition % 10;
            // Divide the condition by a 10 to move the 2nd digit to he first
            condition /= 10;
        }


        // Return the newly reversed integer
        return reversed;
    }

}