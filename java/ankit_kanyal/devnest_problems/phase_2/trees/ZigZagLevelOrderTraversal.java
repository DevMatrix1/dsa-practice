// link- https://devsnest.in/lms?id=57&slug=zig-zag-level-order-traversal&tab=question

static int[][] solve(TreeNode root){
    List<List<Integer>> list=new ArrayList<>();
    
    Stack<TreeNode> stk1=new Stack<>();
    Stack<TreeNode> stk2=new Stack<>();
    stk1.push(root);
    boolean status=true;
//  true:- left to right  false :- right to left
        
    while(stk1.size()>0){
        int size=stk1.size();
        List<Integer> innerlist=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode node=stk1.pop();
            if(status){
                if(node.left!=null) stk2.push(node.left);
                if(node.right!=null) stk2.push(node.right);
            }else{
                if(node.right!=null) stk2.push(node.right);
                if(node.left!=null) stk2.push(node.left);
            }
            innerlist.add(node.val);
        }
            
        list.add(innerlist);
        stk1=stk2;
        stk2=new Stack<>();
        status=!status;
            
            
        }
        
        
    int [][] ans=list.stream().map(l->l.stream().mapToInt(Integer::intValue).toArray()).toArray(int [][]::new);
    return ans;
    }