/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    // Function to return sum of all nodes of a binary tree
    static int sumBT(Node root) {
        if(root == null){
            return 0;
        }
        int left = sumBT(root.left);
        int right = sumBT(root.right);
        return left + right + root.data;
        
    }
}