import java.util.*;
public class Practice
{
    static class Edge
    {
        int src;
        int dest;

        Edge(int s,int d)
        {
            this.src = s ;
            this.dest = d;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[],int V)
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<Edge>();
        }

        for(int i=0;i<V;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                System.out.print(graph[i].add(new Edge(i, j)));
            }
            System.out.println();
        }
    }

    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. od vertices : ");
        int V = sc.nextInt();

        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph,0);

        for(int i=0;i<V;i++)
        {
            for(int j=0;j<graph[i].size();i++)
            {
                Edge e = graph[i].get(j);
                System.out.println("("+e.src+", "+e.dest+")");
            }
            System.out.println();
        }
    }
}