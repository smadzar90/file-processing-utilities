public class StackUnlimited {
    private SLinkedList s;
    
    public StackUnlimited()
    {
        s = new SLinkedList();
    }
    
    public boolean isEmpty()
    {
        return s.lengthIs()==0;
    }
    
    public int sizeIs()
    {
        return s.lengthIs();
    }
    
    public void push(String sth)
    {
        s.addToHead(sth);
    }
    
    public String peek()
    {
        if(isEmpty())
            return null;
        s.reset();
        return s.getNext();
    }
    
    public String pop()
    {
        if(isEmpty())
            return null;
        return s.deleteFromHead();
    }
}
