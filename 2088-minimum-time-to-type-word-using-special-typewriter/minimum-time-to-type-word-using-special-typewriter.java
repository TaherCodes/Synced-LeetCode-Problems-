class Solution {
    public int minTimeToType(String word) {
        int i = 0;  // Time counter
        char prev = 'a';  // Initial pointer position

        for (char c : word.toCharArray()) {
            int v = Math.abs(c - prev);  // Direct difference
            i += Math.min(v, 26 - v) + 1;  // Min rotations + 1 for typing
            prev = c;  // Update pointer position
        }
        
        return i;

        /*
        wrong approach as for some characters like 10, 11, 12 and etc
        we are focussing on individial characters 1, 0, 1, 1, 1,2 thats 
        we cant use this approach

        int i = 0;
        StringBuilder numericString = new StringBuilder();
        for(char c: word.toCharArray()){
            numericString.append(c - 'a' + 1);
            i++;
        }
        int len = numericString.length();
        for(int j = 0; j < len -1; j++){
           int curr = numericString.charAt(j) - '0';
           int next = numericString.charAt(j+1) - '0';
            int v = Math.abs(curr-next);
            i = i + Math.min(v, 26-v);
        
        }
        return i;*/
    }
}
