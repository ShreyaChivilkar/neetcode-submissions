class Solution {
    public int[] twoSum(int[] nums, int target) {

        // HashMap<Integer, Integer> val = new HashMap<Integer, Integer>();

        // for(int i = 0; i < nums.length; i++){
        //     Integer rem = target - nums[i];

        //     if(val.containsKey(rem)){
        //         if(val.get(rem) < i){
        //             return new int [] {val.get(rem), i};
        //         }
        //         else{
        //             return new int [] { i, val.get(rem)};

        //         }
        //     }
        //     else{
        //         val.put(nums[i], i);
        //     }
        // }

        // return new int[0];

        HashMap <Integer, Integer>val = new HashMap<>();
        
        for(int i = 0; i< nums.length ; i++){
            val.put(nums[i], i);
        }

        for(int i = 0; i< nums.length; i++){
            int ele = nums[i];
            int rem = target - ele;

            if(val.containsKey(rem) && val.get(rem) != i){
                if(i < val.get(rem)){
                    return new int [] {i , val.get(rem)};
                } 
                else{
                    return new int [] {val.get(rem), i};
                }
            }
        }
        
        return new int [] {};
        
    }
}
