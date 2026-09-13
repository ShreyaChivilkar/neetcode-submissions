class Solution {
    public int[] productExceptSelf(int[] nums) {


        //search 0 and it's location 
        
        int mul = 1;
        int zeroCount = 0;

        int zeroPos = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroPos = i;
                zeroCount ++;
            }    
            else{
                mul = mul * nums[i];
            }       
        }

        if(zeroCount > 1){
            return new int[nums.length];
        }
        else if(zeroCount == 1){
            int [] result = new int [nums.length];
            result[zeroPos] = mul; 
            return result;
        }
        else{
            int [] result = new int[nums.length];
            for(int i = 0; i< nums.length ; i++){
                result[i] = mul / nums[i];
            }

            return result;
        }
        
    }
}  
