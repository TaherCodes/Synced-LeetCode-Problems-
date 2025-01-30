class Solution {
    public int getLucky(String s, int k) {
        StringBuilder numericString = new StringBuilder();
        for(char c: s.toCharArray()){
            numericString.append(c - 'a' + 1);
        }

        String numStr = numericString.toString();
        int sum = 0;

        while (k > 0){
            sum = 0;
            for(char c : numStr.toCharArray()){
                sum += Character.getNumericValue(c);
            }
            numStr = String.valueOf(sum);
            k--;

        }
        return sum;

        /* intitial understanding
        byte[] bite = s.getBytes();

        StringBuilder ascii = new StringBuilder();
        for(byte b: bite){
            ascii.append(b);
        }
        String s1 = ascii.toString();
        
        char[] ch = s1.toCharArray();
        int sum = 0;
    
        //for(int j = 1; j<= k; j++){
            for(int i = 0; i < ch.length; i++){
                sum = ch[i] + sum;
            }
        return sum;*/
    }
}