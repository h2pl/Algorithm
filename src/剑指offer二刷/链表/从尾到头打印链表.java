package 剑指offer二刷.链表;

/**
 * Created by 周杰伦 on 2018/6/27.
 */
public class 从尾到头打印链表 {
    public static void main(String[] args) {
        Node head = new Node(0);
        Node p = head;
        for (int i = 1;i < 10;i ++) {
            Node node = new Node(i);
            p.next = node;
            p = p.next;
        }
        printReverse(head);
    }
    public static void printReverse(Node node) {
        if (node.next != null) {
            printReverse(node.next);
        }
        System.out.print(node.val + " ");
    }
}
