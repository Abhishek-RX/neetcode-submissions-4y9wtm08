class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] res = new int[nums.length] ;

         for(int i =0 ;i< nums.length-1 ; i++){
            if(i -1 < 0 ){
              res[i] = 1 ;  
            }
              res[i+1] = res[i] * nums[i] ;
            
         }  
         int right = 1 ; ; 
         for(int i = nums.length-1 ; i>=0 ; i--){
        
           if(i+1 == nums.length){
            
           }else{ 
           right *= nums[i+1] ;  
           
           res[i] = right * res[i] ;
           }
   
         }
         
      return res ;   
    }
}  
