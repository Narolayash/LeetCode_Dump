public class Problem_3761 {
    public static void main(String[] args) {
        int[] nums = {12,21,45,33,54};
        System.out.println(minMirrorPairDistance(nums));
    }

    public static int reversnum(int num) {
        int rev = 0;
        while(num != 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        return rev;
    }

    public static int minMirrorPairDistance(int[] nums) {
        int minDis = Integer.MAX_VALUE;
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] == reversnum(nums[j]) || nums[j] == reversnum(nums[i]))
                    minDis = Math.min(minDis, j - i);
            }
        }
        return (minDis == Integer.MAX_VALUE) ? -1 : minDis;
    }
}
