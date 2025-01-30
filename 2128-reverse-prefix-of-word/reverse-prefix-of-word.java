class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuffer sb = new StringBuffer();
        int buff = index;
        while(buff >= 0){
        sb.append(word.charAt(buff));
        buff--;
        }
        int duff = index +1;
        while(duff < word.length()){
            sb.append(word.charAt(duff));
            duff++;
        }
        return sb.toString();
    }
}