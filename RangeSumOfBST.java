public class RangeSumOfBST {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public int rangeSumBST(TreeNode root, int low, int high) {

            if(root == null) return 0;

            int currentVal = (root.val >= low && root.val <= high) ? root.val : 0;
            int  leftVal = rangeSumBST(root.left , low,high);
            int rightVal = rangeSumBST(root.right,low,high);
            return currentVal+leftVal+rightVal;
        }
    }
}
