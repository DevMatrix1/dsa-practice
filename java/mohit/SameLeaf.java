static int solve(TreeNode root1, TreeNode root2){
//CODE HERE 
List<Integer> list1=new ArrayList<>();
List<Integer> list2=new ArrayList<>();

addLeaves(root1,list1);
addLeaves(root2,list2);

if(list1.size()!=list2.size()){
    return 0;
}

for(int i=0;i<list1.size();i++){
    if(list1.get(i)!=list2.get(i)) return 0;
}
return 1;

}
// Adding and condition
public static void addLeaves(TreeNode root,List<Integer> list){
    if(root==null) return;
    if(root.left==null && root.right==null){
        list.add(root.val);
    }
    addLeaves(root.left,list);
    addLeaves(root.right,list);

}