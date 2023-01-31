package array;

public class FindGCD {
    public static void main(String[] args) {
        findGCD(new int[]{2, 5, 6, 9, 10});
    }

    public static int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int i;
        for (i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];

            }
            if(nums[i] < min){
                min = nums[i];
            }

        }
        return nums[i];
    }
}




















