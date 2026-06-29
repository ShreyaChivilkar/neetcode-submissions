class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> val = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            Integer rem = target - nums[i];

            if(val.containsKey(rem)){
                if(val.get(rem) < i){
                    return new int [] {val.get(rem), i};
                }
                else{
                    return new int [] { i, val.get(rem)};

                }
            }
            else{
                val.put(nums[i], i);
            }
        }

        return new int[0];
        
    }
}
