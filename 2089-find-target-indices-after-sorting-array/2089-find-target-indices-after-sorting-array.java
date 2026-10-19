class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int smallerThenTarget = 0;
        int targetCount = 0;

        for (int num : nums) {
            if (num < target) smallerThenTarget++;
            else if (num == target) targetCount++;
        }

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<targetCount; i++) {
            list.add(smallerThenTarget + i);
        }

        return list;
    }
}