package lesson_7;

import java.util.LinkedList;

public class ToFirstPath {
    boolean[] marked;
    int[] edgeTo;
    private int source;

    public ToFirstPath(Graph g, int source) {
        if (source < 0) {
            throw new IllegalArgumentException("source < 0 ");
        }
        if (source > g.getVertexCount() - 1) {
            throw new IndexOutOfBoundsException("source >  vertexCount");
        }
        this.source = source;
        edgeTo = new int[g.getVertexCount()];
        marked = new boolean[g.getVertexCount()];
    }

    public boolean hasPathTo(int dist) {
        if (dist < 0) {
            throw new IllegalArgumentException();
        }
        if (dist > marked.length) {
            throw new IndexOutOfBoundsException();
        }
        return marked[dist];
    }

    public LinkedList<Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

}
