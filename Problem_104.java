public class Problem_104 {
    public int helper(TreeNode root, int depth) {
        if (root == null) return depth;
        return Math.max(helper(root.left, depth+1), helper(root.right, depth+1));
    }

    public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }
}
