package Basic.datastructure;

/**
 * Created by 周杰伦 on 2017/3/10.
 */
public class stack {
    node[] arr;
    int top=-1;
    int size;
    stack(int size) {
        this.size=size;
        arr = new node[size];
    }
    stack(){
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
    void push(int val){
        if(top<size-1) {
            node node = new node(val);
            arr[++top]=node;
        }
    }

   node pop(){
        if(top>=0){
            node node=arr[top--];
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
        while(top>-1){
            System.out.println(arr[top--].val);
        }
    }

    public static void main(String args[]){
        stack stack=new stack();
        stack.push(1);
        stack.push(3);
        stack.pop();
        stack.push(2);
        stack.push(4);
        stack.print();
    }
}
