import java.util.ArrayList;
import java.util.LinkedList;
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

    public static void creategraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 0));

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
        boolean visited[] = new boolean[V];

        q.add(0);

        while(!q.isEmpty())
        {
            int curr = q.remove();
            if(visited[curr] == false)
            {
                System.out.print(curr+" ");
                visited[curr] = true;

                for(int i=0;i<graph[curr].size();i++)
                {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String argsb[])
    {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);

        for(int i=0;i<graph.length;i++)
        {
            System.out.println("Vertex "+i+" is connected to :");
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e = graph[i].get(j);
                System.out.print("("+e.src+", "+e.dest+")");
                System.out.println(" ");
            }
            System.out.println();
        }
        bfs(graph, V);
    }
}