class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();

        for(String s : strs){
            res.append(s.length());
            res.append('*');
            res.append(s);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        
        int i = 0;
        while(i<str.length()){
            int j = i;
            while (str.charAt(j) != '*'){
                j++;
            }
            String lenSubstring = str.substring(i, j);

            int strLength = Integer.parseInt(str.substring(i, j));

            j++;

            String s = str.substring(j,j + strLength);
            i = j + strLength;
            result.add(s);

        }
        return result;
        
    }
}
