class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        
        for (String word : words) {
            sb.append(word);
            
            // If the prefix already matches, return early
            if (sb.toString().equals(s)) {
                return true;
            }
            
            // If sb becomes longer than s, it can't be a prefix
            if (sb.length() > s.length()) {
                return false;
            }
        }
        
        return false; 
       
       /* good attempt but 9 testcases could not be satisfied 
        StringBuilder sb =  new StringBuilder();

        for(int i = 0; i < words.length; i++){
            sb.append(words[i]);
        }
        String news = sb.toString();
        return news.startsWith(s);
        */
    
    
    }
}