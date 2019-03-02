public class node
{
    private int elem;
    int height;
    node parent = null;
    node left = null;
    node right = null;

    node(int elem, int height)
    {
        this.height = height;
        this.elem = elem;
    }

    public int get_data()
    {
        return elem;
    }

    public void change_elem(int e)
    {
        elem = e;
    }
}
