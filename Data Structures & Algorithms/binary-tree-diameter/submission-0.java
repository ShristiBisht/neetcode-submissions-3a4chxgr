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
    public int diameterOfBinaryTree(TreeNode root) {
        Map<TreeNode, int[]> mp = new HashMap<>();
        mp.put(null, new int[]{0,0});
        Stack<TreeNode> stk  = new Stack<>();
        stk.push(root);

        while(!stk.isEmpty()){
            TreeNode node = stk.peek();
            if(node.left!=null && !mp.containsKey(node.left)) stk.push(node.left);
            else if(node.right!=null && !mp.containsKey(node.right)) stk.push(node.right);
            else{
                node = stk.pop();
                int[] leftData= mp.get(node.left);
                int[] rightData = mp.get(node.right);
                int leftHeight=leftData[0], leftDiameter = leftData[1];
                int rightHeight=rightData[0], rightDiameter=rightData[1];
                int height=1+Math.max(leftHeight, rightHeight);
                int dia= Math.max(leftHeight + rightHeight,
                               Math.max(leftDiameter, rightDiameter));
                mp.put(node, new int[]{height,dia});
            }
        }
        return mp.get(root)[1];
    }
}
