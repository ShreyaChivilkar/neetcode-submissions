class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }

        // Arrays.sort(nums);
        // int curr = nums[0];

        // int streak = 1;
        // int maxStreak = 1;

        // for(int i = 1; i < nums.length; i++){

        //     if(nums[i] == curr){
        //         continue;
        //     }
        //     else if(nums[i] == (curr + 1)){
        //         streak ++;
        //         maxStreak = Math.max(streak, maxStreak);
        //     }
        //     else{
        //         streak = 1;
        //     }
        //     curr = nums[i];            
        // }

        // return maxStreak;


        HashSet<Integer> val = new HashSet<Integer>();
        for(int num: nums){
            val.add(num);
        }


        int maxStreak = 1;

        for(int num : nums){
            if(!val.contains(num - 1)){
                int streak = 1;
                while(val.contains(num + 1)){
                    num = num + 1;
                    streak ++;
                    maxStreak = Math.max(streak, maxStreak);
                }
            }
        }
        return maxStreak;

    }
}
