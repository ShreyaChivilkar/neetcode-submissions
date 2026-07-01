class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i< nums.length; i++){
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] arr = new ArrayList[nums.length + 1];

        for (int j = 0; j <= nums.length; j++) {
            arr[j] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry: countMap.entrySet()){
            arr[entry.getValue()].add(entry.getKey());
        }

        int res[] = new int [k];
        int idx = 0;
        for(int p = nums.length; p >= 0; p--){
            for(int num: arr[p]){
                if(idx < k){
                    res[idx] = num;
                    idx++;
                }
            }

        }

        return res;
        
    }
}
