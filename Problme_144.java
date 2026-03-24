import java.util.ArrayList;
import java.util.List;

public class Problme_144 {
    public static void main(String[] args) {

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        preOrder(root, res);
        return res;
    }

    public static void preOrder(TreeNode root, List<Integer> res) {
        if (root == null)
            return;

        res.add(root.val);
        preOrder(root.left, res);
        preOrder(root.right, res);
    }
}
