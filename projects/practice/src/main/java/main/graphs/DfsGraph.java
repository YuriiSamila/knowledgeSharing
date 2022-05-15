package main.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class DfsGraph {

    private int numberOfVertices;
    private LinkedList<Integer> adjacencyLists[];

    public DfsGraph(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        adjacencyLists = new LinkedList[numberOfVertices];
        for (int i = 0; i < numberOfVertices; ++i) {
            adjacencyLists[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adjacencyLists[v].add(w);
    }

    private void createTreeUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adjacencyLists[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                createTreeUtil(n, visited);
            }
        }
    }

    void createTree(int v) {
        boolean visited[] = new boolean[numberOfVertices];
        createTreeUtil(v, visited);
    }

}
