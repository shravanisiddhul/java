import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class Graph_problem1 {
    // print All possible paths from source to target
   
    static class Edge{
        int src ;
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

    public static void bfs(ArrayList<Edge> graph[] ,int V,boolean vis[],int start)
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

    public static void printAllPrath(ArrayList<Edge> graph[],int curr,String path,int target,boolean vis[])
    {

        // Also called as Modified DFS code
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
                printAllPrath(graph, e.dest, path+e.dest, target, vis);
                vis[curr] = false;
            }
        }
    }
    public static void main(String args [])
    {
         /*     
          1 --- 3
        /      | \
       0       |  5 -- 6
        \      | /
         2 ---- 4

    */
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0,target = 5;
        printAllPrath(graph, src, "0", target, new boolean [V]);
    }

}
