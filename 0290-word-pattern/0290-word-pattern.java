class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String arr[] = s.split(" ");
        
        int n = arr.length;
        
        if(pattern.length()!=n)
            return false;
        
        Map<Character, String> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            char ch = pattern.charAt(i);
            
            if(map.containsKey(ch) && !(map.get(ch)).equals(arr[i]))
                return false;
            
            if(!map.containsKey(ch) && map.containsValue(arr[i]))
                return false;
            
            map.put(ch, arr[i]);
        }
        
        return true;
    }
}