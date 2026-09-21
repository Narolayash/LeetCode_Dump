/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right || right < left) return null;
        int mid = left + (right - left) / 2;

        return new TreeNode(
            nums[mid],
            helper(nums, left, mid - 1),
            helper(nums, mid + 1, right)
        );
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
}