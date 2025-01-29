public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stak = new Stack<>(); // Corrected stack variable name
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') { // Fixed the duplicate '{'
                stak.push(c);
            } else {
                if (stak.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stak.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
        return stak.isEmpty(); // Stack must be empty for a valid string
    }
}
       /* if (s.isEmpty()) return true;

        // Base case: If length is odd, it cannot be balanced
        if (s.length() % 2 != 0) return false;

        // Replace valid pairs iteratively until nothing changes
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }

        return s.isEmpty(); // If all brackets are matched, it should be empty
    }*/

       /* int round = 0; int curly = 0; int square = 0;
        for(char ch: s.toCharArray()){
            if(ch == '(') round++;
            else if(ch == ')'){
                if(round == 0) return false;
                round--;
            }
            else if(ch == '{') curly++;
            else if(ch == '}'){
                if(curly == 0) return false;
                curly--;
            }
            else if(ch == '[') square++;
            else if(ch == ']'){
                if(square == 0) return false;
                square--;
            }
        }
        return round == 0 && curly == 0 && square == 0;
    */
    


