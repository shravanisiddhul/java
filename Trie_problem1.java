public class Trie_problem1 {

    // Problem : word Break
    static class Node
    {
        Node[] children;
        boolean eow; //end of word
        
        Node()
        {
            children = new Node[26];
            for(int i=0;i<26;i++)
            {
                children[i] = null;
            }

            eow = false;
        }

    }
    static Node root = new Node();

    public static void insert(String word)
    {
        Node curr = root;
        for(int i=0;i<word.length();i++)
        {
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null)
            {
                curr.children[idx] = new Node();
            }

            if(i == word.length()-1)
            {
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    public static boolean search(String key)
    {
        Node curr = root;
        for(int i=0;i<key.length();i++)
        {
            int idx = key.charAt(i) - 'a';

            if(curr.children[idx] == null)
            {
                return false;
            }

            if(i == key.length()-1 && curr.children[idx].eow == false )
            {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
        
    } 
    public static boolean wordbreak(String key)
    {
        if(key.length() == 0)
        {
            return true;
        }

        for(int i=1;i<=key.length();i++)
        {
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);

            if(search(firstPart) && wordbreak(secondPart))
            {
                return true;
            }

        }
        return false;
    }
    public static void main(String args [])
    {
        // 
        String words[] = {"the","a","their","there","any"};
        String key = "theany";

        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }

        System.out.println(wordbreak(key));
    }
}
