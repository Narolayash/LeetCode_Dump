public class Problem_3099 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int cp = x;

        int sum = 0;
        while (cp != 0) {
            sum += cp % 10;
            cp /= 10;
        }

        return (x % sum == 0) ? sum : -1;
    }
}
