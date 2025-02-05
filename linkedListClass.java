// creating our own Linked list instead of using java inbuild linked list
class Node    // node contains data and reference to next node
{
    int data;
    Node next; // using next keyword instead of reference

    public Node(int data)
 /* by this while each time node is created(called)
this constructor gets called and adds a reference value as null to that node
     */
    {
        this.data = data;
        next = null;
    }

}
public class linkedListClass {
    Node head = null;

    public void add (int data)
    {
        Node newNode = new Node(data);

        Node current = head;

        if(head == null)
            head = newNode;
        else {
            while(current.next != null)
                current = current.next;
            current.next = newNode;
        }
    }

    public void printValues()
    {
        Node current = head;
        while (current!=null)
        {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
}



