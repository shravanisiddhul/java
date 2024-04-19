import java.util.ArrayList;
import java.util.LinkedList;

public class Practice
{
    static class hashMap<K,V>
    {
        private class Node
        {
            K key;
            V value;

            Node(K key,V value)
            {
                this.key = key;
                this.value = value;
            }
        }
        private int n ;
        private int N;
        private LinkedList<Node> buckets[];

        hashMap()
        {
            this.N = 4 ;
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

        public int searchInAll(K key,int bi)
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

        public void rehash()
        {
            LinkedList<Node> oldbuckets[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0;i<N*2;i++)
            {
                LinkedList<Node> ll = buckets[i];
            }

            for(int i=0;i<oldbuckets.length;i++)
            {
                LinkedList<Node> ll = oldbuckets[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node = ll.get(j); 
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key,V value)
        {
            int bi = hashFunction(key);
            int di = searchInAll(key, bi);

            if(di == -1)
            {
                buckets[bi].add(new Node(key, value));
                n++;
            }else{
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n/N;
            if(lambda > 2.0)
            {
                rehash();
            }
        }

        public V get(K key)
        {
            int bi = hashFunction(key);
            int di = searchInAll(key, bi);

            if(di == -1)
            {
               return null;
            }else{
                Node node = buckets[bi].get(di);
                return node.value ;
            }
        }

        public V remove(K key)
        {
            int bi = hashFunction(key);
            int di = searchInAll(key, bi);

            if(di == -1)
            {
               return null;
            }else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value ;
            }
        }

        public boolean isEmpty()
        {
            return n==0;
        }

        public boolean containkey(K key)
        {
            int bi = hashFunction(key);
            int di = searchInAll(key, bi);

            if(di == -1)
            {
               return false;
            }else{
                return true;
            }
        }

        ArrayList<K> keyset()
        {
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0;i< buckets.length;i++)
            {
                LinkedList<Node> ll = buckets[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            } 
            return keys;
        }
    }

    public static void main(String args [])
    {
        hashMap<Integer,String > map = new hashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        ArrayList<Integer> keys = map.keyset();
        for(int i=0;i<keys.size();i++)
        {
            System.out.println(keys.get(i)+" : "+map.get(keys.get(i)));
        }

        map.remove(3);
        System.out.println(map.get(3));

        // ArrayList<Integer> keys = map.keyset();
        for(int i=0;i<keys.size();i++)
        {
            System.out.println(keys.get(i)+" : "+map.get(keys.get(i)));
        }
    }
}