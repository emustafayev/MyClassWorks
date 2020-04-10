package lesson26a8.tree;


public class XTreeApp {
    public static void main(String[] args) {
        XTree<Integer,String> tree = new XTree<>();
        tree.add(26,"Farid");
        tree.add(23,"Afgan");
        tree.add(25,"Aygul");
        tree.add(24,"Jeyhun");
        System.out.println(tree.get(26).orElse("Not found"));
        System.out.println(tree.findMin().value);
        tree.remove(233);
        System.out.println(tree.keys());
    }
}
