import java.util.LinkedList;

public class Practice
{
    static class HashMap<K,V>
    {
        private class Node{
            K key;
            V value;

            Node(K key, V value)
            {
                this.key = key;
                this.value = value;
            }
        }
        private int n ;
        private int N;
        private LinkedList<Node> buckets[];
        
        @SuppressWarnings("unchecked")
        public HashMap()
        {
            this.N = 4;
            this.buckets = new LinkedList[4];

            for(int i=0;i<4;i++)
            {
                buckets[i] = new LinkedList<>();
            }
        }

        public int hashFunction(K key)
        {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        public int searchInLL(K key, int bi)
        {
            LinkedList<Node> ll = buckets[bi];

            for(int i=0;i<ll.size();i++)
            {
                if(ll.get(i).key == key)
                {
                    return i;
                }
            }
            return -1;
        }
        public void put(K key,V value)
        {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(bi == -1)
            {
                buckets[bi].add(new Node(key, value));
                n++;
            }else{
                Node data = buckets[bi].get(di);
                data.value = value;
            }

            double lambda = (double)n/N;
            if(lambda >= 2.0)
            {
                rehash();
            }
        }
        @SuppressWarnings("unchecked")
        public void rehash()
        {
            LinkedList<Practice.HashMap<K, V>.Node>[] oldBucket = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0;i<N*2;i++)
            {
                buckets[i] = new LinkedList<>();
            }

            for(int i=0;i< oldBucket.length;i++)
            {
                LinkedList<Practice.HashMap<K, V>.Node> ll = oldBucket[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node = ll.get(i);
                    put(node.key, node.value);
                }
            }
        }
    }
    @SuppressWarnings("rawtypes")
    public static void main(String args [])
    {
        HashMap<Integer, String > map = new HashMap();
        map.put(1,"Shravani");
        map.put(2, "Mahi");
        map.put(3, "Vijju");
        map.put(4, "Nanda");
        map.put(5, "Shrushti");
    }
}