package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderInterative {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(1);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(10);
        TreeNode t6 = new TreeNode(9);

        t1.left = t2;
        t1.right = t5;
        t2.left = t3;
        t2.right = t4;
        t5.left = t6;

        System.out.println(preOrder(t1));
    }

    public static List<Integer> preOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            result.add(curr.val);

            if (curr.right != null)
                stack.push(curr.right);
            if (curr.left != null)
                stack.push((curr.left));
        }

        return result;
    }
}
