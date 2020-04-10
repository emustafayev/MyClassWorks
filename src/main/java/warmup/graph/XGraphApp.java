package warmup.graph;

public class XGraphApp {
    public static void main(String[] args) {
        XGraph g = new XGraph(17);
        g.add(0, 1);

        g.add(1, 2);

        g.add(2, 4);
        g.add(2, 5);

        g.add(4, 8);
        g.add(4, 9);

        g.add(5, 10);
        g.add(5, 11);

        g.add(3, 6);
        g.add(3, 7);

        g.add(6, 12);

        g.add(7, 13);
        g.add(7, 14);

        g.add(12, 15);

        // cycle - will produce stack overflow in Graph.isConnectedBasic(from, to)
        g.add(6, 16);
        g.add(16, 3);

        XGraphTraverse traverse = new XGraphTraverse(g);
        System.out.println("Unordered: "+traverse.unordered());
        System.out.println("BFS: "+traverse.bfs(0).toString());
        System.out.println("DFS: "+traverse.dfs(1).toString());
        System.out.println("path: "+traverse.path(1,11));
    }
}
