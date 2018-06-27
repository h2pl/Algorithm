package 剑指offer二刷.树;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 二叉树的深度 {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        System.out.println(depth(node1));
    }
    public static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        int depth = (left > right ? left : right) + 1;
        return depth;
    }
}
