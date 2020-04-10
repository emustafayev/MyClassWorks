package warmup.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class XGraph {
    private final int vertex_count;
    private final List<LinkedList<Integer>> edge;

    public XGraph(int count) {
        this.vertex_count = count;
        this.edge = IntStream.range(0,this.vertex_count)
                .mapToObj(n->new LinkedList<Integer>())
                .collect(Collectors.toList());
    }

    public void add(int from, int to){
        LinkedList<Integer> verticesTo = edge.get(from); //from =>index; edge have list of links(from =>to(vertexes))
        verticesTo.add(to);
    }

    public void remove(int from, int to){
        LinkedList<Integer> vertexTo = edge.get(from);
        Integer shouldDel = to;
        vertexTo.remove(shouldDel);   //remove object shouldDel=>as object;
    }

    public void remove2(int from, int to){
        LinkedList<Integer> vertexTo = edge.get(from);
        vertexTo.remove(to);   //remove object value: to=>as index
    }

    public boolean check(int from, int to){
        LinkedList<Integer> vertexTo = edge.get(from);
        return vertexTo.contains(to);
    }

    public int getVertexCount(){
        return this.vertex_count;
    }

    public List<LinkedList<Integer>> getEdge() {
        return edge;
    }

    public List<Integer> getEdgesFrom(int from){
        return edge.get(from);
    }

}
