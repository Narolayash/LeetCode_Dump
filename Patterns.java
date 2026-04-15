public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n - 1; row++) {
            int c = row >= n  ? 2 * n - row - 1 : row;
            for (int col = 0; col <= c; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }


    static void pattern4(int n) {
        for (int row = 0; row < n; row++) {
            int i = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(i++ + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }
}
