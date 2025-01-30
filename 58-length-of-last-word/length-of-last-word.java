class Solution {
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int lastSpace = s1.lastIndexOf(" ");
        int len = s1.length() - lastSpace - 1;
        return len;

    }
}