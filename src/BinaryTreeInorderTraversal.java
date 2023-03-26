import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* https://leetcode.com/problems/binary-tree-inorder-traversal/
* */
public class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }

    public static void traversal(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        traversal(root.left, res);
        res.add(root.val);
        traversal(root.right, res);
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(3);
        tree.right.left = new TreeNode(2);

        List<Integer> res = inorderTraversal(tree);
        StringBuilder resStr = new StringBuilder();
        for (int i = 0; i < res.size(); i++) {
            if (i == 0) {
                resStr.append("[" + res.get(i) + ", ");
            } else if (i == res.size() - 1) {
                resStr.append(res.get(i) + "]");
            } else {
                resStr.append(res.get(i) + ", ");
            }
        }
        System.out.println(resStr.toString());
    }
}
