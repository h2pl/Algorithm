package 过去笔试记录.Basic.datastructure;

/**
 * Created by 周杰伦 on 2017/3/9.
 */
public class linkedlist {
    node head=null;
    linkedlist(node head){
        this.head=head;
    }
    static node first=new node(0);
    static linkedlist L=new linkedlist(first);



    static class node{
        int val=0;
        node next=null;
        node(int val){
            this.val=val;
        }
        node(){}

    }
    int findnodeindex(int val){
        int index=0;
        node p=L.head;
        while(p.val!=val)
        {
            p=p.next;
            index++;
        }
        return index;
    }

    void insert(int index,int val){
        node p=L.head;
        int i=0;
        if(index==0){
            node a=new node(val);
            a.next=L.head;
            L.head=a;
        }else{
        while(i<index-1){
            p=p.next;
            i++;
        }
        node q=p.next;
        node a=new node(val);
        a.next=q;
        p.next=a;

        }


    }

    void delete(int index)
    {

        int i=0;
        node p=L.head;
        if(index==0)
        {
            p=p.next;
        }else {
            while (i < index - 1){
                p=p.next;
                i++;
            }
            p.next=p.next.next;

        }
    }
    node findrear(){
        node p=L.head;
        while(p.next!=null)
        {
           p=p.next;
        }
        return p;
    }

    void add(node a){
      findrear().next=a;
    }

    void print(){
        node p=L.head;
        while(p!=null)
        {
            System.out.println(p.val);
            p=p.next;
        }
    }

    public void dosomework(int...varnum){
        for (int i=0;i<varnum.length;i++)
        {
            int n=varnum[0];
            for(int j=1;j<=n;j++)
            {
                node p=new node(varnum[i]);
                L.findrear().next=p;

            }
            int index=varnum[n+1];
            int addnum=varnum[n+2];
            insert(index,addnum);

            delete(varnum[n+3]);




        }
    }

    public static void main(String args[]){
        linkedlist.L.add(new node(1));
        linkedlist.L.add(new node(2));
        linkedlist.L.delete(1);
        linkedlist.L.insert(1,4);
        linkedlist.L.print();
    }
}

