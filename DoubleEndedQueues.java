// Double-Ended Queue (Deque) using a Doubly Linked List
class DoubleEndedQueues {
    private Node front, rear;
    private int size;

    // Constructor
    public DoubleEndedQueues() {
        front = rear = null;
        size = 0;
    }

    // Insert at front
    public void insertFront(int item) {
        Node newNode = new Node(item);
        if (front == null) { // If deque is empty
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
        System.out.println("Inserted at front: " + item);
    }

    // Insert at rear
    public void insertRear(int item) {
        Node newNode = new Node(item);
        if (rear == null) { // If deque is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
        System.out.println("Inserted at rear: " + item);
    }

    // Delete from front
    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete from front.");
            return -1;
        }
        int item = front.data;
        front = front.next;
        if (front == null) { // If deque becomes empty
            rear = null;
        } else {
            front.prev = null;
        }
        size--;
        System.out.println("Deleted from front: " + item);
        return item;
    }

    // Delete from rear
    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete from rear.");
            return -1;
        }
        int item = rear.data;
        rear = rear.prev;
        if (rear == null) { // If deque becomes empty
            front = null;
        } else {
            rear.next = null;
        }
        size--;
        System.out.println("Deleted from rear: " + item);
        return item;
    }

    // Get front element
    public int getFront() {
        if (isEmpty()) return -1;
        return front.data;
    }

    // Get rear element
    public int getRear() {
        if (isEmpty()) return -1;
        return rear.data;
    }

    // Check if the deque is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display deque elements
    public void displayDeque() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }
        Node temp = front;
        System.out.print("Deque elements (front to rear): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test Deque
    public static void main(String[] args) {
        DoubleEndedQueues deque = new DoubleEndedQueues();

        deque.insertFront(10);
        deque.insertRear(20);
        deque.insertFront(5);
        deque.insertRear(30);
        deque.displayDeque(); // Output: 5 10 20 30

        deque.deleteFront();
        deque.displayDeque(); // Output: 10 20 30

        deque.deleteRear();
        deque.displayDeque(); // Output: 10 20

        System.out.println("Front element: " + deque.getFront()); // Output: 10
        System.out.println("Rear element: " + deque.getRear()); // Output: 20
    }
}
