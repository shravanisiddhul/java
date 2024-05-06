
public class Practice
{
    static class Node
    {
        Node children[];
        boolean eow;

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

    public static Node root = new Node();

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
            if(i == key.length()-1 && curr.children[idx].eow == false)
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
            String firstpart = key.substring(0, i);
            String secpart = key.substring(i);

            if(search(firstpart)&&wordbreak(secpart))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean startwith(String prefix)
    {
        Node curr = root;
        for(int i=0;i<prefix.length();i++)
        {
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null)
            {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static int countNode(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int count = 0;
        for(int i=0; i<26; i++)
        {
            if(root.children[i] != null)
            {
                count += countNode(root.children[i]);
            }
        }
        return count + 1;
    }

    public static String ans = "";
    public static void longestword(Node root ,StringBuilder temp)
    {
        if(root == null)
        {
            return ;
        }

        for(int i=0;i<26;i++)
        {
            if(root.children[i] != null && root.children[i].eow == true)
            {
                temp.append((char)(i+'a'));
                if(temp.length() > ans.length())
                {
                    ans = temp.toString();
                }
                longestword(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String args [])
    {
        String str = "mango";
        for(int i=0; i<str.length();i++)
        {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNode(root));
        System.out.println();

        String words[] = {"i","like","love","apple","mango","a","app","ap","appl"};
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }
        System.out.println(search("mango"));
        System.out.println(search("go"));
        System.out.println(search("apple"));
        System.out.println();

        String key = "ilikemango";
        System.out.println(wordbreak(key));

        String prefix = "go";
        System.out.println(startwith(prefix));
        System.out.println();

        longestword(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
