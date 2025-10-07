class Solution {
    public boolean isPalindrome(int x) {
        int x1 = x;
       int y = 0;
       int rev = 0;
       if(x >= 0){
        if(x == 0){
            return true;
        }
        while(x != 0){
            y = x%10;
            rev = rev * 10 + y;
            x = x/10;

            if(x1 == rev){
                return true;
            }
        }
       } return false;
    }
}