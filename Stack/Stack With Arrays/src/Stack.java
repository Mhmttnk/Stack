public class Stack
{
    int dizi[]; //This is array
    int size; //The size of queue
    int indis; //This is index
    public Stack(int size) //The constructive function of class Stack
    {
        this.size=size;
        dizi=new int [size];
        indis=-1;
    }
    void Push(int data) //The method that adds
    {
        if(IsFull())
        {
            System.out.println("The stack is full,the element can not be added");
        }
        else
        {
            indis++;
            dizi[indis]=data;
            System.out.println("The element has been added to the stack:"+dizi[indis]);
        }
    }
    int Pop() //The method that deletes
    {
        if(IsEmpty())
        {
            System.out.println("The stack is empty,there is no element to delete");
            return -1;
        }
        else
        {
            System.out.println("The element has been deleted to from stack");
            return dizi[indis--];
        }
    }
    Boolean IsFull() //The method that checks whether the stack ıs full
    {
        if(indis==size-1)
            return true;
        else
            return false;
    }
    Boolean IsEmpty() //The method that checks whether the stack is empty
    {
        if(indis==-1)    /*return(indis==-1);*/ //It is an abbreviated version of the coding structure on the left
            return true;
        else
            return false;

    }
}
