public class Solution {
    public static void main(String[] args){
        int[] nums= new int[]{2, 3, 4};
        int target = 7;

        int[] res = solution(nums, target);

        System.out.println("result is " + res[0] + " and " + res[1]);
    }

    public static int[] solution(int[] nums, int target){
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if((nums[i] + nums[j]) == target){
                    return new int[]{j, i};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
