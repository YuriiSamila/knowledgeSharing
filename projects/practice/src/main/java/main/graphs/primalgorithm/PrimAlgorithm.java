package main.graphs.primalgorithm;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Integer.compare;
import static java.util.Arrays.stream;
import static java.util.Objects.nonNull;
import static java.util.stream.Collectors.toList;

public class PrimAlgorithm {

    public List<WeightedEdge> createTree() {
        WeightedEdge[] weightedEdges = createTestData();
        PriorityQueue<WeightedEdge> priorityQueue = new PriorityQueue<>();
        List<WeightedEdge> result = new ArrayList<>();
        long numberOfNodes = stream(weightedEdges)
                .map(edge -> edge.startNode.value)
                .distinct()
                .count();
        Node endNode = weightedEdges[0].startNode;
        while (result.size() < numberOfNodes - 1) {
            endNode = addToResult(weightedEdges, priorityQueue, result, endNode);
        }
        return result;
    }

    private static Node addToResult(WeightedEdge[] weightedEdges, PriorityQueue<WeightedEdge> priorityQueue,
                                    List<WeightedEdge> result, Node endNode) {
        List<WeightedEdge> startEdges = stream(weightedEdges)
                .filter(edge -> edge.startNode.value == endNode.value)
                .collect(toList());
        startEdges.get(0).startNode.isVisited = true;
        startEdges = startEdges.stream()
                .filter(edge -> !edge.endNode.isVisited)
                .collect(toList());
        priorityQueue.addAll(startEdges);
        boolean isEdgeVisited = true;
        WeightedEdge bestEdge = null;
        while (isEdgeVisited) {
            bestEdge = priorityQueue.poll();
            if (nonNull(bestEdge)) {
                isEdgeVisited = bestEdge.endNode.isVisited;
            }
        }
        result.add(bestEdge);
        return bestEdge.endNode;
    }

    private WeightedEdge[] createTestData() {
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        return new WeightedEdge[]{
                new WeightedEdge(node0, node1, 10),
                new WeightedEdge(node0, node2, 1),
                new WeightedEdge(node0, node3, 4),
                new WeightedEdge(node1, node0, 10),
                new WeightedEdge(node1, node2, 3),
                new WeightedEdge(node1, node4, 0),
                new WeightedEdge(node2, node0, 1),
                new WeightedEdge(node2, node5, 8),
                new WeightedEdge(node2, node1, 3),
                new WeightedEdge(node2, node3, 2),
                new WeightedEdge(node3, node0, 4),
                new WeightedEdge(node3, node5, 2),
                new WeightedEdge(node3, node2, 2),
                new WeightedEdge(node3, node6, 7),
                new WeightedEdge(node4, node1, 0),
                new WeightedEdge(node4, node5, 1),
                new WeightedEdge(node4, node7, 8),
                new WeightedEdge(node5, node2, 8),
                new WeightedEdge(node5, node4, 1),
                new WeightedEdge(node5, node3, 2),
                new WeightedEdge(node5, node6, 6),
                new WeightedEdge(node5, node7, 9),
                new WeightedEdge(node6, node3, 7),
                new WeightedEdge(node6, node7, 12),
                new WeightedEdge(node6, node5, 6),
                new WeightedEdge(node7, node4, 8),
                new WeightedEdge(node7, node5, 9),
                new WeightedEdge(node7, node6, 12)
        };
    }

    public static class WeightedEdge implements Comparable<WeightedEdge> {
        private final Node startNode;
        private final Node endNode;
        private final int cost;

        private WeightedEdge(Node startNode, Node endNode, int cost) {
            this.startNode = startNode;
            this.endNode = endNode;
            this.cost = cost;
        }

        @Override
        public int compareTo(WeightedEdge o) {
            return compare(cost, o.cost);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            WeightedEdge that = (WeightedEdge) o;
            if (cost != that.cost) return false;
            if (!Objects.equals(startNode, that.startNode)) return false;
            return Objects.equals(endNode, that.endNode);
        }

        @Override
        public int hashCode() {
            int result = startNode != null ? startNode.hashCode() : 0;
            result = 31 * result + (endNode != null ? endNode.hashCode() : 0);
            result = 31 * result + cost;
            return result;
        }

        @Override
        public String toString() {
            return "WeightedEdge{" +
                    "startNode=" + startNode +
                    ", endNode=" + endNode +
                    ", cost=" + cost +
                    '}';
        }
    }

    private static class Node {
        private final int value;
        private boolean isVisited;

        private Node(int value) {
            this.value = value;
        }


        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

}
