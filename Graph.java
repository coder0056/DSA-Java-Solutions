// java code for Graph implementation of Graph and print adjacent vertices

import java.util.*;

class Graph {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    
    Graph(int V) {
        for(int i=0;i<V;i++) {
            adjList.add(new ArrayList<>());
        }
    }
    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    
    void printAdjacentList() {
        for(int i=0; i < adjList.size(); i++) {
            System.out.print("vertex " + i + " -> ");
            for(int j=0; j<adjList.get(i).size();j++) {
               System.out.print(adjList.get(i).get(j) + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph gr = new Graph(5);
        gr.addEdge(2,1);
        gr.addEdge(4,3);
        gr.addEdge(2,3);
        gr.addEdge(3,1);
        System.out.println("Printed the adjacent vertices of graph ");
        gr.printAdjacentList();
    }
}
