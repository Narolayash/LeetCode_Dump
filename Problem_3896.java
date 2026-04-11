public class Problem_3896 {
    public static void main(String[] args) {

    }

    // solution - 1
//    public int minOperations(int[] nums) {
//        int operationCount = 0;
//        int i = 0;
//        for(int num : nums) {
//            if (i % 2 == 0 && !isPrime(num)) {
//                while(!isPrime(num++)) {
//                    operationCount++;
//                }
//            }
//            if (i % 2 != 0 && isPrime(num)) {
//                while(isPrime(num++)) {
//                    operationCount++;
//                }
//            }
//            i++;
//        }
//        return operationCount;
//    }
//    public boolean isPrime(int num) {
//        if (num == 1) return false;
//        if (num == 2) return true;
//        if (num % 2 == 0) return false;
//
//        for (int i=2; i * i <= num; i++) {
//            if (num % i == 0) return false;
//        }
//
//        return true;
//    }
}
