public class Problem_2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;

        for (int i=0, j=n-1; i<n; i++, j--) {
            if (nums[i] < pivot) {
                result[left++] = nums[i];
            }

            if (nums[j] > pivot) {
                result[right--] = nums[j];
            }
        }

        while (left <= right) {
            result[left++] = pivot;
        }

        return result;
    }


    // public int[] pivotArray(int[] nums, int pivot) {
    //     List<Integer> smallerList = new ArrayList<>();
    //     List<Integer> largerList = new ArrayList<>();

    //     int count = 0;
    //     for (int num : nums) {
    //         if (num < pivot) smallerList.add(num);
    //         else if (num > pivot) largerList.add(num);
    //         else count++;
    //     }

    //     int i=0;
    //     for (int j=0; j<smallerList.size(); j++) {
    //         nums[i++] = smallerList.get(j);
    //     }
    //     while (count != 0) {
    //         nums[i++] = pivot;
    //         count--;
    //     }
    //     for (int j=0; j<largerList.size(); j++) {
    //         nums[i++] = largerList.get(j);
    //     }

    //     return nums;
    // }
}
