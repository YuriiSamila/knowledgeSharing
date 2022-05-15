package main.graphs;

import main.graphs.primalgorithm.PrimAlgorithm;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        BftGraph graph = new BftGraph(4);
//        graph.addEdge(0,1);
//        graph.addEdge(1,3);
//        graph.addEdge(1,2);
//        graph.addEdge(2,3);
//
//        graph.createTree(0);

//        DfsGraph dfsGraph = new DfsGraph(4);
//        dfsGraph.addEdge(0,1);
//        dfsGraph.addEdge(0,2);
//        dfsGraph.addEdge(1,3);
//
//        dfsGraph.createTree(0);

        //Binary tree search
//        Node node = new Node(10, new Node(8, new Node(6, null, null),
//                new Node(9, null, null)), new Node(12, new Node(11, null, null),
//                new Node(13, null, null)));
//
//        Node result = search(node, 12);
//        System.out.println(result);

        //Binary tree insert
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        /* Let's create following BST
//              50
//           /     \
//          30      70
//         /  \    /  \
//       20   40  60   80 */
//        binarySearchTree.insert(50);
//        binarySearchTree.insert(30);
//        binarySearchTree.insert(20);
//        binarySearchTree.insert(40);
//        binarySearchTree.insert(70);
//        binarySearchTree.insert(60);
//        binarySearchTree.insert(80);
//
//        binarySearchTree.inorder();

        // Prim algorithm
        PrimAlgorithm primAlgorithm = new PrimAlgorithm();
        List<PrimAlgorithm.WeightedEdge> primAlgorithmTree = primAlgorithm.createTree();
        System.out.println(primAlgorithmTree);

    }

}
