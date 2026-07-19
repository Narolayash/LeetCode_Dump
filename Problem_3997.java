public class Problem_3997 {
    int count = 0;
    public int postOrder(TreeNode root) {
        if (root == null) return 0;

        int Max = root.val;
        Max = Math.max(Max, postOrder(root.left));
        Max = Math.max(Max, postOrder(root.right));

        if (Max == root.val) count++;
        return Max;
    }

    public int countDominantNodes(TreeNode root) {
        int max = postOrder(root);
        return count;
    }
}
