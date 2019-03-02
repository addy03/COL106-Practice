class node
{
    private int elem;
    int height;
    node parent = null;
    node left = null;
    node right = null;

    node(int elem, int height)
    {
        this.elem = elem;
        this.height = height;
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
