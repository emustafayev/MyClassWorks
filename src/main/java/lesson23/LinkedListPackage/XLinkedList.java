package lesson23.LinkedListPackage;

import java.util.StringJoiner;

public class XLinkedList {

  public void reverse() {
    Node curr = head;
    Node prev = null;

    while (curr!=null){
      Node savedNext = curr.next;
      curr.next=prev;
      prev=curr;
      curr=savedNext;
    }
    head=prev;
  }

  public void append(int value) {
    head = appendR(head,value);
  }

  private Node appendR(Node head, int value) {
    if (head==null) return new Node(value);
    head.next=appendR(head.next, value);
    return head;
  }

  static class Node {
    int value;
    Node next;

    public Node(int value) {
      this.value = value;
      this.next=null;
    }
  }

  Node head;

public void insertAfter(int valueForLookFor,int value){
  Node newNode = new Node(value);
  insertAfterR(head,valueForLookFor, newNode);
}

  private void insertAfterR(Node head,int valueForLookFor, Node newNode) {
  if (head==null)return;
  if (head.value==valueForLookFor){
      newNode.next=head.next;
      head.next=newNode;
    }
    insertAfterR(head.next,valueForLookFor,newNode);
  }

  public void insertBefore(int valueLookFor, int value){
    Node newNode = new Node(value);
    Node prev=null;
    Node curr=head;
    while (curr.value!=valueLookFor){
      prev=curr;
      curr=curr.next;
    }
    newNode.next=curr;
    prev.next=newNode;
  }

  public int length(){
    return lengthR(head);
  }
  public int length_tail(){
    int len=0;
    return length_tailR(len,head);
  }

  private int length_tailR(int len, Node curr) {
    if (curr==null) return len;
    len++;
    return length_tailR(len,curr.next);
  }

  private int lengthR(Node head) {
    if (head==null) return 0;
    return 1+lengthR(head.next);
  }


  void insertAfterIndex(int index, int value){
    Node newNode = new Node(value);
    Node curr = head;
    while (index>1){
      curr = curr.next;
      index--;
    }
    newNode.next=curr.next;
    curr.next=newNode;
  }


  public void prepend(int value){
    Node node = new Node(value);
    node.next=head;
    head=node;
  }


  public String represent(){
    StringJoiner sj = new StringJoiner(",","(",")");
    representR(head,sj);
    return sj.toString();
  }

  public String represent(Node node){
    StringJoiner sj = new StringJoiner(",","(",")");
    representR(node,sj);
    return sj.toString();
  }

  private void representR(Node head,StringJoiner sj) {
    if (head==null)return;
    sj.add(String.valueOf(head.value));
    representR(head.next,sj);
  }


  void test(){
    Node curr = head;
    curr.next.value=8;
  }
  void testPrint(){
    System.out.println(head.next.value);
  }

}

