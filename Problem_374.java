public class Problem_374 {
    public int guessNumber(int n) {
        int start = 1, end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int num = guess(mid);    // guess is the api
            if (num == 0) return mid;

            if (num == -1) end = mid - 1;
            if (num == 1) start = mid + 1;
        }

        return -1;
    }
}
