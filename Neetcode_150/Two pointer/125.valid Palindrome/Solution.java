class Solution {
    public boolean isPalindrome(String s) {
        String palStr  = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = palStr.length() - 1;
        System.out.print(palStr);

        while(left <= right){
            if(palStr.charAt(left) != palStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}