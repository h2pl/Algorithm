package In2018.Written.头条3;


import java.util.Scanner;

/**
 * Created by 周杰伦 on 2018/5/12.
 */

public class isTrie {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            Trie trie = new Trie();
            String temp1 = input.nextLine();
            if (temp1 == null || temp1.length() == 0) continue;
            String[] s1 = temp1.trim().split(" ");
            int m = Integer.parseInt(s1[0]);
            int n = Integer.parseInt(s1[1]);
            for (int i = 0; i < m; i++) {
                String line = input.nextLine();
                trie.insert(line);
            }
            String w = input.nextLine();
            for (int j = 0; j < n; j++) {
                String line = input.nextLine();
                int flag = 0;
                for (int i = 1;i <= line.length(); i ++) {
                    String prefix = line.substring(0,i);
                    if (trie.search(line)) {
                        flag = 1;
                    }
                }
                if (flag == 1) System.out.println(1);
                else System.out.println(-1);

            }
            w = input.nextLine();
        }
        input.close();
    }
}
class Trie {
    Node root = new Node();
    class Node {
        Node[] childs = new Node[26];
        boolean isLeaf;
    }
    /** Initialize your data structure here. */
    public Trie() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        insert(word, root);
    }
    public void insert(String word, Node node) {
        if (word.length() == 0 ) {
            node.isLeaf = true;
            return;
        }
        int index = indexForChar(word.charAt(0));
        if (node.childs[index] == null) {
            node.childs[index] = new Node();
        }
        insert(word.substring(1), node.childs[index]);
    }
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return search(word, root);
    }
    public boolean search(String word,Node node) {
        if (node == null) return false;
        if (word.length() == 0 ) return node.isLeaf;
        int index = indexForChar(word.charAt(0));
        return search(word.substring(1), node.childs[index]);
    }
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return startsWith(prefix, root);
    }
    public boolean startsWith(String prefix, Node node) {
        if (node == null) return false;
        if (prefix.length() == 0 ) return true;
        int index = indexForChar(prefix.charAt(0));
        return startsWith(prefix.substring(1), node.childs[index]);
    }

    public int indexForChar(char c) {
        return c - 'a';
    }
}
