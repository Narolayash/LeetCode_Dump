public class Problem_3895 {
    public static void main(String[] args) {

    }

    public static int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;

        for (int num : nums) {
            while (num > 0) {
                if (num % 10 == digit) count++;
                num /= 10;
            }
        }

        return count;
    }

//    public int countDigitOccurrences(int[] nums, int digit) {
//        int[] freq=new int[10];
//        for(int num:nums){
//            while(num>0){
//                freq[num%10]++;
//                //System.out.println(num%10+" "+freq[num%10]);
//                num/=10;
//            }
//        }
//        return freq[digit];
//    }
}
