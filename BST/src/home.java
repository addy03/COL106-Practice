public class home
{
    public static void main(String args[])
    {
        bst x = new bst(10);
        x.AddNode(3);
        x.AddNode(5);
        x.AddNode(1);
        x.AddNode(2);
//        for (int i=6; i<10; i++)
//        {
//            x.AddNode(i);
//        }
        x.DeleteNode(3);
        x.InOrderTraversal(x.get_root());
    }
}
