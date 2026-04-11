class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> res = new ArrayList<>();   
     Arrays.sort(nums);

     
     for(int i = 0 ; i< nums.length-2; ){
     int j = i+1 ;
     int k = nums.length-1 ;
     while(j<k){
     if(nums[i] + nums[j]+ nums[k] == 0) {
        res.add(new ArrayList<>(Arrays.asList(nums[i] , nums[j], nums[k])));
        int oldJ = nums[j], oldK = nums[k];
        while(j < k && nums[j] == oldJ) j++; 
        while(j < k && nums[k] == oldK) k--;
        
     }else if(nums[i] + nums[j]+nums[k] < 0){
        j++ ;
     }else { k-- ;}
    }
    int oldI = nums[i];
    while(i < nums.length - 2 && nums[i] == oldI) i++;

    }
     return res ;
    }
}