// https://nados.io/question/lowest-common-ancestor-of-a-binary-tree?zen=true
// Variation of Lowest Common Ancestor Of A Binary Tree   -> When p and q may not exist.

import java.util.*;

public class Main {
  public static Scanner scn = new Scanner(System.in);

  public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
      this.val = val;
    }
  }


  public static TreeNode lca;

  public static boolean LCA(TreeNode root, int p, int q) {
    if(root == null) return false;

    boolean self = false; // agar khudka node hi p or q hai then make the self as true
    if(root.val == p || root.val == q) {
      self = true;
    }

    boolean left = LCA(root.left, p, q);
    if(lca != null) return true; // agar hame LCA left side me hi mil gaya to side return true kardo no need to make further calls on right side.
    
    boolean right = LCA(root.right, p, q);
    if(lca != null) return true;// agar hame LCA right side me hi mil gaya to side return true kardo no need to make further calls.

    if((self && left) || (self && right) || (left && right)) // 3 cases: self and left true hai or self and right true hai or left and right true aaya then lca v mil gaya so set that root node
      lca = root;

    return self || left || right; // kahi se v lca agaya then true return kar do
  }

  public static TreeNode lowestCommonAncestor(TreeNode node, int p, int q) {
    lca = null;
    LCA(node, p, q);
    return lca; // global lca me jo v data hai use return kardo 
  }

  // input_section=================================================

  public static void display(TreeNode node) {
    if (node == null)
      return;

    StringBuilder sb = new StringBuilder();
    sb.append((node.left != null ? node.left.val : "."));
    sb.append(" -> " + node.val + " <- ");
    sb.append((node.right != null ? node.right.val : "."));

    System.out.println(sb.toString());

    display(node.left);
    display(node.right);
  }

  public static int idx = 0;

  private static TreeNode deserialize(String[] arr) {
    if (idx >= arr.length || arr[idx].equals("null")) {
      idx++;
      return null;
    }

    TreeNode node = new TreeNode(Integer.parseInt(arr[idx++]));
    node.left = deserialize(arr);
    node.right = deserialize(arr);

    return node;
  }

  public static TreeNode deserialize(String str) {
    String[] arr = str.split(" ");
    return deserialize(arr);
  }

  public static void solve() {
    String str = scn.nextLine();
    TreeNode root = deserialize(str);

    int e1 = scn.nextInt();
    int e2 = scn.nextInt();

    TreeNode ans = lowestCommonAncestor(root, e1, e2);
    System.out.println(ans == null ? null : ans.val);
  }

  public static void main(String[] args) {
    solve();
  }
}
