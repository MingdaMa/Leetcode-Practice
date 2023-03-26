/* https://leetcode.com/problems/same-tree/
 */
public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);
        boolean res = isSameTree(tree1, tree2);

        TreeNode tree3 = new TreeNode(1);
        tree3.left = new TreeNode(3);
        tree3.right = new TreeNode(2);
        boolean res1 = isSameTree(tree1, tree3);

        if (res) {
            System.out.println("tree1 and tree2 are the same tree");
        } else {
            System.out.println("tree1 and tree2 are not the same tree");
        }

        if (res1) {
            System.out.println("tree1 and tree3 are the same tree");
        } else {
            System.out.println("tree1 and tree3 are not the same tree");
        }

    }
}
