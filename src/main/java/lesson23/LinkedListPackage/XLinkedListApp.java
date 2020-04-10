package lesson23.LinkedListPackage;

public class XLinkedListApp {

    public static void main(String[] args) {
        XLinkedList xLL = new XLinkedList();
        xLL.prepend(5);
        xLL.prepend(7);
        xLL.append(1);
        xLL.append(2);
        xLL.append(3);
        System.out.println(xLL.represent());
        //xLL.insertAfter(3,9);
        //xLL.insertAfterIndex(3,6);
        //xLL.reverse();
//        System.out.println(xLL.length());
        xLL.insertBefore(1,10);
//        System.out.println(xLL.length());
//        System.out.println(xLL.length_tail());
        xLL.insertAfter(2,5);

        System.out.println(xLL.represent());
    }
}
