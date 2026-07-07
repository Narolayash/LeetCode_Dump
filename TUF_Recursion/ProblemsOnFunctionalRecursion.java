package TUF_Recursion;


import java.util.Arrays;

public class ProblemsOnFunctionalRecursion {
    // ---- with out recursion ----
//    public static void reverseArrayWithOutRecursion(int[] arry) {
//        int n = arry.length;
//
//        for (int i=0; i<n/2; i++) {
//            int temp = arry[i];
//            arry[i] = arry[n - 1 - i];
//            arry[n - 1 - i] = temp;
//        }
//    }

//    public static void reverseArrayWithOutRecursion(int[] arry) {
//        int i = 0, j = arry.length - 1;
//
//        while (i < j) {
//            int temp = arry[i];
//            arry[i++] = arry[j];
//            arry[j--] = temp;
//        }
//    }




    //    ----- with recursion -----
//    public static void reverseArray(int[] arry, int i) {
//        int n = arry.length;
//        if (i >= n/2) return;
//
//        reverseArray(arry, i + 1);
//        int temp = arry[i];
//        arry[i] = arry[n - 1 - i];
//        arry[n - 1 - i] = temp;
//    }

    public static void reverseArray(int[] arry, int i, int j) {
        if (i >= j) return;

        int temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;

        reverseArray(arry, ++i, --j);
    }



//    Time Complexity: O(n/2)
    public static boolean isPalindrome(String str, int i) {
        int n = str.length();
        if (i >= n / 2) return true;

        if (str.charAt(i) != str.charAt(n - 1 - i)) return false;

        return isPalindrome(str, i + 1);
    }


    public static void main(String[] args) {
//        int[] arry1 = new int[] {1, 2, 3, 4, 5};
//        int[] arry2 = new int[] {1, 2, 3, 4, 5, 6};

//        reverseArrayWithOutRecursion(arry1);
//        reverseArrayWithOutRecursion(arry2);

//        reverseArray(arry1, 0, arry1.length - 1);
//        reverseArray(arry2, 0, arry2.length - 1);

//        System.out.println(Arrays.toString(arry1));
//        System.out.println(Arrays.toString(arry2));

//        String str1 = "Yash";
//        String str2 = "madam";
//        System.out.println("Str - 1 is palindrome: " + isPalindrome(str1, 0));
//        System.out.println("Str - 2 is palindrome: " + isPalindrome(str2, 0));
    }
}
