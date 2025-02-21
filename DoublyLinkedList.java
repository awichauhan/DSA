public class DoublyLinkedList{
    Node head, tail;

    // Insert at beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    //Insert at End
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){  // we can use (tail == null) for intuitive code design
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Insert after specific node
    public void insertAfter(int key, int data){
        Node temp = head;
        while(temp != null && temp.data != key){
            temp = temp.next;
        }
        if (temp == null){
            System.out.println("key not found");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;
        if(temp.next != null){
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        if(temp == null){
            tail = newNode;
        }
    }

    // Deletion at Beginning
    public void deleteAtBeginning(){
        if(head == null){
            System.out.println("list is empty");
        }
        if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Deletion at End
    public void deleteAtEnd(){
        if(tail == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Deletion of specific node
    public void deleteNode(int key) {
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Key is not present");
            return;
        }
        if (temp == head) {
            deleteAtBeginning();
        } else if (temp == tail) {
            deleteAtEnd();
        } else {
            temp.prev.next = temp.next;  // The previous node’s next should skip temp and point to temp.next
            temp.next.prev = temp.prev;  // The next node’s prev should skip temp and point to temp.prev
        }
    }

        // display list forward
        public void displayForward(){
            Node temp = head;
            System.out.print("Forward list >> ");
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // display list backwards
        public void displayBackward(){
            Node temp = tail;
            System.out.print("Backward list >> ");
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();
        }


    public static void main(String a[]){
        DoublyLinkedList newDLL = new DoublyLinkedList();
        newDLL.insertAtBeginning(20);
        newDLL.insertAtBeginning(40);
        newDLL.insertAtBeginning(60);
        newDLL.insertAtEnd(90);
        newDLL.insertAtEnd(100);

        newDLL.displayForward();
        newDLL.displayBackward();
        newDLL.deleteAtBeginning();
        newDLL.deleteAtEnd();
        newDLL.deleteNode(40);
        newDLL.displayForward();
    }
}