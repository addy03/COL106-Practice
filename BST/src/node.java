class node
{
    private int elem;
    node parent = null;
    node left = null;
    node right = null;

    node(int elem)
    {
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
