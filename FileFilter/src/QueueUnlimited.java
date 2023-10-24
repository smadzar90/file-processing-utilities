/**
 *
 * @author smadzar
 */

public class QueueUnlimited {
    private SLinkedList s;

    public QueueUnlimited()
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
    
    public void enqueue(String str)
    {
        s.addToTail(str);
    }
    
    public String peek()
    {
        if(s.lengthIs()==0)
            return null;
        else return s.getHeadNode().data;
    }
    
    public String dequeue()
    {
        if(s.lengthIs()==0)
            return null;
        String temp = peek();
        s.deleteFromHead();
        return temp;
    }
}
