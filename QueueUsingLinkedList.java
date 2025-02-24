
// Queue class using Linked List
class QueueUsingLinkedList {
    private Node top, bottom;
    private int size;

    // Constructor to initialize an empty queue
    public QueueUsingLinkedList() {
        this.top = this.bottom = null;
        this.size = 0;
    }

    // Enqueue operation (Insert at bottom)
    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (bottom == null) { // If queue is empty
            top = bottom = newNode;
        } else {
            bottom.next = newNode;   // need to understand
            bottom = newNode;
        }
        size++;
        System.out.println("Enqueued: " + item);
    }

    // Dequeue operation (Remove from top)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = top.data;
        top = top.next;
        if (top == null) { // If queue becomes empty after dequeue
            bottom = null;
        }
        size--;
        System.out.println("Dequeued: " + item);
        return item;
    }

    // Peek operation (Get top element without removing it)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return top.data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get the current size of the queue
    public int getSize() {
        return size;
    }

    // Display queue elements
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = top;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the queue
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.displayQueue(); // Output: 10 20 30

        queue.dequeue();
        queue.displayQueue(); // Output: 20 30

        System.out.println("Top element: " + queue.peek()); // Output: 20
        System.out.println("Queue size: " + queue.getSize()); // Output: 2
    }
}
