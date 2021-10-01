package lesson_7;


import java.util.Arrays;
import java.util.LinkedList;

public class Graph {
    private int vertexCount; // количество вершин
    private int edgeCount;   // количество ребер
    private LinkedList<Integer>[] adjList;

    public Graph(int vertexCount) {
        if (vertexCount <= 0) {
            throw new IllegalArgumentException("vertexCount " + vertexCount);
        }
        this.vertexCount = vertexCount;
        adjList = new LinkedList[vertexCount];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public int getEdgeCount() {
        return edgeCount;
    }

    public LinkedList<Integer> getAdjList(int vertex) {
        if (vertexCount < 0 || vertex > vertexCount - 1) {
            throw new IllegalArgumentException("Vertex number can not be negative.");
        }

        return (LinkedList<Integer>) adjList[vertex].clone();
    }

    public void addEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0 || v1 >= vertexCount || v2 >= vertexCount) {
            throw new IllegalArgumentException();
        }
        adjList[v1].add(v2);
        if (v1 != v2) {
            adjList[v2].add(v1);
        }
        edgeCount++;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "vertexCount=" + vertexCount +
                ", edgeCount=" + edgeCount +
                ", adjList=" + Arrays.toString(adjList) +
                '}';
    }

    public void display() {
        display(adjList, adjList.length - 1, edgeCount);
    }

    private String display(LinkedList<Integer>[] newList, int i, int k) {

        if (k == 0) {
            System.out.println("[" + i + "]" + "-->" + newList[i]);
            return "";
        }
        System.out.println("[" + i + "]" + "-->" + newList[i]);
        i = newList[i].getFirst();
        return display(newList, i, k - 2);

    }
}
