public class Stack
{
    int size; //The size of stack
    int cnt; //Counter
    Node top; //The pointer that holds the top node
    public Stack(int size) //The constructive function of class Stack
    {
        this.size=size;
        cnt=0;
        top=null;
    }
    void Push(int data) //The method that adds
    {
        Node eleman=new Node(data);

        if(IsFull())
        {
            System.out.println("The stack is full,the element can not added...");
        }
        else
        {
            if (IsEmpty())
            {
                top = eleman;
                System.out.println("The first element has been added to the stack:" + top.data);
            }
            else
            {
                eleman.next=top;
                top=eleman;
                System.out.println("The element has been added to the stack:"+ top.data);
            }
            cnt++;
        }
    }
    void Pop() //The method that deletes
    {
        if(IsEmpty())
        {
            System.out.println("The stack is empty,there is no element to delete");
        }
        else
        {
            top=top.next;
            System.out.println("The element has been deleted from the stack");
            cnt--;
        }
    }
    Boolean IsFull() //The method that checks whether the stack ıs full
    {
        if (cnt==size)
            return true;
        else
            return false;
    }
    Boolean IsEmpty()//The method that checks whether the stack ıs empty
    {
        if(cnt==0)
            return true;
        else
            return false;
    }
    void TopGoster() //The method that shows the top node
    {
        if(IsEmpty())
        {
            System.out.println("The stack is empty...");
        }
        else
        {
            System.out.println("The top element of stack:"+top.data);
        }
    }
    void Print() //The method that prints
    {
        if(IsEmpty())
        {
            System.out.println("The stack is empty...");
        }
        else
        {
            Node temp=top;
            System.out.println("Data in The Stack Structure");

            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println("\n");
        }
    }
}
