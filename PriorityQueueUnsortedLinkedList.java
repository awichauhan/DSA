// Priority Queue using an unsorted linked list
class PriorityQueueLinkedList {
    private Node front;

    // Constructor
    public PriorityQueueLinkedList() {
        this.front = null;
    }

    // Insert an element (enqueue) in O(1) time
    public void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);
        if (front == null) {   // if queue is empty
            front = newNode;
        } else {
            Node temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; // Insert at the end
        }
        System.out.println("Enqueued: " + data + " (Priority: " + priority + ")");
    }

    // Remove the highest priority element (dequeue) in O(n) time
    public void dequeue() {
        if (front == null) {
            System.out.println("Priority Queue is empty.");
            return;
        }

        // Find the highest priority node
        Node highestPriorityNode = front, prev = null, temp = front, tempPrev = null;
        while (temp != null) {
            if (temp.priority < highestPriorityNode.priority) { // Lower value = higher priority
                highestPriorityNode = temp;
                tempPrev = prev;
            }
            prev = temp;
            temp = temp.next;
        }

        // Remove the highest priority node
        if (tempPrev == null) {
            front = front.next; // If highest priority is the first node
        } else {
            tempPrev.next = highestPriorityNode.next;
        }
        System.out.println("Dequeued: " + highestPriorityNode.data + " (Priority: " + highestPriorityNode.priority + ")");
    }

    // Display the queue
    public void display() {
        if (front == null) {
            System.out.println("Priority Queue is empty.");
            return;
        }
        System.out.print("Priority Queue: ");
        Node temp = front;
        while (temp != null) {
            System.out.print("[" + temp.data + ", P:" + temp.priority + "] -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method to test Priority Queue
    public static void main(String[] args) {
        PriorityQueueLinkedList pq = new PriorityQueueLinkedList();
        pq.enqueue(10, 2);
        pq.enqueue(20, 1);
        pq.enqueue(30, 3);
        pq.enqueue(40, 0);
        pq.display(); // Expected: [10, P:2] -> [20, P:1] -> [30, P:3] -> [40, P:0] -> NULL

        pq.dequeue(); // Removes 40 (highest priority, P:0)
        pq.display(); // Expected: [10, P:2] -> [20, P:1] -> [30, P:3] -> NULL

        pq.dequeue(); // Removes 20 (next highest priority, P:1)
        pq.display(); // Expected: [10, P:2] -> [30, P:3] -> NULL
    }
}
