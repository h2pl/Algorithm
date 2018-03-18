package In2017.exam;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by 周杰伦 on 2017/3/1.
 */
public class print {
    static class TreeNode{
        TreeNode left=null;
        TreeNode right=null;
        int val=0;
        TreeNode(int val){
            this.val=val;
        }

    }

    public static void print(TreeNode t) {


        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode temp;

        if (t!= null){
            queue.offer(t);

            while (!queue.isEmpty()) {

                temp=queue.poll();
                System.out.println(temp.val);

                if (temp.left != null)
                    queue.offer(temp.left);

                if (temp.right != null)
                    queue.offer(temp.right);
            }

        }}


    public static  void initTree(TreeNode t){
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        t.left=t1;

        t.right=null;




    }

    public static void main(String args[])
    {
        TreeNode t=new TreeNode(0);
        initTree(t);
        print(t);
    }
}
