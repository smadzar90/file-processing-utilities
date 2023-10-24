public class SLinkedList {
    
    private class Node
    {
        String data;
        Node next;
        public Node(String s)
        {
            data = s;
            next = null;
        }
    }
    
    private int length;
    private Node head;
    private Node tail;
    private Node currentPos;
    
    public SLinkedList()
    {
        head = tail = currentPos = null;
        length = 0;
    }
    
    public int lengthIs()
    {
        return length;
    }
    
    public void makeEmpty()
    {
        length = 0;
        head = tail = currentPos = null;
    }
    
    public void addToHead(String s)
    {
        Node newNode = new Node(s);
        newNode.next = head;
        head = newNode;
        length++;
        if(length==1)
            tail = newNode;
    }
    
    public void addToTail(String s)
    {     
        Node newNode = new Node(s);
        if(tail != null)
            tail.next = newNode;
        tail = newNode;
        length++;
        if(length==1) head = newNode;
    }
    
    public void insert(int rank, String s){
        //rank is how many nodes in front of the new nodes
        if(rank<=0)
            addToHead(s);
        else if(rank>=length)
            addToTail(s);
        else
        {
            Node newNode = new Node(s);
            Node current = head;
            for(int i=0;i<rank-1;i++)
                current = current.next;
            newNode.next = current.next;
            current.next = newNode;
            length++;
        }
    }
    public int findRank(String s)
    {
        Node current = head;
        int count = -1;
        boolean found = false;
        
        while(!found&&current!=null)
        {
            count++;
            if(s.equals(current.data))
            {
                found = true;
            }
            else current = current.next;
        }
        if(!found) return -1;
        else return count;
    }
    
    public String deleteFromHead()
    {
        if(length==0)
            return null;
        String temp = head.data;
        head = head.next;
        length--;
        currentPos=null;
        if(length==0)
            tail = null;
        return temp;
    }
    
    public String deleteFromTail()
    {
        if(length<=1)
            return deleteFromHead();
        Node current = head;
        for(int i=0;i<length-2;i++)
            current = current.next;
        String temp = tail.data;
        tail = current;
        tail.next = null;
        length--;
        currentPos = null;
        return temp;
    }
    
    public void reset()
    {
        currentPos = null;
    }
    
    public boolean isLast()
    {
        return currentPos==tail;
    }
    
    public String getNext()
    {
        if(isLast())
            return null;
        else
        {
            if(currentPos==null)
                currentPos = head;
            else currentPos = currentPos.next;
            return currentPos.data;
        }
    }
    
      public String toString()
    {
        String output = "There are "+this.length+" nodes in the linked list\n";
        Node current = head;
        while(current!=null)
        {
            output = output+current.data+'\n';
            current = current.next;
        }
        return output;
    }
}

