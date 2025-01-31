class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String s: arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int count = 0;
        for (String key : map.keySet()){
            if(map.get(key) == 1){
                count++;
                if(count == k) return key;
            }
        }
        return "";








        /*int count = 0;
        for(int i = 0; i< arr.length; i++){
            boolean isDistinct = true;

            for(int j = 0; j <arr.length; j++){
                if(i != j && arr[i].equals(arr[j])){
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct){
                count++;
                if(count == k) return arr[i];
            }
        }
        return "";
        */
          
    }
}