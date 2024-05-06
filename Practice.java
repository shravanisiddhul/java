import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Practice
{
    static class Edge{
        int src;
        int dest;

        Edge(int s,int d)
        {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[])
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

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void BFS(ArrayList<Edge> graph[],int V,boolean vis[],int start)
    {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while (!q.isEmpty()) {
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

    public static void DFS(ArrayList<Edge> graph[],int curr,boolean vis[])
    {
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false)
            {
                DFS(graph, e.dest, vis);
            }
        }
    }
    public static void main(String args [])
    {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        for(int i=0;i<graph.length;i++)
        {
            System.out.println("Vertex "+i+" is Connected to ");
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e = graph[i].get(j);
                System.out.print("("+e.src+", "+e.dest+")");
            }
            System.out.println();
        }
        boolean vis[] = new boolean[V];
        for(int i=0;i<graph.length;i++)
        {
            if(vis[i] == false)
            {
                DFS(graph, i, vis);
            }
        }

        // DFS(graph, 0, vis);
    }
}