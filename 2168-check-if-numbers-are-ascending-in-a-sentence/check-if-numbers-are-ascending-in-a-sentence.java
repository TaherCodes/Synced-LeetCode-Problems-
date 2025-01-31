class Solution {
    public boolean areNumbersAscending(String s) {
        
        List<Integer> numList = new ArrayList<>();
        String[] tokens = s.split(" "); // Split sentence into words

        // Extract numbers from the string
        for (String token : tokens) {
            if (token.matches("\\d+")) { // Check if token is a number
                numList.add(Integer.parseInt(token)); // Convert to int and add to list
            }
        }

        // Check if the numbers are in strictly increasing order
        for (int i = 1; i < numList.size(); i++) {
            if (numList.get(i) <= numList.get(i - 1)) { // Not strictly increasing
                return false;
            }
        }

        return true; // All numbers are in increasing order
    
        
        
        
        
        
        /*String[] tokens  = s.split("");
        int prev = -1;

        for(String token : tokens){
            if(token.matches("\\d+")){
                int num = Integer.parseInt(token);

                if(num <= prev){
                    return false;
                }
                prev = num;
            }
        }
        return true;*/
    }
}