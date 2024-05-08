import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Practice
{
    static class Edge
    {
        int src;
        int dest;

        Edge(int s,int d)
        {
            this.src = s ;
            this.dest = d ;
        }
    }

    public static void create(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 3));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge> graph[], int V,boolean vis[], int start)
    {
        Queue<Integer> q = new LinkedList<>();
        

        q.add(start);

        while(!q.isEmpty())
        {
            int curr = q.remove();
            if(vis[curr] == false)
            {
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i=0;i<graph[curr].size();i++)
                {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[])
    {

        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false)
            {
                dfs(graph, e.dest, vis);
            }
        }
    }
    public static void main(String args [])
    {
        int V = 7;

        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        for(int i=0;i<graph.length;i++)
        {
            System.out.println("Vertex "+i+" is connected is :");
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e = graph[i].get(j);
                System.out.print("("+e.src+" ,"+e.dest+")");
            }
            System.out.println();
        }
        boolean vis[] = new boolean[V];

        for(int i=0;i<V;i++)
        {
            if(vis[i] == false){
                dfs(graph, i,vis);
            }
        }
       
    }
}