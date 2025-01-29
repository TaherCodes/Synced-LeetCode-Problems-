class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[] s = new char[100]; // A char array to store the common prefix
        int minLength = Integer.MAX_VALUE; // Start with a very large value

        // Find the minimum length of all strings
        for (String word : strs) {
            int length = word.length();
            if (length < minLength) {
                minLength = length;
            }
        }

        int index = 0; // This will track the position in the result array
        // Loop through each character position up to the minimum length
        for (int j = 0; j < minLength; j++) {
            char currentChar = strs[0].charAt(j); // Take the character from the first string

            // Check if all strings have the same character at position j
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) != currentChar) {
                    return new String(s, 0, index); // Return the common prefix so far
                }
            }

            // If all strings match, store the character in the result array
            s[index] = currentChar;
            index++; // Move to the next position in the result array
        }

        return new String(s, 0, index); // Convert the result array to a string
    }
}

        /*char[] s = new char[5];
        char currentChar;
         int minLength = Integer.MAX_VALUE; // Start with a very large value
        
        for (String word : strs) {
            int length = word.length(); // Get word length
            if (length < minLength) {
                minLength = length; // Update min length
            }
        }
         for(int j = 0; j < minLength; j++){
                currentChar = strs[0].charAt(j);
            for(int i = 1; i < strs.length; i++ ){
                if(currentChar != strs[i].charAt(j)){
                    break;
                }
                else if(currentChar == strs[i].charAt(j)){
                    s[j] = currentChar;
                }
                    
                

            }
        }
        String result = new String(s);
        return result;*/
    