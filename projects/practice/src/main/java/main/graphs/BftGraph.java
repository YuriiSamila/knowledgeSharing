package main.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class BftGraph {

    private int numberOfVertices;
    private LinkedList<Integer> adjacencyLists[];

    public BftGraph(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        adjacencyLists = new LinkedList[numberOfVertices];
        for (int i = 0; i < numberOfVertices; ++i) {
            adjacencyLists[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adjacencyLists[v].add(w);
    }

    void createTree(int s) {
        //mark all vertices as not visited
        boolean visited[] = new boolean[numberOfVertices];
        //create a queue
        LinkedList<Integer> queue = new LinkedList<>();
        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            // dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");
            // get all adjacent vertices of the dequeued vertex s
            // if an adjacent has not been visited, then mark it visited and enqueue it
            for (int n : adjacencyLists[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

}
