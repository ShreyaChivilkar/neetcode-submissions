class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>>val = new HashMap<>();

        for(String s: strs){
            int [] count = new int[26];
            for(char c: s.toCharArray()){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            if(val.containsKey(key)){
                val.get(key).add(s);
            }
            else{
                List<String> res = new ArrayList<>();
                res.add(s);
                val.put(key, res);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry  : val.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }
}
