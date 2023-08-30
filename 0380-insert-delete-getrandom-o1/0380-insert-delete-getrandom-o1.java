class RandomizedSet {

    List<Integer> list;
    Random random;
    Map<Integer, Integer> map;
    
    public RandomizedSet() {
        
        list = new ArrayList<>();
        random = new Random();
        map = new HashMap<>();
        
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        
        if(!map.containsKey(val))
            return false;
        
        int index = map.get(val);
        
        int lastElement = list.get(list.size()-1);
        
        map.put(lastElement, index);
        
        list.set(index, lastElement);
        
        map.remove(val);
        
        list.remove(list.size()-1);
        
        return true;
    }
    
    public int getRandom() {
        
        int index = random.nextInt(list.size());
        return list.get(index);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */