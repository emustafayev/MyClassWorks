package lesson26a8.tree;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class XTree<K extends Comparable<K>, V> {

    public void add(K key, V value) {
        root = add(root,key,value);

    }

    private Node add(Node curr, K key, V value) {
        if (curr==null)return new Node(key,value);
        int cmp = key.compareTo(curr.key);
        if (cmp<0) curr.left=add(curr.left,key,value);
        else if (cmp>0) curr.right=add(curr.right, key, value);
        else curr.value=value;
        return curr;
    }

    class Node{
        K key;
        V value;
        Node left;
        Node right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    Node root;


    public Optional<V> get(K key){
        return get(root,key);
    }

    public Optional<V> get(Node curr, K key){
        if (curr==null) return Optional.empty();
        int cmp = key.compareTo(curr.key);
        if (cmp<0) return get(curr.left,key);
        else if (cmp>0) return get(curr.right,key);
        else return Optional.of(curr.value);
    }

    public Node findMin(){
        return findMinR(root);
    }

    private Node findMinR(Node root) {
        return root.left==null?root:findMinR(root.left);
    }

    public Set<K> keys(){
        HashSet<K> set = new HashSet<>();
        proceed(root,set);
        return set;
    }

    private void proceed(Node root,Set<K> set) {
        if (root==null)return;
        set.add(root.key);
        proceed(root.left,set);
        proceed(root.right,set);
    }

    public void remove(K key){
        root=remove(root,key);
    }

    private Node remove(Node curr, K key) {
        if (curr==null)return null;
        int cmp = key.compareTo(curr.key);
        if (cmp<0) curr.left=remove(curr.left,key);
        else if (cmp>0) curr.right=remove(curr.right,key);
        else {
            if (curr.left==null) return curr.right;
            else if (curr.right==null) return curr.left;
            else curr = performRemove(curr);
        }
        return curr;
    }

    private Node performRemove(Node curr) {
        Node savedLeft = curr.left;
        Node newNode = findMinR(curr.right);
        Node savedRight = deleteMinAndPullUp(curr.right);
        newNode.right=savedRight;
        newNode.left=savedLeft;
        return newNode;
    }

    private Node deleteMinAndPullUp(Node curr) {
        if (curr.left==null) return curr.right;
        curr.left = deleteMinAndPullUp(curr.left);
        return curr;
    }
}
