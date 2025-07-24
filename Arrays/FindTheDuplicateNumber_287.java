public class FindTheDuplicateNumber_287{
    public static void main(String[] args){
        int[] nums = {3,1,3,4,2};
        for(int i=0;i<nums.length;i++){
            if(nums[i] == -1){
                System.out.print(nums[i]);
                break;}
            if(nums[i] == nums[i+1]) {
                System.out.print(nums[i]);
                break;}
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    System.out.println(nums[i]);
                    break;
                }
            }
        }
}
}
