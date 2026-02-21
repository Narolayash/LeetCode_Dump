public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (num < 0) num *= -1;
            if (num == 0) continue;
            if (evenDigit1(num)) count++;
        }
        return count;
    }

    static boolean evenDigit1(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        return count % 2 == 0;
    }

    static boolean evenDigit2(int num) {
        String str = Integer.toString(num);
        return str.length() % 2 == 0;
    }

    static boolean evenDigit3(int num) {
        return ((int)Math.log10(num) + 1) % 2 == 0;
    }
}
