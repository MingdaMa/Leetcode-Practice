public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return isSymmetricHelper(root.left, root.right);
    }

    public static boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(2);
        tree1.left.left = new TreeNode(3);
        tree1.left.right = new TreeNode(4);
        tree1.right.left = new TreeNode(4);
        tree1.right.right = new TreeNode(3);

        boolean res = isSymmetric(tree1);
        if (res) {
            System.out.println("tree1 is symmetric");
        } else {
            System.out.println("tree1 is asymmetric");
        }
    }
}
