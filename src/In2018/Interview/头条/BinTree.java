package mianshi.toutiao;

/**
 * Created by 周杰伦 on 2018/3/9.
 * 这里用一个新的变量parent(current的父节点)，来存储遇到的最后一个不是null的节点。必须这样做，
 * 因为current在查找的过程中会变成null，
 * 才能发现它查过的上一个节点没有一个对应的子节点。如果不存储parent，就会失去插入新节点的位置。
 */
public class BinTree {

    private Node root;

    public BinTree(Node node) {
        this.root = node;
    }

    public void insert(int id, double dd) {
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;
        if(root == null)
            root = newNode;
        else {
            Node current = root;
            Node parent;
            while(true) {
                parent = current;
                if(id < current.iData) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            } // end while
        } // end else
    }

    public Node find(int key) {
        // 假设树非空
        Node current = root;
        while(current.iData != key) {
            if(key < current.iData)
                current = current.leftChild;
            else
                current = current.rightChild;
            if(current == null)
                return null;
        }
        return current;
    }

    /**
     * 前序遍历
     * @param localRoot
     */
    public void preOrder(Node localRoot) {
        if(localRoot != null) {
            System.out.print(localRoot.iData+" ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    /**
     * 中序遍历
     * @param localRoot
     */
    public void inOrder(Node localRoot) {
        if(localRoot != null) {
            preOrder(localRoot.leftChild);
            System.out.print(localRoot.iData+" ");
            preOrder(localRoot.rightChild);
        }
    }

    /**
     * 后序遍历
     * @param localRoot
     */
    public void postOrder(Node localRoot) {
        if(localRoot != null) {
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
            System.out.print(localRoot.iData+" ");
        }
    }

    /**
     * 求树中的最小值
     * @return
     */
    public Node minimum() {
        Node current;
        current = root;
        Node last = null;
        while(current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    /**
     * 求树中的最大值
     * @return
     */
    public Node maxmum() {
        Node current;
        current = root;
        Node last = null;
        while(current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }
}
