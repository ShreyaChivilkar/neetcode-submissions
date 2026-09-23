class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        if(s.length() == 0){
            return true;
        }
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            char lEle = s.charAt(left);
            char rEle = s.charAt(right);
            if(lEle != rEle){
                return false;
            }
            left ++;
            right --;
        }

        return true;
        
    }
}
