package warmup.graph;

import java.util.*;

public class XGraphTraverse {
    XGraph graph;

    public XGraphTraverse(XGraph graph) {
        this.graph = graph;
    }

    public String unordered() {
        Set<Integer> outcome = new HashSet<>(); //handled duplicate
        for (int i = 0; i <graph.getVertexCount(); i++) {
            List<Integer> edgesFrom = graph.getEdgesFrom(i);
            outcome.addAll(edgesFrom);
        }
        return outcome.toString();
    }

    public LinkedList<Integer> dfs(int from) {
        boolean[] booleans = new boolean[graph.getVertexCount()];
        booleans[11]=true;
        LinkedList<Integer> dfs = dfs(from,
               booleans,
                new LinkedList<Integer>());
        return dfs;

    }

    private LinkedList<Integer> dfs(int curr, boolean[] visited_, LinkedList<Integer> outcome) {
        if (visited_[curr]) return outcome;
        outcome.add(curr);
        visited_[curr]=true;
        List<Integer> children = graph.getEdgesFrom(curr);
        System.out.println(children.toString());
        for (int child:children){
            dfs(child,visited_,outcome);
        }
        return outcome;
    }

    public Optional<Collection<Integer>> path(int from, int to) {
        return Optional.empty();
    }

    public LinkedList<Integer> bfs(int from) {
        LinkedList<Integer> outcome = new LinkedList<>();
        LinkedList<Integer> process_ = new LinkedList<>();
        boolean[] visited_ = new boolean[graph.getVertexCount()];
        process_.add(from);
        visited_[from] = true;
        while (!process_.isEmpty()){
            int curr = process_.poll();
            outcome.add(curr);
            List<Integer> children = graph.getEdgesFrom(curr);
            for (Integer child:children) {
                if (visited_[child]) continue;
                else visited_[child]=true;
                process_.add(child);
            }
        }
        return outcome;
    }
}
