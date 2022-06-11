package com.company;

public class No_Of_Unique_Path {
    static int v=5,dest=4,path=0;
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
    static int findMin(int graph[][],boolean visited[],int ptr,int col){
        int pos=ptr;
        for(int i=col+1;i< v;i++){
            if(graph[ptr][i]>0 && visited[i]==false){
                pos=i;
                return pos;
            }
        }
        return pos;
    }
    static void trace(int graph[][],boolean visited[],int ptr,int col){
        int pos=findMin(graph,visited,ptr,col);
        visited[pos]=true;
        System.out.println("POS = "+pos);
        for(boolean visit:visited){
            System.out.print(visit);
        }
        if(isChecked(visited)){
            path++;
            System.out.println("Paths "+path);
        }

        //display(graph,visited);
        trace(graph,visited,ptr,pos);
    }

    private static boolean isChecked(boolean[] visited) {
        for(boolean visit:visited){
            System.out.print(visited.length);
            if(visit==false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int graph[][]={{0,4,-1,-1,8},{0,0,8,-1,11}, {0,0,0,2,-1}, {0,0,0,0,7}, {0,0,0,0,0}};
       // int graph[][]={{0,2,6,-1,-1,-1,-1},{-1,0,-1,5,-1,-1,-1},{-1,-1,0,8,-1,-1,-1},{-1,-1,-1,0,10,15,-1},{-1,-1,-1,-1,0,6,2},{-1,-1,-1,-1,-1,0,6},{-1,-1,-1,-1,-1,6,0}};
        boolean visited[]=new boolean[v];
        display(graph,visited);
        visited[0]=true;
        trace(graph,visited,0,0);
        display(graph,visited);
    }
}
