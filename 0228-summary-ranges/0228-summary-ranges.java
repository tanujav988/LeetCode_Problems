class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        int n = nums.length;
        
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int start = nums[i];
            
            while(i+1<n && nums[i+1]==nums[i]+1)
                i++;
            
            int end = nums[i];
            
            if(start==end)
                list.add(start+"");
            
            else
                list.add(start+"->"+end);
        }
        
        return list;
    }
}