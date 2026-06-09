class Solution {
    public int romanToInt(String s) {
        
        // If empty, return nothing
        if(s == ""){
            return 0;
        }

        // Initialize variables
        int total = 0;
        int length = s.length();


        // Reverse the string to make it easier to read and traverse with summation
        String reverseString = new StringBuilder(s).reverse().toString();

        // Create a hashmap that holds the defintions of the roman numerals
        Map<Character, Integer> numericalValue = new HashMap<>();

        // Add all relevant roman numericals
        numericalValue.put('I', 1);
        numericalValue.put('V', 5);
        numericalValue.put('X', 10);
        numericalValue.put('L', 50);
        numericalValue.put('C', 100);
        numericalValue.put('D', 500);
        numericalValue.put('M', 1000);

        // Begin first operation of the summation
        total += numericalValue.get(reverseString.charAt(0));

        // Create a for loop that traverses the length of the string and creates an if/else statement to correctly surmize the integer
        for(int i = 1; i < length; i++){

            if(numericalValue.get(reverseString.charAt(i-1)) > numericalValue.get(reverseString.charAt(i))){
                total += (numericalValue.get(reverseString.charAt(i)) * -1);
            }
            else{
                total += numericalValue.get(reverseString.charAt(i));
            }

        }

        // return the total sum
        return total;
    }
}