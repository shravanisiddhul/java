import java.util.ArrayList;

public class Practice
{
    static class Edge
    {
        int src;
        int dest;
        int weight;

        Edge(int s,int d,int w)
        {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 5));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 1, 5));
        graph[2].add(new Edge(2, 3, 10));
        graph[2].add(new Edge(2, 0, 2));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, 10));
    }
    public static void main(String argsb[])
    {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);

        for(int i=0;i<graph.length;i++)
        {
            System.out.println("Vertex "+i+" is connected to :");
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e = graph[i].get(j);
                System.out.print("("+e.src+", "+e.dest+", "+e.weight+")");
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}