class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer , Integer> map = new HashMap<>();
     
     for(Integer i : nums){
        map.put(i, map.getOrDefault(i , 0)+1);
     } 
     int[] res = map.keySet().stream()
                    .sorted((a, b) -> map.get(b) - map.get(a))
                    .limit(k)
                    .mapToInt(Integer::intValue)
                    .toArray();
     System.out.println(map);  
    return res ;   
    }
}