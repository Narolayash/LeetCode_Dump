public class Problem_11 {
    public static void main(String[] args) {

    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            if (maxArea < area) maxArea = area;
            if (height[i] < height[j]) i++;
            else j--;
        }

        return maxArea;
    }

//    public static int maxArea(int[] height) {
//        int maxArea = 0;
//        for (int i=0; i < height.length - 1; i++) {
//            for (int j=i+1; j < height.length; j++) {
//                int x = j - i;
//                int y = Math.min(height[i], height[j]);
//                int area = x * y;
//                if (maxArea < area) maxArea = area;
//            }
//        }
//
//        return maxArea;
//    }
}
