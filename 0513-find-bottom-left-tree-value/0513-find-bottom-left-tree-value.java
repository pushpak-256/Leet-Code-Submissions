class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int[] result = new int[]{0, root.val}; // {depth, value}
        traverseLeft(root, 1, result);
        return result[1];
    }

    public void traverseLeft(TreeNode node, int depth, int[] result) {
        // If the current node is null, return
        if (node == null)
            return;

        // Check if the current node is the leftmost node found so far
        if (depth > result[0]) {
            result[0] = depth;
            result[1] = node.val;
        }

        // Recursively traverse the left subtree with increased depth
        traverseLeft(node.left, depth + 1, result);
        // Recursively traverse the right subtree with increased depth
        traverseLeft(node.right, depth + 1, result);
    }
}
