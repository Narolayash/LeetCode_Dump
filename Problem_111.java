import java.util.LinkedList;
import java.util.Queue;

public class Problem_111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int depth = 0;

        while (!q.isEmpty()) {
            depth++;
            int n = q.size();
            while (n > 0) {
                TreeNode node = q.poll();
                if (node.left == null && node.right == null) return depth;
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
                n--;
            }
        }
        return depth;
    }



//    public int depth(TreeNode root) {
//        if (root == null) return 0;
//
//        int depth = depth(root.left);
//
//        if (depth != 0) depth = Math.min(depth, depth(root.right));
//        else depth = depth(root.right);
//
//        return depth + 1;
//    }
//
//    public int minDepth(TreeNode root) {
//        return depth(root);
//    }
}
