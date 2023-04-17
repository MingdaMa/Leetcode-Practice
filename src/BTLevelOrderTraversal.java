import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
* https://leetcode.com/problems/binary-tree-level-order-traversal
* */
public class BTLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> nodesOnCurrentLevel = new LinkedList<>();
        nodesOnCurrentLevel.add(root);
        while (!nodesOnCurrentLevel.isEmpty()) {
            int numOfNodes = nodesOnCurrentLevel.size();
            List<Integer> currentLevel = new LinkedList<>();
            for (int i = 0; i < numOfNodes; i++) {
                TreeNode current = nodesOnCurrentLevel.poll();
                currentLevel.add(current.val);
                if (current.left != null) {
                    nodesOnCurrentLevel.offer(current.left);
                }
                if (current.right != null) {
                    nodesOnCurrentLevel.offer(current.right);
                }
            }
            res.add(currentLevel);
        }
        return res;
    }
}
