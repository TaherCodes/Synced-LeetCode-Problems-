class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        if(haystack.contains(needle) == true){
            i = haystack.indexOf(needle);
            return i;
        }
        else {
            return -1;
        }
       
    } 
}

/*brute force */