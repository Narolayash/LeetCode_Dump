
class Solution {
    public boolean helper(TreeNode root, int targetSum, int currSum) {
        if (root.left == null && root.right == null) {
            if (targetSum == currSum) return true;
            else return false;
        }

        boolean check1 = false;
        boolean check2 = false;
        if (root.left != null) {
            check1 = helper(root.left, targetSum, currSum + root.left.val);
        }

        if (root.right != null) {
            check2 = helper(root.right, targetSum, currSum + root.right.val);
        }

        return check1 || check2;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return helper(root, targetSum, root.val);
    }
}



//class Solution {
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if (root == null) return false;
//
//        if (root.left == null && root.right == null) {
//            return targetSum - root.val == 0;
//        }
//
//        targetSum -= root.val;
//        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
//    }
//}