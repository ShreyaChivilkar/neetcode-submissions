class Solution {
    public boolean isAnagram(String s, String t) {
        int [] val = new int [26];

        for(char cs: s.toCharArray()){
            val[cs-'a'] ++;
        }

        for(char ct : t.toCharArray()){
            val[ct - 'a'] --;
        }

        for(int i : val){
            if(i != 0){
                return false;
            }
        }

        return true;

    }
}
