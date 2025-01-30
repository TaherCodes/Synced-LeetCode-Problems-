class Solution {
    public int minimumMoves(String s) {
        int len = s.length();
        int count = 0;
        
        for (int i = 0; i < len; ) { // No i++ here; it's updated inside
            if (s.charAt(i) == 'X') {
                count++;  // One move for this group of 'X'
                i += 3;   // Skip the next 2 characters (cover 3 'X' at a time)
            } else {
                i++;  // Just move to the next character
            }
        }
        return count;
        /* great approach but the string buffer is useless and the else if risky
        int len = s.length();
        int count = 0;
        StringBuffer sb = new StringBuffer();
        if(s.contains("X")){
             for(int i = 0; i < len; i++){
                if(s.charAt(i) == 'O'){
                    sb.append(s.charAt(i));
                     i++;
                     

                }
                else if(s.charAt(i) == 'X'){
                    sb.append('O');
                    sb.append('O');
                    sb.append('O');
                    count++; 
                    i = i +2;
                }
            }
        }return count;
*/
    }
}