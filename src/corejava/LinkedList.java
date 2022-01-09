package corejava;

public class LinkedList {
    Node head;
    Node tail;
    public Node push(int data)
    {
      Node newnode=new Node(data);
      if(head==null)
      {
          head=newnode;
          tail=newnode;
      }
      else
      {
         Node temp=head;
         this.head=newnode;
         newnode.next=temp;

      }

        return newnode;
    }

    public void append(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void inBetween(Node prev,int data)
    {
        Node newNode=new Node(data);
        newNode.next=prev.next;
        prev.next=newNode;


    }

    public void print()
    {

        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node temp=head;
            while (temp!=null)
            {
                System.out.println("--->"+temp.data);
                temp=temp.next;
            }
        }
    }
    public void delHead()
    {
        head=head.next;
    }
    public void popList()
    {
        Node temp;
        temp=head;
        Node temp1=head;
        while (temp!=null)
        {

            if(temp.next==null)
            {
                temp1.next=null;
            }
            temp1=temp;
            temp=temp.next;
        }
    }
    public void search(int data)
    {
        Node temp=head;
        int found=0;
        while (temp!=null)
        {
            if(temp.data == data)
            {
                found=1;
                System.out.println("Item Found");
                break;
            }
            temp=temp.next;
        }
        if(found==0)
        {
            System.out.println("Item Not Found");
        }
    }
    public void searchInsert(int data)
    {
        Node temp=head;
        Node temp1=head;
        int found=0;
        while (temp!=null)
        {
            if(temp.data==data)
            {
                found=1;
                Node newNode=new Node(40);
                newNode.next=temp;
                temp1.next=newNode;

            }
            temp1=temp;
            temp=temp.next;
        }
        if(found==0)
        {
            System.out.println("Item Not Found");
        }
    }
    public void searchDelete(int data)
    {
        Node temp=head;
        Node temp1=head;
        int found=0;
        while (temp!=null)
        {
            if(temp.data == data)
            {
                found=1;
                temp1.next=temp.next;

            }
            temp1=temp;
            temp=temp.next;
        }
        if(found==0)
        {
            System.out.println("Item Not Found");
        }
    }
    public int size()
    {
        Node temp=head;
        int c=0;
        while (temp!=null)
        {
            temp=temp.next;
            c++;
        }
        return c;
    }
    public void sort()
    {
        Node temp=head;
        Node fwd=null;
        while (temp!=null)
        {
            fwd=temp.next;
            while (fwd!=null)
            {
                if(temp.data > fwd.data)
                {

                    int temp2=fwd.data;
                    fwd.data=temp.data;
                    temp.data=temp2;

                }
                fwd=fwd.next;
            }
            temp=temp.next;
        }
    }
}
