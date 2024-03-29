class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int chars[] = new int[128];
        int n = s.length();
        int maxLength = 0;
        
        int i=0, j=0;
        
        while(j<n){
            char right_char = s.charAt(j);
            chars[right_char]++;
            
            while(chars[right_char]>1){
                char left_char = s.charAt(i);
                chars[left_char]--;
                i++;
            }
            
            maxLength = Math.max(maxLength, j-i+1);
            
            j++;
        }
        
        return maxLength;
    }
}