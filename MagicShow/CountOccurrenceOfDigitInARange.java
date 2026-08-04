package MagicShow;

import java.util.Scanner;

public class CountOccurrenceOfDigitInARange {

    public static int solution(int d, int l, int r) {
        int count = 0;

        for (int i=l; i<=r; i++) {
            int num = i;
            while (num != 0) {
                if (num % 10 == d) count++;
                num /= 10;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digit(D): ");
        int D = sc.nextInt();

        System.out.print("Enter the left point(L): ");
        int L = sc.nextInt();

        System.out.print("Enter the right point(R): ");
        int R = sc.nextInt();

        System.out.println("Total occurrence = " + solution(D, L, R));
    }
}
