class LinkedListSingly {
    Node head;     // head of list
    // Insert a node in begining of list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    // Insert a node at the end of list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;  // returns out of the function
        }
        Node temp;   // if statement is not true then traverse through the list
        for (temp = head; temp.next != null; temp = temp.next){}
        temp.next = newNode;
    }
    // Deleting a node by value
    public void deleteNode(int key) {
        if (head == null) return;   // if list is empty then return
        if (head.data == key) {    // if head has that value
            head = head.next;  // then store head.next value on head
        }
        Node temp;  // if list is not empty and head does not contain key value; then traverse through the list
        for (temp = head; temp.next != null && temp.next.data != key; temp = temp.next){}
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Function to insert a node in the middle
    public void insertInMiddle(int data) {
        Node newNode = new Node(data);
        if (head == null || head.next == null) { // If the list is empty or has 1 node
            newNode.next = head;
            head = newNode;
            return;
        }
    }

    // printing the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ">>");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String a[]){
        LinkedListSingly linkedList = new LinkedListSingly();
        linkedList.insertAtBeginning(40);
        linkedList.insertAtEnd(50);
        linkedList.insertAtEnd(30);
        linkedList.insertAtEnd(60);
        linkedList.deleteNode(50);
        linkedList.printList();
    }
}