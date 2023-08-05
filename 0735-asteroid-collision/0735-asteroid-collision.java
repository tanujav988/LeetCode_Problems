class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int asteroid : asteroids){
            boolean flag = true;
            
            while(!stack.isEmpty() && asteroid < 0 && stack.peek() > 0){
                if(Math.abs(asteroid) == Math.abs(stack.peek()))
                    stack.pop();
                else if(Math.abs(stack.peek()) < Math.abs(asteroid)){
                    stack.pop();
                    continue;
                }
                
                flag = false;
                break;
            }
            
            if(flag)
                stack.push(asteroid);
        }
        
        
        int n = stack.size();
        int res[] = new int[n];
        
        for(int i=n-1; i>=0; --i)
            res[i] = stack.pop();
        
        return res;
    }
}