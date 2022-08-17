// link- https://devsnest.in/algo-challenges/even-odd-tree?tab=question

static int solve(TreeNode root){
  Queue<TreeNode> que=new LinkedList<>();
    que.offer(root);
    boolean idxstatus=true;
    int level=-1;
    int prev=0;
        
//  true==odd && false==even
        
    while(que.size()>0){
        int size=que.size();
        level++;
        idxstatus=level%2==0;
            
        for(int i=0;i<size;i++){
            TreeNode node=que.poll();
            int value=node.val;
            if(idxstatus){
                if(value%2==0) return 0;
                if(value<=prev) return 0;
                prev=value;
            }else{
                if(value%2==1) return 0;
                if(value>=prev) return 0;
                prev=value;
            }
                
            if(node.left!=null)que.offer(node.left);
            if(node.right!=null)que.offer(node.right);
             
            }
        if(idxstatus){
            prev=10000000;
        }else{
            prev=0;
        }
    }
        
    return 1;
}