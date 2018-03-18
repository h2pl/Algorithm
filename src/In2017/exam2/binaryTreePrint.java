package In2017.exam2;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by 周杰伦 on 2017/4/1.
 */
public class binaryTreePrint {
        static class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode(int x) {
                val = x;
            }
        }
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    public static TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
        if(startPre>endPre||startIn>endIn)return null;

        TreeNode root=new TreeNode(pre[startPre]);

        for(int i=startIn;i<=endIn;i++){
        if(in[i]==pre[startPre]){
            root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
            root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
        }
        }
        return root;
    }

        public static void levelvisit(TreeNode root) {
                Queue<TreeNode> queue = new LinkedList<TreeNode>();
                if(root!=null){
                    queue.offer(root);

                }
                while(!queue.isEmpty()){
                    TreeNode p=queue.poll();

                    System.out.print(p.val);

                    System.out.print(" ");

                    if(p.left!=null){
                        queue.offer(p.left);
                    }
                    if(p.right!=null){
                        queue.offer(p.right);
                    }

                }
            }




    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        String temp = input.nextLine();
        String[] ss = temp.trim().split(" ");
        int n = Integer.parseInt(ss[0]);

        String temp1 = input.nextLine();
        String[] ss1 = temp1.trim().split(" ");
        int []a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(ss1[i]);
        }

        String temp2 = input.nextLine();
        String[] ss2 = temp2.trim().split(" ");
        int []b=new int[n];
        for(int i=0;i<b.length;i++){
            b[i]=Integer.parseInt(ss2[i]);
        }

        input.close();
        TreeNode root=reConstructBinaryTree(a,b);
        levelvisit(root);





    }
}
