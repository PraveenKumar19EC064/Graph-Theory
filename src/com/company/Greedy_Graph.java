package com.company;
//to find path using Greedy https://pastebin.pl/view/b87d2fb3
public class Greedy_Graph {
    static int v=7,dest=5;
    static void display(int[][] graph, boolean[] visited){
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
        for (boolean visit:visited) {
            System.out.print(visit);
            System.out.println();
        }
    }
    static int findMin(int graph[][],boolean visited[],int ptr){
        int min=1000,pos=ptr;
        for(int i=0;i< v;i++){
            if(graph[ptr][i]<min && graph[ptr][i]>0 && visited[i]==false){
                min=graph[ptr][i];
                pos=i;
            }
        }
        return pos;
    }
    static void trace(int graph[][],boolean visited[],int ptr){
        int pos=findMin(graph,visited,ptr);
        visited[pos]=true;
        System.out.println("POS = "+pos);
        ptr=pos;
        if(ptr==dest){
            return;
        }
        display(graph,visited);
       trace(graph,visited,ptr);
    }
    public static void main(String[] args) {
        //int graph[][]={{0,4,-1,-1,8},{0,0,8,-1,11}, {0,0,0,2,-1}, {0,0,0,0,7}, {0,0,0,0,0}};
        int graph[][]={{0,2,6,-1,-1,-1,-1},{-1,0,-1,5,-1,-1,-1},{-1,-1,0,8,-1,-1,-1},{-1,-1,-1,0,10,15,-1},{-1,-1,-1,-1,0,6,2},{-1,-1,-1,-1,-1,0,6},{-1,-1,-1,-1,-1,6,0}};
        boolean visited[]=new boolean[v];
        display(graph,visited);
        trace(graph,visited,0);
        display(graph,visited);
    }
}
