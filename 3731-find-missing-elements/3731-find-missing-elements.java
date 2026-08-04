class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int tempSize = max - min + 1;
        int[] temp = new int[tempSize];

        for (int num : nums) {
            temp[num - min]++;
        }

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<tempSize; i++) {
            if (temp[i] == 0) list.add(i+min);
        }

        return list;
    }
}