public class bst
{
    private node root;

    public bst(int elem)
    {
        root = new node(elem, 0);
    }

    public node get_root()
    {
        return root;
    }

    public node Search(int s)
    {
        // Time complexity is O(h);
        // Returns the node with value that was searched or returns the leaf node if the value was not found;
        node x = root;
        while (x.left != null || x.right != null)
        {
            if(x.get_data() == s)
            {
                break;
            }
            else if(x.get_data() > s)
            {
                x = x.left;
            }
            else
            {
                x = x.right;
            }
        }

        return x;
    }

    public void seven_node(node x)
    {
        node[] seven;
        if (x)
    }

    public void AddNode(int s)
    {
        //For Binary Search Tree;
        // Time complexity is O(h);
        // New node is always added to the leaf node;
        node x = Search(s);
        if(x.get_data() == s)
        {
            System.out.println("Number already exists.");
        }
        else
        {
            node a = new node(s,0);
            if(x.get_data() < s)
            {
                x.right = a;
            }
            else
            {
                x.left = a;
            }
        }
        x.height += 1;
        while(x == root)
        {
            x = x.parent;
            int max = x.left.height;
            if (x.right.height > x.left.height)
            {
                max = x.right.height;
            }
            x.height = max + 1;
        }
    }

    public void DeleteNode(int s)
    {
        node x = Search(s);
        if(x.left == null && x.right == null)
        {
            // If both children are null;
            if(x == x.parent.left)
            {
                x.parent.left = null;
            }
            else
            {
                x.parent.right = null;
            }
        }
        else if(x.left == null || x.right == null)
        {
            // If only one child is null;
            node a;
            if(x.left == null)
            {
                a = x.right;
            }
            else
            {
                a = x.left;
            }
            if(x == x.parent.left)
            {
                x.parent.left = a;
            }
            else
            {
                x.parent.right = a;
            }
        }
        else
        {
            node a = x.left;
            while (a != null)
            {
                a = a.right;
            }
            int val = a.get_data();
            DeleteNode(a.get_data());
            x.change_elem(val);
        }
    }

    public void InOrderTraversal(node top)
    {
        if (top != null)
        {
            InOrderTraversal(top.left);
            System.out.println(top.get_data());
            InOrderTraversal(top.right);
        }
    }
}
