package Basic.datastructure;

/**
 * Created by 周杰伦 on 2017/3/10.
 */
public class queue {
    node[] arr;
    int rear = -1, front = -1;
    int size;
    queue(int size) {
        this.size=size;
        arr = new node[size];
    }
    queue(){
        size=100;
        arr=new node[size];
    }
     class node{
        int val=0;
        node(int val){
            this.val=val;
        }
        node(){}

    }
    void endueue(int val){
        if(rear-front<size) {
            node node = new node(val);
            arr[++rear] = node;
        }
    }

    node dequeue(){
        if(rear-front>0){
            node node=arr[++front];
            return node;
        }
        return  null;
    }
    boolean isempty(){
     return true;
    }

    boolean isfull(){
        return true;
    }
    void print(){
        while(rear!=front){
            System.out.println(arr[front++].val);
        }
    }

    public static void main(String args[]){
        queue queue=new queue();
        queue.endueue(1);

        queue.dequeue();
        queue.dequeue();
        queue.print();
    }
}
