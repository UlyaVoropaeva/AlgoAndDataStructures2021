package lesson_7;

public class Main {

    public static void main(String[] args) {
        int vertex = 10;
        Graph graph = new Graph(vertex);

        graph.addEdge(0, 1);
        graph.addEdge(0, 6);
        graph.addEdge(1, 3);
        graph.addEdge(3, 2);
        graph.addEdge(3, 7);
        graph.addEdge(7, 8);
        graph.addEdge(8, 4);
        graph.addEdge(8, 5);
        graph.addEdge(4, 2);
        graph.addEdge(0, 2);
        graph.addEdge(6, 5);
        graph.addEdge(5, 9);

        graph.display();

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        System.out.println("----------------------");
        System.out.println(bfp.hasPathTo(9));
        System.out.println(bfp.pathTo(9));


    }

}
