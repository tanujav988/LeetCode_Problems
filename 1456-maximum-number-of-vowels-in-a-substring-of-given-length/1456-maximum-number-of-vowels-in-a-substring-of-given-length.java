class Solution {
    public int maxVowels(String s, int k) {
        
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        int n = s.length();
        int count = 0;
        int maxLen = Integer.MIN_VALUE;
        
        for(int i=0; i<k; i++){
            count += (set.contains(s.charAt(i))) ? 1 : 0;
        }
        
        maxLen = count;
        
        for(int i=k; i<n; i++){
            count += (set.contains(s.charAt(i))) ? 1 : 0;
            count -= (set.contains(s.charAt(i-k))) ? 1 : 0;
            maxLen = Math.max(maxLen, count);
        }
        
        return maxLen;
        
    }
}