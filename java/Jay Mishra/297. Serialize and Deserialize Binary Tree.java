/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "null,";
        return root.val + "," + serialize(root.left) + serialize(root.right); 
    }

    // Decodes your encoded data to tree.
    public static class Pair {
        TreeNode node;
        char state;
        Pair(TreeNode node) {
            this.state = 'l'; // l means add new child to left and r means right
            this.node = node;
        }
    } 

    public TreeNode deserialize(String data) {
        if(data.equals("null,") == true) return null; // agar data hi null hai to apke tree me v ek v node nahi hai so return null

        Stack<Pair> stk = new Stack<>();
        String[] tokens = data.split(","); // tokenize the generated string.
        TreeNode root = null; // ek root pointer lelo jo initially null ko point kar raha hai

        for(String token: tokens) {
            if(token.equals("null") == true) {
                 if(stk.peek().state == 'l') {
                     stk.peek().state = 'r';
                 } else { // agar state right hai to pop
                     stk.pop();
                 }
            } else {
                TreeNode child = new TreeNode(Integer.parseInt(token)); 
                // Convert the token string into Int and create a node out of it.
                if(stk.empty()) { // if the stk is empty then make the curr child token as the root node
                    root = child;
                } else {
                    if(stk.peek().state == 'l') {
                        stk.peek().node.left = child; // stk k top pe jo node hai uske left me apne child token ko lagado
                        stk.peek().state = 'r'; // and state ko banado right so that abb right me child attach ho
                    } else { // already right hai state to right me child lagao and uss node ko stk se pop kardo as both its childs are processed
                        stk.peek().node.right = child;
                        stk.pop();
                    }
                }
                
                stk.push(new Pair(child)); // stk empty ho ya na ho node har baar stk me push hoga
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
