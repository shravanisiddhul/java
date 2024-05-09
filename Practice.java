import java.util.*;
import java.util.Queue;

public class Practice
{
    static class Edge
    {
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

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));


    }

    public static void bfs(ArrayList<Edge> graph[],int V)
    {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];

        q.add(0);

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

    public static void printAllPaths(ArrayList<Edge> graph[],int curr,int target,String path,boolean vis[])
    {
        if(curr == target)
        {
            System.out.println(path);
            return ;
        }

        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest])
            {
                vis[curr] = true;
                printAllPaths(graph, e.dest, target, path+e.dest, vis);
                vis[curr] = false;
            }
        }
    }
    public static void main(String args [])
    {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        for(int i=0;i<graph.length;i++)
        {
            System.out.println("Vretex "+i+" is coonected to : ");
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e = graph[i].get(j);
                System.out.print("("+e.src+", "+e.dest+")");
            }
            System.out.println();
        }
        bfs(graph, V);
        System.out.println();
        
        dfs(graph, 0, new boolean[V]);
        System.out.println();

        System.out.println();
        int src = 0,target = 5;
        printAllPaths(graph, src, target, "0", new boolean[V]);
    }
}