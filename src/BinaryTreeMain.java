public class BinaryTreeMain {

    public static void main(String[] args) {
        // Construct a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution solution = new Solution();

        int diameter = solution.diameterOfBinaryTree(root);
        System.out.println("The diameter of the binary tree is: " + diameter);
    }

    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }

    public static class Solution {
        int maxDiameter = 0; // Initialize max diameter

        public int diameterOfBinaryTree(TreeNode root) {
            maxDepth(root);
            return maxDiameter;
        }

        private int maxDepth(TreeNode node) {
            if (node == null) {
                return 0; // The depth of a null node is 0
            }

            int leftDepth = maxDepth(node.left); // Recurse on the left child
            int rightDepth = maxDepth(node.right); // Recurse on the right child

            maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth); // Update the max diameter if this node's path is longer

            return Math.max(leftDepth, rightDepth) + 1; // Return the depth of this node
        }
    }
}
